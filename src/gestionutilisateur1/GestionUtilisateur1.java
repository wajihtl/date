/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionutilisateur1;

import gestionutilisateur1.entity.Role;
import gestionutilisateur1.entity.User;
import gestionutilisateur1.service.UserService;
import gestionutilisateur1.utils.MyConnexion;
import java.time.LocalDate;
import java.sql.Date;
import java.time.Month;

/**
 *
 * @author MSI
 */
public class GestionUtilisateur1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         UserService us=new UserService();
        Date d =Date.valueOf(LocalDate.of(1920, Month.MARCH, 20));
        User u=new User("wajih","test",d,"test@gmail.com","test","test",56456,"test",Role.ADMIN);
        us.ajouter(u);
        //us.modifier(1, u);
        //us.supprimer(2);
        //System.out.println(us.afficher());
        

    }
    
}
