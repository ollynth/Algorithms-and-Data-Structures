import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        // Make a simple form using Scanner for user's input

        // Declare variables
        String name, address, phone, gender;
        int age;
        double income;
        boolean isMarried = false;

        // Decraler Scanner
        Scanner sc = new Scanner(System.in);

        // Get user's input
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your address: ");
        address = sc.nextLine();
        System.out.print("Enter your phone number: ");
        phone = sc.nextLine();
        System.out.print("Enter your gender (male/female): ");
        gender = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your income: ");
        income = sc.nextDouble();
        System.out.print("Are you married? (true/false): ");
        isMarried = sc.nextBoolean();

        // Print the result
        System.out.println("My name is " + name + ", a " + gender + ", living in " + address +
                ", and my phone number is " + phone + ". I am " + age + " years old, " +
                (isMarried ? "married" : "not married") + ", and my income is Rp" + income + ".");

        // Close the scanner
        sc.close();

        // (isMarried ? "married" : "not married")  explanation
            // If isMarried is true, then print "married", otherwise print "not married"
            // it's a ternary operator and equivalent to:
                // if (isMarried) { System.out.println("married"); } 
                // else { System.out.println("not married"); }
    }
}
