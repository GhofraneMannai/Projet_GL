package Patron_Grasp.Patron_indirection.Application_projet;

import java.util.ArrayList;

public class Reservation_Event {
    private ArrayList<String> periode;
    private String etat;
    private double prix;
    private int nbre_place;
    private String detail;

    public Reservation_Event(ArrayList<String> periode, String etat, double prix, int nbre_place, String detail) {
        this.periode = periode;
        this.etat = etat;
        this.prix = prix;
        this.nbre_place = nbre_place;
        this.detail = detail;
    }




    public void setPeriode(ArrayList<String> periode) { this.periode = periode; }
    public void setEtat(String etat) { this.etat = etat; }

    public ArrayList<String> getPeriode() {
        return this.periode;
    }


    public String getEtat() {
        return this.etat;
    }


    public double getPrix() {
        return this.prix;
    }


    public int getNbre_place() {
        return this.nbre_place;
    }


    public String getDetail() {
        return this.detail;
    }

    public void setPrix(double prix) { this.prix = prix; }
    public void setNbre_place(int nbre_place) { this.nbre_place = nbre_place; }
    public void setDetail(String detail) { this.detail = detail; }
}
