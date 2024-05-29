package Patron_Grasp.Patron_indirection.Application_projet;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Gestionnaire_Evenement gestionnaire = new Gestionnaire_Evenement();


        gestionnaire.creerEvenement("Concert", "Musique", "Un grand concert", new Date(), 3, 50.0, new String[]{"Program1"}, new String[]{"Note1"}, new String[]{"Image1"}, 100);

   
        ArrayList<String> periode = new ArrayList<>();
        periode.add("2024-06-01");
        gestionnaire.creerReservation(periode, "En attente", 50.0, 2, "Détails de la réservation");


        Reservation_Event reservation = gestionnaire.getReservations().get(0); 
        gestionnaire.validerReservation(reservation);

        System.out.println("Etat de la réservation: " + reservation.getEtat());
    }
}

