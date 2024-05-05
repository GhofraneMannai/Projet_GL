// Classe détaillée pour les réservations d'événements

import java.util.List;

public class DetailsEvenement extends DetailsReservation {
    private String lieu;
    private String organisateur;
    private List<String> invitesSpeciaux;

    public DetailsEvenement(String description, String lieu, String organisateur, List<String> invitesSpeciaux) {
        this.description = description;
        this.lieu = lieu;
        this.organisateur = organisateur;
        this.invitesSpeciaux = invitesSpeciaux;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public List<String> getInvitesSpeciaux() {
        return invitesSpeciaux;
    }

    public void setInvitesSpeciaux(List<String> invitesSpeciaux) {
        this.invitesSpeciaux = invitesSpeciaux;
    }
}