/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.panda.GeoParcelle.service;

import fr.panda.GeoParcelle.dao.ParcelleRepository;
import fr.panda.GeoParcelle.dao.UtilisateurRepository;
import fr.panda.GeoParcelle.dao.VilleRepository;
import fr.panda.GeoParcelle.entities.Parcelle;
import fr.panda.GeoParcelle.entities.Utilisateur;
import fr.panda.GeoParcelle.entities.Ville;
import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gtu
 */
@Service
@Transactional
public class IGeoParcelleInitServiceImpl implements IGeoParcelleInitService {

    @Autowired
    private VilleRepository villeRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private ParcelleRepository parcelleRepository;

    private int compt = 1;

    @Override
    public void initVille() {
        Stream.of("Montpellier", "Nimes", "Toulouse", "Bordeaux", "Lyon").forEach(nomV -> {
            Ville ville = new Ville();
            ville.setNom(nomV);
            villeRepository.save(ville);

        });

        villeRepository.findAll().forEach(ville -> System.out.println(ville.toString()));
    }

    @Override
    public void initUtilisateur() {
        utilisateurRepository.save(new Utilisateur(null, "Martin", "Einstein", "mestein@gmail.com", "mdp", new Date(), true));
        utilisateurRepository.save(new Utilisateur(null, "Salvatore", "Dali", "sdalo@gmail.com", "mdp", new Date(), true));
        utilisateurRepository.save(new Utilisateur(null, "Momo", "Ali", "malo@yahoo.com", "mdp", new Date(), false));
        utilisateurRepository.save(new Utilisateur(null, "Thiago", "Silva", "omonstro@psg.com", "mdp", new Date(), false));
        utilisateurRepository.save(new Utilisateur(null, "Ginette", "Arida", "garida@msn.com", "mdp", new Date(), false));
        utilisateurRepository.save(new Utilisateur(null, "Louise", "va", "vlouise@martio.fr", "mdp", new Date(), false));
        utilisateurRepository.save(new Utilisateur(null, "Tonali", "Zlatan", "tonali.zlatan@ibra.nor", "mdp", new Date(), true));

        utilisateurRepository.findAll().forEach(utilisateur -> System.out.println(utilisateur.toString()));
    }

    @Override
    public void initParcelle() {

       // Ville v = new Ville();
       // v = villeRepository.findById(2L).get();

        villeRepository.findAll().forEach(ville -> {
            System.out.println(ville);
            for (int i = 0; i < Math.random() * 25; i++) {
                Parcelle parcelle = new Parcelle();
                parcelle.setNom("Parcelle" + ville.getId()+"_"+i);
                parcelle.setDescription("Descr." + ville.getId()+"_"+i);
                parcelle.setDateCreation(new Date());
                parcelle.setSurface((int) (10 + 10000 * Math.random()));
                parcelle.setVille(ville);
                parcelleRepository.save(parcelle);
            }

        });

        

    }

}
