package com.cda.classe;

public class CompteBancaire {
    private String nom;
    private double solde;

    public CompteBancaire(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public void retirer(double montant) throws Exception {
        if (montant > this.solde) {
            throw new Exception("Solde insuffisant!");
        }
        this.solde -= montant;
        System.out.println(this.nom + " a bien retiré " + montant + " avec solde restant: " + this.solde);
    }

    public void crediter(double montant) {
        this.solde += montant;
        System.out.println(this.nom + " a bien créditer " + montant + " avec nouveau solde: " + this.solde);
    }

    public void envoyer(double montant, CompteBancaire cible) throws Exception {
        if (montant > this.solde) {
            throw new Exception("Solde insuffisant!");
        }
        cible.setSolde(this.solde);
        this.solde -= montant;
        System.out.println(this.nom + " a bien envoyé " + montant + " à " + cible.getNom() + " avec nouveau solde: " + this.solde);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
