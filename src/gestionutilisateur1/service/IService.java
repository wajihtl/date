/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionutilisateur1.service;

import gestionutilisateur1.entity.User;
import java.util.List;

/**
 *
 * @author MSI
 */
public interface IService <T> {
    public void ajouter(T t);
    public void modifier(long id_amodifier,T t);
    public void supprimer(long id);
    public List<T> afficher();
    
}
