package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char c = 'Z';
        int s = 0xface;
        int i = 012;
        long l = 80L;
        float f = 44e-1f;
        float f2 = 5.5f;
        double d = 8.88e1;
        double d2 = 99.9;

        int sum = s + (int) c + i + (int) l + (int) f + (int) f2 + (int) d + (int) d2;

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x+y);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        int x;
        int y;

        System.out.println("Before Swap:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        x = scanner.nextInt();

        System.out.print("y: ");
        y = scanner.nextInt();

        System.out.println("After Swap:");

        //Swap
        x = x - y;
        y = x + y;
        x = y - x;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scanner.nextInt();

        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("n1 > n2");
        } else if (n2 > n1){
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        int rev;
        String sale;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        rev = scanner.nextInt();

        if(rev <0){
            sale = "Invalid Revenue";
        }
        else if(rev >= 0 && rev < 20000){
            sale = "Poor Sales Revenue";

        } else if (rev >= 20000 && rev < 50000) {
            sale = "Average Sales Revenue";

        } else if (rev >= 50000 && rev < 80000) {
            sale = "Good Sales Revenue";

        } else if (rev >= 80000 && rev < 100000) {
            sale = "Excellent Sales Revenue";

        }else {
            sale = "Invalid Revenue";
        };
        System.out.println(sale);
    }

    //todo Task 8
    public void getCommissionRate(){
        int i;
        double provision;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        i = scanner.nextInt();

        switch (i) {
            case 1:
                provision = 0.01;
                break;
            case 2:
                provision = 0.02;
                break;
            case 3:
                provision = 0.03;
                break;
            case 4:
                provision = 0.04;
                break;
            default:
                provision = 0.00;
                break;
        }
        System.out.println("Your Commission Rate was set to " + provision);
    }

    //todo Task 9
    public void leapyear(){
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        year = scanner.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        int number;
        int t1;
        int t2;
        int t3;

        // Number auf 3 Zeichen begrenzen
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number: ");
            number = scanner.nextInt();
        }while (number < 1 || number > 999);


        //Zahl in einzelne Ziffern zerlegen
        t1 = (number / 100);
        t2 = (number / 10 - t1 * 10);
        t3 = (number - t1 * 100 - t2 * 10);

        // Ziffern verkehrt herum aufbauen
        System.out.println(t3 * 100 +  t2 * 10 + t1);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}