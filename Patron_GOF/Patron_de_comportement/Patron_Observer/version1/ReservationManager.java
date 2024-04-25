import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservationManager {
    private Map<String, List<Client>> clients;

    public ReservationManager() {
        this.clients = new HashMap<>();
    }

    public void addClient(String reservationType, Client client) {
        List<Client> clientList = clients.getOrDefault(reservationType, new ArrayList<>());
        clientList.add(client);
        clients.put(reservationType, clientList);
    }

    public void removeClient(String reservationType, Client client) {
        List<Client> clientList = clients.get(reservationType);
        if (clientList != null) {
            clientList.remove(client);
            clients.put(reservationType, clientList);
        }
    }

    public void cancelReservation() {

        System.out.println("hello");
    }

    public void confirmReservation() {
      
        System.out.println("hello");
    }

    public void publish(Notification notification) {
        String reservationType = extractReservationType(notification.getMessage());
        if (reservationType != null) {
            sendNotification(notification, reservationType);
        }
    }

    private void sendNotification(Notification notification, String reservationType) {
        List<Client> subscribedClients = clients.getOrDefault(reservationType, new ArrayList<>());
        for (Client client : subscribedClients) {
            client.receiveNotification(notification);
        }
    }

    private String extractReservationType(String message) {
        String[] parts = message.split(":");
        if (parts.length >= 2) {
            return parts[1].trim();
        } else {
            return null;
        }
    }
}
