/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.panda.GeoParcelle.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Parcelle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_parcelle;
    private String nom;
    private String description;
    
    private Integer surface;
    private Date dateCreation;
    
    //private double longitude;
    //private double latitude;
    //private double altitude; 
    
    @ManyToOne
    private Ville ville;
    
    //@ManyToOne
    //private Categorie categorie;
    
    
}
