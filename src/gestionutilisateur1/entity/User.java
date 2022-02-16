/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionutilisateur1.entity;

import java.util.Date;

/**
 *
 * @author MSI
 */
public class User {
    
   private long id;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private String email;
    private String username;
    private String password;
    private int numTel;
    private String adresse;
    private Role role;

    public User() {
    }

    public User(String nom, String prenom, Date date_naissance, String email, String username, String password, int numTel, String adresse, Role role) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.email = email;
        this.username = username;
        this.password = password;
        this.numTel = numTel;
        this.adresse = adresse;
        this.role = role;
    }

    public User(long id, String nom, String prenom, Date date_naissance, String email, String username, String password, int numTel, String adresse, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.email = email;
        this.username = username;
        this.password = password;
        this.numTel = numTel;
        this.adresse = adresse;
        this.role = role;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance=" + date_naissance + ", email=" + email + ", username=" + username + ", password=" + password + ", numTel=" + numTel + ", adresse=" + adresse + ", role=" + role + '}'+"\n";
    }
    
    
    
    
}
