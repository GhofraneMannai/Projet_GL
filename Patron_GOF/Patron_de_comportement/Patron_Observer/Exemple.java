import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Interface pour les auditeurs d'événements
interface EventListener {
    // Méthode appelée lorsqu'un événement est notifié
    void update(String filename);
}

// Implémentation de la classe EventManager
class EventManager {
    // Champ privé pour stocker les auditeurs pour différents types d'événements
    private Map<String, List<EventListener>> listeners;

    // Constructeur pour initialiser le HashMap
    public EventManager() {
        this.listeners = new HashMap<>();
    }

    // Méthode pour s'abonner à un type d'événement donné
    public void subscribe(String eventType, EventListener listener) {
        // Si le type d'événement n'existe pas encore dans la carte, on le crée
        listeners.putIfAbsent(eventType, new ArrayList<>());
        // Ajouter le auditeur à la liste des auditeurs pour le type d'événement donné
        listeners.get(eventType).add(listener);
    }

    // Méthode pour se désabonner d'un type d'événement donné
    public void unsubscribe(String eventType, EventListener listener) {
        // Si le type d'événement existe dans la carte, retirer le auditeur de la liste des auditeurs pour ce type d'événement
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).remove(listener);
        }
    }

    // Méthode pour notifier tous les auditeurs abonnés à un type d'événement donné
    public void notify(String eventType, String data) {
        // Si le type d'événement existe dans la carte
        if (listeners.containsKey(eventType)) {
            // Parcourir chaque auditeur abonné au type d'événement donné
            for (EventListener listener : listeners.get(eventType)) {
                // Appeler la méthode update de l'auditeur et passer les données
                listener.update(data);
            }
        }
    }
}

// Classe Editor
class Editor {
    // Champ public pour le gestionnaire d'événements
    public EventManager events;
    // Champ privé pour le fichier
    private File file;

    // Constructeur
    public Editor() {
        this.events = new EventManager();
    }

    // Méthode pour ouvrir un fichier
    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    // Méthode pour enregistrer un fichier
    public void saveFile() {
        // Simulation de l'écriture du fichier
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("File content");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        events.notify("save", file.getName());
    }
}

// Classe LoggingListener
class LoggingListener implements EventListener {
    // Champ privé pour le fichier de journalisation
    private File log;
    // Champ privé pour le message de journalisation
    private String message;

    // Constructeur
    public LoggingListener(String log_filename, String message) {
        this.log = new File(log_filename);
        this.message = message;
    }

    // Méthode pour mettre à jour
    public void update(String filename) {
        // Écriture dans le fichier de journalisation
        try {
            FileWriter writer = new FileWriter(log, true);
            writer.write(String.format(message, filename) + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Classe EmailAlertsListener
class EmailAlertsListener implements EventListener {
    // Champ privé pour l'adresse e-mail
    private String email;
    // Champ privé pour le message d'alerte e-mail
    private String message;

    // Constructeur
    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    // Méthode pour mettre à jour
    public void update(String filename) {
        // Envoi de l'e-mail d'alerte
        System.out.println("Sending email to " + email + ": " + String.format(message, filename));
        // Ici, vous pouvez implémenter le code pour envoyer un e-mail réel
    }
}

// Classe Application
class Application {
    // Méthode de configuration
    public void config() {
        // Création d'un éditeur
        Editor editor = new Editor();

        // Création d'un auditeur de journalisation
        LoggingListener logger = new LoggingListener(
                "/path/to/log.txt",
                "Someone has opened the file: %s");

        // Abonnement de l'auditeur à l'événement "open"
        editor.events.subscribe("open", logger);

        // Création d'un auditeur d'alertes e-mail
        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s");

        // Abonnement de l'auditeur à l'événement "save"
        editor.events.subscribe("save", emailAlerts);
    }
}

// Classe principale
public class Exemple {
    public static void main(String[] args) {
        // Création d'une instance de l'application
        Application app = new Application();
        // Configuration de l'application
        app.config();

        // Exemple d'utilisation de l'éditeur
        Editor editor = new Editor();
        editor.openFile("example.txt");
        editor.saveFile();
    }
}


