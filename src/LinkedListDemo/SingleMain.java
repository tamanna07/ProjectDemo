package LinkedListDemo;

public class SingleMain {

    public static void main(String[] args) {




        SingletonDemo firstInstance = SingletonDemo.getInstance();

        firstInstance.doSomething(); // prints out "This class does something"

        System.out.println("\n-------- First Instance Number and Name --------");

        int firstInstanceNumber = firstInstance.getNumber(); // gets the instance number
        String firstInstanceName = firstInstance.getName(); // gets the instance name

        System.out.println("First instance number is: " + firstInstanceNumber); // prints out 5
        System.out.println("First instance name is: " + firstInstanceName); // prints out "Demo"

        System.out.println("\n------- Changing Instance Number and Name -------");
        firstInstance.setNumber(10); // sets the instance number to 10
        firstInstance.setName("Not demo"); // sets the instance name to "Not demo"
        System.out.println("First instance set the number to: " + firstInstance.getNumber() + "\n" +
                "First instance set the name to: " + firstInstance.getName());

        SingletonDemo secondInstance = SingletonDemo.getInstance(); // create a new singleton instance

        int secondInstanceNumber = secondInstance.getNumber(); // gets the instance number
        String secondInstanceName = secondInstance.getName(); // gets the instance name

        System.out.println("\n-------- Second Instance Number and Name --------");

        System.out.println("Second instance number is: " + secondInstanceNumber); // prints out 10 since it was set by the first instance
        System.out.println("Second instance name is: " + secondInstanceName); // prints out "Not Demo" since it was set by the first instance




















    }
}
