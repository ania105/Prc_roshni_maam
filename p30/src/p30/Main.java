package p30;

public class Main {
    public static void main(String[] args) {
        // Autoboxing
        Integer i1 = 10; // autoboxing occurs here
        System.out.println("i1: " + i1);

        // Unboxing
        int num = i1; // unboxing occurs here
        System.out.println("num: " + num);

        // Autoboxing and unboxing in a single expression
        int num2 = 20;
        Integer i2 = num2; // autoboxing occurs here
        int num3 = i2; // unboxing occurs here
        System.out.println("num2: " + num2);
        System.out.println("i2: " + i2);
        System.out.println("num3: " + num3);

        // Autoboxing and unboxing with method arguments and return values
        Integer i3 = getInteger(15);
        System.out.println("i3: " + i3);
        int num4 = i3 * 2;
        System.out.println("num4: " + num4);
    }

    public static Integer getInteger(int num) {
        return Integer.valueOf(num);
    }
}
