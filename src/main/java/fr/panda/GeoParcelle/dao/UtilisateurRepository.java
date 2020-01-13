/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.panda.GeoParcelle.dao;

import fr.panda.GeoParcelle.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author gtu
 */

@CrossOrigin("*")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
    
}
