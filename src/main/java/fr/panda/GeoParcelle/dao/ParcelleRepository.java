/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.panda.GeoParcelle.dao;

import fr.panda.GeoParcelle.entities.Parcelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author gtu
 */

@CrossOrigin("*")
public interface ParcelleRepository extends JpaRepository<Parcelle, Long>{
    
}
