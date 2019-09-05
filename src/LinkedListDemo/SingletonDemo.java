package LinkedListDemo;

public class SingletonDemo {

    private int number;
    private String name;

    // Private constructor
    // This prevents other classes from instantiating this class
    // It can only be instantiated within this class
    private SingletonDemo() {
        this.number = 5;
        this.name = "Demo";
    }

    // Create an instance of the singleton class
    private static SingletonDemo instance = new SingletonDemo();

    // Provide a global point of access to the instance
    public static SingletonDemo getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("This method does something");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
