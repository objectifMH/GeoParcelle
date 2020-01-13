/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.panda.GeoParcelle.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author gtu
 */


public interface IGeoParcelleInitService {
    public void initVille();
    public void initUtilisateur();
    public void initParcelle();
    
    
}
