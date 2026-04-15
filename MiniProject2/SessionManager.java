import java.util.*;

class Session {
    int id;
    String user;

    Session(int id, String user) {
        this.id = id;
        this.user = user;
    }

    void display() {
        System.out.println("Session ID: " + id + " User: " + user);
    }
}

class Manager {
    ArrayList<Session> sessions = new ArrayList<>();

    void createSession(int id, String user) {
        Session s = new Session(id, user);
        sessions.add(s);
    }

    void removeSession(int id) {
        for (int i = 0; i < sessions.size(); i++) {
            if (sessions.get(i).id == id) {
                sessions.remove(i);
                break;
            }
        }
    }

    void showSessions() {
        for (Session s : sessions) {
            s.display();
        }
    }
}

public class SessionManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        while (true) {
            System.out.println("1.Create 2.Remove 3.Show 4.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                int id = sc.nextInt();
                String user = sc.next();
                manager.createSession(id, user);
            } else if (choice == 2) {
                int id = sc.nextInt();
                manager.removeSession(id);
            } else if (choice == 3) {
                manager.showSessions();
            } else {
                break;
            }
        }
    }
}