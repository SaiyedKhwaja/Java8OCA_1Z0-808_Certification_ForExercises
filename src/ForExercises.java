import java.util.Scanner;

public class ForExercises {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        forLargestSmallest();

        forHistogram();

        forAverage();

        twelveDaysOfChristmas();
    }

    private static void twelveDaysOfChristmas() {
        String[] gifts = {
                "A partridge in a pear tree.",
                "Two turtle doves, and A partridge in a pear tree.",
                "Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree.",
                "Twelve drummers drumming, Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves, and A partridge in a pear tree."
        };

        for (int day = 1; day <= 12; day++) {
            System.out.print("On the ");
            switch (day) {
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
            }

            System.out.println("day of Christmas,\nMy true love sent to me: " + gifts[day - 1]);
        }
    }

    private static void forAverage() {
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number. please try again.");
            return;
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            total += num;
        }

        double average = total / n;

        System.out.printf("The average is: %.2f\n", average);
    }

    private static void forHistogram() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void forLargestSmallest() {
        System.out.print("Error: n must be greater than 0: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number. please try again.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number:");
            int num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

    }
}
