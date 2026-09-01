/*import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();
        System.out.print("Are you enrolled? (true/false): ");
        boolean isEnrolled = input.nextBoolean();
        System.out.print("Enter your section: ");
        char section = input.next().charAt(0);

        System.out.println("Hello, " + name + "!");
        System.out.println("Your age is: " + age);
        System.out.println("Height: " + height);
        System.out.println("Course: " + course);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Section: " + section);

        input.close();
    }
}*/

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Your rating: ");
        double rate = input.nextDouble();

        input.nextLine();

        System.out.print("Enter your username: ");
        String username = input.nextLine();
        System.out.print("Is your account subscribe in premium? (true/false): ");
        boolean isPremium = input.nextBoolean();
        System.out.print("Enter you current rank: ");
        char rank = input.next().charAt(0);

        System.out.println("\n===== PLAYER PROFILE =====");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rating: " + rate);
        System.out.println("Username: " + username);
        System.out.println("Premium: " + isPremium);
        System.out.println("Rank: " + rank);

        input.close();
    }
}
