package manager;

class User {
    private String name;
    private TaskList toDoList;

    public User(String name) {
        this.name = name;
        this.toDoList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        toDoList.addTask(new Task(description));
    }

    public void markTaskAsCompleted(String description) {
        toDoList.markTaskAsCompleted(description);
    }

    public void printTasks() {
        System.out.println("");
        System.out.println("Tasks for " + name + ":");
        toDoList.printTasks();
    }
}

