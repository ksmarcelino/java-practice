import java.util.Scanner;

/*public class Operators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: "+ (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
        System.out.println("Remainder: " + (firstNumber % secondNumber));

        input.close();
    }
}

/*public class Operators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double gameScore = 200;

        System.out.print("Enter the points you gathered: ");
        int points = input.nextInt();

        gameScore += points;

        System.out.println(gameScore);

        gameScore -= points;

        System.out.println(gameScore);

        gameScore *= points;

        System.out.println(gameScore);

        gameScore /= points;

        System.out.println(gameScore);

        input.close();
    }
}

public class Operators
{
    public static void main(String[] args)
    {
        int lives = 5;
        System.out.println("Original lives: " + lives);

        lives--;
        System.out.println("Original lives: " + lives);
        lives--;
        System.out.println("Original lives: "+ lives);
        lives++;
        System.out.println("Original lives: " + lives);
    }
}

public class Operators
{
    public static void main(String[] args)
    {
        int age = 19;

        System.out.println(age == 19);
        System.out.println(age != 19);
        System.out.println(age > 18);
        System.out.println(age < 18);
        System.out.println(age >= 19);
        System.out.println(age <= 19);
    }
}

public class Operators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your score: ");
        int score = input.nextInt();

        boolean isAdult = age >= 18;
        boolean isPassing = score >= 75;
        boolean isQualified = isAdult && isPassing;

        System.out.println("\n===== QUALIFICATION RESULT =====\n");
        System.out.println("Adult: " + isAdult);
        System.out.println("Passing: " + isPassing);
        System.out.println("Qualified: " + isQualified);

        input.close();
    }
}*/

public class Operators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Starting score: ");    
        int startingScore = input.nextInt(); 
        System.out.print("Coins collected: ");
        int coins= input.nextInt();
        System.out.print("Damage penalty: ");
        int dmgPenalty = input.nextInt();

        int finalScore = startingScore;

        int coinsCollected = coins * 10;
        finalScore += coinsCollected;

        finalScore -= dmgPenalty;
        finalScore++;

        boolean isPassed = finalScore >= 100;
        boolean noDamage = dmgPenalty == 0;
        boolean rewardEligible = isPassed && coins >= 5;
        boolean evenScore  = finalScore % 2 == 0;

        System.out.println("===== GAME RESULT =====");
        System.out.println("Final Score: " + finalScore);
        System.out.println("Passed: " + isPassed);
        System.out.println("No damage: " + noDamage);
        System.out.println("Reward Eligible: " + rewardEligible);
        System.out.println("Even score: " + evenScore);

        input.close();
    }
}