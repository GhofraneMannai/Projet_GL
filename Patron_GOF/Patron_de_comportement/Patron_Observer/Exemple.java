import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


interface EventListener {

    void update(String filename);
}


class EventManager {
    
    private Map<String, List<EventListener>> listeners;

 
    public EventManager() {
        this.listeners = new HashMap<>();
    }

  
    public void subscribe(String eventType, EventListener listener) {
     
        listeners.putIfAbsent(eventType, new ArrayList<>());
      
        listeners.get(eventType).add(listener);
    }

 
    public void unsubscribe(String eventType, EventListener listener) {
        
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).remove(listener);
        }
    }

   
    public void notify(String eventType, String data) {
   
        if (listeners.containsKey(eventType)) {
            
            for (EventListener listener : listeners.get(eventType)) {
               
                listener.update(data);
            }
        }
    }
}


class Editor {
    
    public EventManager events;
   
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

  
    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

   
    public void saveFile() {
       
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


class LoggingListener implements EventListener {
    
    private File log;
    
    private String message;

  
    public LoggingListener(String log_filename, String message) {
        this.log = new File(log_filename);
        this.message = message;
    }


    public void update(String filename) {
       
        try {
            FileWriter writer = new FileWriter(log, true);
            writer.write(String.format(message, filename) + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class EmailAlertsListener implements EventListener {
   
    private String email;
    
    private String message;


    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }


    public void update(String filename) {
      
        System.out.println("Sending email to " + email + ": " + String.format(message, filename));
      
    }
}


class Application {

    public void config() {
  
        Editor editor = new Editor();

       
        LoggingListener logger = new LoggingListener(
                "/path/to/log.txt",
                "Someone has opened the file: %s");


        editor.events.subscribe("open", logger);


        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s");

   
        editor.events.subscribe("save", emailAlerts);
    }
}


public class Exemple {
    public static void main(String[] args) {

        Application app = new Application();

        app.config();

        Editor editor = new Editor();
        editor.openFile("example.txt");
        editor.saveFile();
    }
}


