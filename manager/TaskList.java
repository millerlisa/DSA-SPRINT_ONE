package manager;

class TaskList {
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(String description) {
        Node current = head;
        while (current != null) {
            if (current.task.getDescription().equals(description)) {
                current.task.markAsCompleted();
                System.out.println("Task marked as completed: " + description);
                return;
            }
            current = current.next;
        }
        System.out.println("");
        System.out.println("Task not found: " + description);
    }

    public void printTasks() {
        Node current = head;
        if (current == null) {
            System.out.println("");
            System.out.println("No tasks found.");
            return;
        }
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}

