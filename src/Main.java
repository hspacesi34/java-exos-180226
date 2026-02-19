import com.cda.classe.*;

import java.util.ArrayList;

public class Main {
    void main() {
        //exercice1();
        //exercice2();
        //exercice3();
        //exercice4();
    }

    public static void exercice1(){
        Vehicule voiture = new Vehicule();
        voiture.setNom("Voiture");
        voiture.setNbrRoue(4);
        voiture.setVitesse(200);

        Vehicule moto = new Vehicule();
        moto.setNom("Moto");
        moto.setNbrRoue(2);
        moto.setVitesse(300);

        Vehicule autre = new Vehicule();
        autre.setNom("Autre");
        autre.setNbrRoue(3);
        autre.setVitesse(100);

        System.out.println("Le véhicule : " + voiture.getNom() + " est de type " + voiture.detect());
        System.out.println("Le véhicule : " + moto.getNom() + " est de type " + moto.detect());
        System.out.println("Le véhicule : " + autre.getNom() + " est de type " + autre.detect());

        voiture.boost();
        moto.boost();
        autre.boost();

        System.out.println("Le véhicule : " + voiture.getNom() + " possède une vitesse de : " + voiture.getVitesse() + " km/h.");
        System.out.println("Le véhicule : " + moto.getNom() + " possède une vitesse de : " + moto.getVitesse() + " km/h.");
        System.out.println("Le véhicule : " + autre.getNom() + " possède une vitesse de : " + autre.getVitesse() + " km/h.");
    }

    public static void exercice2(){
        Vehicule voiture = new Vehicule();
        voiture.setNom("Voiture");
        voiture.setNbrRoue(4);
        voiture.setVitesse(200);

        Vehicule moto = new Vehicule();
        moto.setNom("Moto");
        moto.setNbrRoue(2);
        moto.setVitesse(300);

        String vainqueur = voiture.plusRapide(moto);
        int vitesseVainqueur = 0;
        if (voiture.getNom().equals(vainqueur)) {
            vitesseVainqueur = voiture.getVitesse();
        } else {
            vitesseVainqueur = moto.getVitesse();
        }

        System.out.println("Le véhicule le plus rapide est : " + voiture.plusRapide(moto) + " à " + vitesseVainqueur + " km/h.");
    }

    public static void exercice3(){
        Des des = new Des(6);
        Joueur joueur1 = new Joueur("Cédric", des);
        Joueur joueur2 = new Joueur("Axel", des);
        Partie partie = new Partie(joueur1, joueur2, 10);
        partie.lancerPartie();
    }

    public static void exercice4(){
        CompteBancaire alex = new CompteBancaire("Axel", 1000);
        CompteBancaire clovis = new CompteBancaire("Clovis", 1000);
        CompteBancaire marco = new CompteBancaire("Marco", 1000);

        ArrayList<CompteBancaire> comptes = new ArrayList<CompteBancaire>();
        comptes.add(alex);
        comptes.add(clovis);
        comptes.add(marco);

        // Scénario
        try {
            comptes.get(0).retirer(100);
            comptes.get(2).envoyer(300, comptes.get(1));
            comptes.get(0).retirer(1200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        comptes.forEach(compte -> {
            System.out.println("Solde de " + compte.getNom() + " est de " + compte.getSolde());
        });
    }
}
