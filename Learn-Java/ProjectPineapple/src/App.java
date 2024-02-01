public class App {
    public static void main(String[] args) throws Exception {
        
        // Can't call methods on primitive variables like 'int'
        int myInt = 7;
        double shoeSize = 10.5;
        char myInitials = 'R';

        double result = myInt * shoeSize;

        // Other primitives
        String myName = "Ricky";

        // Custom method
        burp();
        // Custom method with arguments
        printName(myName, 3);

        // Setting the custom method with return as the result of the variable
        String name = printName(myName, 3);

        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println("These pretzels are making me thirsty!");
        }

        // Calling a custom method from another file
        Cat.dingDong();

        // Creating new Cat objects
        Cat myCat = new Cat();
        // Setting attributes for myCat object
        myCat.name = "Fred";
        myCat.age = 6;

        Cat anotherCat = new Cat();
        anotherCat.name = "Stella";
        anotherCat.age = 5;

        // Print with a method call
        System.out.println(myName.toUpperCase());
    }

    // Private classes can only be called in the same file
    private static void burp() {
        System.out.println("Buuuurrrp");
    }

    // Custom method with a parameter
    // private static void printName(String name, int number) {
    //     // Concatenating the print statement
    //     System.out.println("My name is" + name + number);
    // }
    
    // Custom method with a return
    private static String printName(String name, int number) {

        return "My name is" + name + number;
    }

    // Custom method with if-else statements
//     private static String printName(String name, int number) {
        
//         if (name.equals("Ricky")) {
//             System.out.println("This guy is awesome!");
//         }
//         // Param using equality
//         else if (number == 4) {
//             System.out.println("This guy is okay I guess.");
//         }
//         else {
//             System.out.println("I don't know this guy at all!");
//         }

//         return "My name is" + name + number;
//     }
}
