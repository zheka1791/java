public class Practice1 {
    //Exercise 1
    public static void printEqual(int x1, int x2, int x3) {
        int[] intArray = {x1, x2, x3};
        boolean lessThanZeroFlag = false;
        boolean hasEqualElementsFlag = false;
        boolean isEqualFlag = true;
        int firstElement = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] < 0) {
                lessThanZeroFlag = true;
                break;
            }
            if (intArray[i] != firstElement) {
                isEqualFlag = false;
            }
            for (int j = 0; j < intArray.length; j++) {
                if(i != j && intArray[i] == intArray[j]) {
                    hasEqualElementsFlag = true;
                    break;
                }
            }
        }

        if(lessThanZeroFlag) {
            System.out.println("Invalid Value");
        } else if(isEqualFlag) {
            System.out.println("All numbers are equal");
        } else if(hasEqualElementsFlag) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    //Exercise 2
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return feet * 12 * 2.54 + inches * 2.54;
    }

    //Exercise 3
    public static double area(double radius) {
        if(radius < 0) {
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }

    //Exercise 4
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 60 / 24;
            System.out.println(minutes + " min = " + days / 365 + " y and " + days % 365 + " d");
        }
    }

    //Exercise 5
    public static boolean isCatPlaying (boolean summer, int temperature) {
        return (summer && 25 <= temperature && temperature <= 45) || (!summer && 25 <= temperature && temperature <= 35);
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);

        System.out.println();/////////////////////////////////////////////

        System.out.println("5 inches = " + convertToCentimeters(5) + " centimeters");
        System.out.println("5 feet and 7 inches  = " + convertToCentimeters(5, 7) + " centimeters");

        System.out.println();/////////////////////////////////////////////

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println();/////////////////////////////////////////////

        printYearsAndDays(525600);  //→ should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); //→ should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600);  //→ should print "561600 min = 1 y and 25 d"

        System.out.println();/////////////////////////////////////////////

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}