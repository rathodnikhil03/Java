package castings;

public class ConversionAndCasting {

    public static void main(String[] arg) {

        // Primitive Type Conversion: This involves converting one primitive data type
        // to another, such as converting an int to a double.

        int x = 10;
        double y = (double) x; // conversion from int to double
        System.out.println("Value of y: " + y);

        // Object Conversion: This involves converting an object of one class type to an
        // object of another class type,
        // such as converting a String to an Integer.

        String str = "123";
        int num = Integer.parseInt(str); // conversion from String to int
        System.out.println("Value of num: " + num);

        // Implicit Casting: This involves casting a smaller data type to a larger data
        // type, such as casting an int to a double.

        int a = 10;
        double b = a; // implicit casting from int to double
        System.out.println("Value of y: " + b);

        // Explicit Casting: This involves casting a larger data type to a smaller data
        // type, such as casting a double to an int.

        double c = 10.5;
        int d = (int) c; // explicit casting from double to int
        System.out.println("Value of y: " + d);
    }

}
