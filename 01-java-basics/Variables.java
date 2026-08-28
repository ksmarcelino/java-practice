//data types
/*public class Variables
{
    public static void main(String[] args)
    {
        String name = "Karl";
        int age = 19;
        double height = 5.3;
        char section = 'A';
        boolean isStudent = true;

        System.out.println("Hello " + name + "!");
        System.out.println("My age: " + age);
        System.out.println("My height: " + height);
        System.out.println("My section: " + section);
        System.out.println("Am I a student? " + isStudent);
    }
}

// changing variable value
public class Variables
{
    public static void main(String[] args)
    {
        int score = 80;
        
        System.out.println("Original score: " + score);

        score = 95;

        System.out.println("Updated score: " + score);


    }
}

// primitive data types
public class Variables
{
    public static void main(String[] args)
    {
        byte gameLevel = 10;
        short currentYear = 2026;
        long worldPopulation = 8000000000L;
        float bodyTemp = 36.5F;

        System.out.println("Game level: " + gameLevel);
        System.out.println("Current year: " + currentYear);
        System.out.println("World population: " + worldPopulation);
        System.out.println("Body temperature: " + bodyTemp);

    }
}

// variable scope
public class Variables
{
    public static void main(String[] args)
    {
        int outsideValue = 10;

        {
            int insideValue = 20;
            
            System.out.println(outsideValue);
            System.out.println(insideValue);
        }

        System.out.println(outsideValue);
    }
}*/

public class Variables
{
    public static void main(String[] args)
    {
        String studentName = "Dane";
        int age = 20;
        double height = 5.4;
        char section = 'A';
        boolean isEnrolled = true;
        int score = 80;

        System.out.println("Student name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Section: " + section);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Original score: " + score);

        score = 95;

        System.out.println("Updated score: " + score);

        {
            String message = "Profile successfully created.";

            System.out.println(message);
        }


    }
}
