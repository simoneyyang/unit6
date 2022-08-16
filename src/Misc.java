import java.util.ArrayList;

public class Misc {
    public static final int COOL_NUMBER = 9;

    public static void main(String [] args) {
        //ArrayLists can't hold primitive data

        Integer i = 7;
        Integer i2 = 7;

        //THERE ARE CLASSES FOR Integer and Double!!!!!!
        //so that in situations where you NEED an object
        //like in an arraylist, you can use these wrapper classes
        //instead of the primitives!!

        ArrayList<Integer> nums = new ArrayList<Integer>();

        //java will automatically convert between wrapper class and primitive type w/o issue

        nums.add(6);
        nums.add(3);
        nums.add(i);

        Integer i4 = i2;
        i2 = 20;
        System.out.println(i4);
        System.out.println(i2);
        //objects of the wrapper class still act like primitives
        //changing the reference won't update the value
        //because they don't share memory locations (?)

        //Integer has static values for MAX_VALUE and MIN_VALUE
        //these are the max and min values int can hold
        System.out.println(Integer.MAX_VALUE);

        //MAX_VALUE is a public static final int -- it cannot be changed anymore
        //the naming convention is ALL_CAPS
        //final variables are called constants bc they can't change

        Animal a = null;
        //calling a method from a null object wont cause red underline (compile time errors)
        //but when you run the program you will get an error of 'null pointer exception'

        Animal a2 = a;

        //null objects will print as null
        //but that's not the toString
        System.out.println(a);
        System.out.println(a2);
        //each null reference is independent from others
        //so if one object gets instantiated the other stays null
        //as opposed to how objects usually seem to work

        a = new Animal(7);
        System.out.println(a);
        System.out.println(a2);
    }
    public static void printAnimal(Animal a) {
        System.out.println(a.getEnergy());
    }
}
