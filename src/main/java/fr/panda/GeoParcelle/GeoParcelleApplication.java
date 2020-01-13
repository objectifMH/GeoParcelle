package fr.panda.GeoParcelle;

import fr.panda.GeoParcelle.dao.UtilisateurRepository;
import fr.panda.GeoParcelle.entities.Utilisateur;
import fr.panda.GeoParcelle.service.IGeoParcelleInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeoParcelleApplication implements CommandLineRunner{
    
        @Autowired
        private IGeoParcelleInitService iGeoParcelleInitService;

	public static void main(String[] args) {
		SpringApplication.run(GeoParcelleApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Début initialisation ...");
        
        iGeoParcelleInitService.initUtilisateur();
        iGeoParcelleInitService.initVille();
        
        iGeoParcelleInitService.initParcelle();
        
        
        System.out.println("Fin init !");
    }

}
