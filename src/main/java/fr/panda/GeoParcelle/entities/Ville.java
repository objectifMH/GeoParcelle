/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.panda.GeoParcelle.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gtu
 */

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ville {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  
    private String nom;
    private String codePostal;
    
    @OneToMany(mappedBy = "ville")
    private Collection<Parcelle> parcelles; 
    
    
}
