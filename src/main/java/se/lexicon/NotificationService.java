package se.lexicon;

/**
 * --- EXAMPLE: NOTIFICATION SERVICE ---
 * Showing how we can have different versions of the same action.
 */
public class NotificationService {

    // 1. SIMPLE MESSAGE
    // Use this for a quick message to the console.
    public static void send(String message) {
        System.out.println("Sending Notification: " + message);
    }

    // 2. EMAIL NOTIFICATION (Overloaded)
    // Here we add an email address to the information we send.
    public static void send(String message, String email) {
        System.out.println("Sending Email to " + email + ": " + message);
    }

    // 3. PRIORITY NOTIFICATION (Overloaded)
    // This one uses a whole number (int) for priority.
    public static void send(String message, int priority) {
        System.out.println("Priority [" + priority + "] Notification: " + message);
    }
}
