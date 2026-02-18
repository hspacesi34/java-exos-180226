package com.cda.classe;

public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;
    private int nbrTour;
    private int scoreJ1 = 0;
    private int scoreJ2 = 0;

    public Partie(Joueur joueur1, Joueur joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    public void lancerPartie(){
        System.out.println("Joueur 1: " + joueur1.getNom() + " et Joueur 2: " + joueur2.getNom() + " ont lancé une partie de " + nbrTour + " tours!");
        for (int i = 0; i < this.nbrTour; i++) {
            this.joueur1.lancerDes();
            this.joueur2.lancerDes();
            if (this.joueur1.getValeurLance() > this.joueur2.getValeurLance()) {
                this.scoreJ1 += 2;
                System.out.println("Tour " + (i+1) + ": Le joueur " + this.joueur1.getNom() + " a remporté " + " avec un score de " + this.joueur1.getValeurLance() + " vs " + this.joueur2.getValeurLance());
            }
            if (this.joueur2.getValeurLance() > this.joueur1.getValeurLance()) {
                this.scoreJ2 += 2;
                System.out.println("Tour " + (i+1) + ": Le joueur " + this.joueur2.getNom() + " a remporté " + " avec un score de " + this.joueur2.getValeurLance() + " vs " + this.joueur1.getValeurLance());
            }
            if (this.joueur1.getValeurLance() == this.joueur2.getValeurLance()) {
                this.scoreJ1++;
                this.scoreJ2++;
                System.out.println("Tour " + (i+1) + ": Les deux joueurs " + " ont fait égalité " + " avec un score de " + this.joueur1.getValeurLance());
            }
        }
        if (this.scoreJ1 == this.scoreJ2) {
            System.out.println("**Les deux joueurs ont fait égalité avec un score total de " + this.scoreJ1 + "**");
        }
        if (this.scoreJ1 > this.scoreJ2) {
            System.out.println("**Le joueur " + this.joueur1.getNom() + " a gagné avec un score total de " + this.scoreJ1 + " vs " + this.scoreJ2 + "**");
        }
        if (this.scoreJ2 > this.scoreJ1) {
            System.out.println("**Le joueur " + this.joueur2.getNom() + " a gagné avec un score total de " + this.scoreJ2 + " vs " + this.scoreJ1 + "**");
        }
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    public int getScoreJ1() {
        return scoreJ1;
    }

    public void setScoreJ1(int scoreJ1) {
        this.scoreJ1 = scoreJ1;
    }

    public int getScoreJ2() {
        return scoreJ2;
    }

    public void setScoreJ2(int scoreJ2) {
        this.scoreJ2 = scoreJ2;
    }
}
