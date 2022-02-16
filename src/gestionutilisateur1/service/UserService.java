/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionutilisateur1.service;

import gestionutilisateur1.entity.User;
import gestionutilisateur1.entity.Role;
import gestionutilisateur1.utils.MyConnexion;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MSI
 */
public class UserService implements IService<User>{
    Connection cnx;
    public UserService(){
        cnx=MyConnexion.getInstance().getCnx();
        
    }

    @Override
    public void ajouter(User t) {
        try {
            Statement st;
            st=cnx.createStatement();
            String query="INSERT INTO `user`("
                    + "`adresse`, "
                    + "`date_naissance`,"
                    + " `email`, `nom`, `num_tel`, `password`, `prenom`, `role`, `username`)"
                    + " VALUES ('"+t.getAdresse()+"','"+t.getDate_naissance()+"','"+t.getEmail()+"','"+t.getNom()+"','"+t.getNumTel()+"',"
                    + "'"+t.getPassword()+"','"+t.getPrenom()+"','"+t.getRole()+"','"+t.getUsername()+"')";
            st.executeUpdate(query);
            System.out.println("user ajouter avec success");
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(long id_amodifier, User t) {
        try {
            PreparedStatement st;
            st=cnx.prepareStatement(
                    "UPDATE `user` SET `adresse`=?,`date_naissance`=?,"
                            + "`email`=?,`nom`=?,`num_tel`=?,"
                            + "`password`=?,`prenom`=?,"
                            + "`role`=?,`username`=? WHERE id=?");
            st.setString(1, t.getAdresse());
            st.setDate(2,new java.sql.Date(t.getDate_naissance().getTime()));
            st.setString(3,t.getEmail());
            st.setString(4,t.getNom());
            st.setInt(5, t.getNumTel());
            st.setString(6, t.getPassword());
            st.setString(7, t.getPrenom());
            st.setString(8, t.getRole().toString());
            st.setString(9, t.getUsername());
            st.setLong(10, id_amodifier);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void supprimer(long id) {
        try {
            Statement st=cnx.createStatement();
            String query="delete from user where id="+id;
            st.executeUpdate(query);
            System.out.println("suppression avec success");
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> afficher() {
        List<User> lu=new ArrayList<>();
        try {
            
            Statement st=cnx.createStatement();
            String query="select * from user";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                User u =new User();
                u.setAdresse(rs.getString("adresse"));
                u.setDate_naissance(rs.getDate("date_naissance"));
                u.setEmail(rs.getString("email"));
                u.setId(rs.getLong("id"));
                u.setNom(rs.getString("nom"));
                u.setNumTel(rs.getInt("num_tel"));
                u.setPassword(rs.getString("password"));
                u.setPrenom(rs.getString("prenom"));
                u.setUsername(rs.getString("username"));
                u.setRole(Role.valueOf(rs.getString("role")));
                lu.add(u);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lu;
        
    }

    
    
}
