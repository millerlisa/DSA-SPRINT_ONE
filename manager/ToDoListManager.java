package manager;

public class ToDoListManager {
    private static final int MAX_USERS = 10;
    private User[] users = new User[MAX_USERS];
    private int userCount = 0;

    public void createUser(String name) {
        if (userCount < MAX_USERS) {
            users[userCount++] = new User(name);
            System.out.println("");
            System.out.println("User created: " + name);
            System.out.println("");
        } else {
            System.out.println("User limit reached.");
        }
    }

    public User getUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equals(name)) {
                return users[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ToDoListManager manager = new ToDoListManager();

        // Create users
        manager.createUser("Jane");
        manager.createUser("Bob");

        // Add tasks to users
        User jane = manager.getUser("Jane");
        if (jane != null) {
            jane.addTask("Buy groceries");
            jane.addTask("Put gas in car");
            jane.addTask("Send invoice");
        }

        User bob = manager.getUser("Bob");
        if (bob != null) {
            bob.addTask("Finish homework");
            bob.addTask("Wash dishes");
            bob.addTask("Put laundry away");
        }

        // Mark task as completed
        if (jane != null) {
            jane.markTaskAsCompleted("Buy groceries");
        }
        if (bob != null) {
            bob.markTaskAsCompleted("Wash dishes");
        }

        // Print all tasks for each user
        if (jane != null) {
            jane.printTasks();
        }
        if (bob != null) {
            bob.printTasks();
        }
        
    }
}
