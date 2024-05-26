package Patron_Grasp.Patron_indirection.Application_projet;
import java.util.Date;

import java.util.ArrayList;

public class Gestionnaire_Evenement {
    private ArrayList<Evenement> evenements;
    private ArrayList<Reservation_Event> reservations;

    public Gestionnaire_Evenement() {
        this.evenements = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void creerEvenement(String nom, String type, String description, Date date, int periode, double prix, String[] program, String[] notes, String[] images, int places) {
        Evenement evenement = new Evenement(nom, type, description, date, periode, prix, program, notes, images, places);
        evenements.add(evenement);
    }

    public void modifierEvenement(Evenement evenement, String nom, String type, String description, Date date, int periode, double prix, String[] program, String[] notes, String[] images, int places) {
        evenement.setNom(nom);
        evenement.setType(type);
        evenement.setDescription(description);
        evenement.setDate(date);
        evenement.setPeriode(periode);
        evenement.setPrix(prix);
        evenement.setProgram(program);
        evenement.setNotes(notes);
        evenement.setImages(images);
        evenement.setPlaces(places);
    }

    public void supprimerEvenement(Evenement evenement) {
        evenements.remove(evenement);
    }

    public void creerReservation(ArrayList<String> periode, String etat, double prix, int nbre_place, String detail) {
        Reservation_Event reservation = new Reservation_Event(periode, etat, prix, nbre_place, detail);
        reservations.add(reservation);
    }

    public void modifierReservation(Reservation_Event reservation, ArrayList<String> periode, String etat, double prix, int nbre_place, String detail) {
        reservation.setPeriode(periode);
        reservation.setEtat(etat);
        reservation.setPrix(prix);
        reservation.setNbre_place(nbre_place);
        reservation.setDetail(detail);
    }

    public void annulerReservation(Reservation_Event reservation) {
        reservations.remove(reservation);
    }

    public void validerReservation(Reservation_Event reservation) {
        reservation.setEtat("Validé");
    }


    public ArrayList<Evenement> getEvenements() {
        return this.evenements;
    }

    public void setEvenements(ArrayList<Evenement> evenements) {
        this.evenements = evenements;
    }

    public ArrayList<Reservation_Event> getReservations() {
        return this.reservations;
    }

    public void setReservations(ArrayList<Reservation_Event> reservations) {
        this.reservations = reservations;
    }

}
