public class AnimalClient {
    public static void main(String [] args) {

        Animal a = new Animal(20);
        a.sleep();
        System.out.println(a);

        Aardvark arthur = new Aardvark();
        System.out.println("arthur is cute: " + arthur.getCute());
        arthur.nap();

        //even though toString isn't defined in Aardvark, it calls the parent class' toString, which is defined
        System.out.println(arthur);

        arthur.eat();
        System.out.println(arthur);

        //Animal objects are not inherently Aardvarks, so you can't call Aardvark methods

        arthur.setEnergy(4);
        System.out.println(arthur);

        Animal a2 = new Animal(30);
        Animal a3 = new Animal(31);
        int [] nums = {1, 2, 3};

        System.out.println("a is the same as a2: " + a.equals(a2));
        System.out.println("a is the same as a3: " + a.equals(a3));
        System.out.println("a is the same as nums: " + a.equals(nums));
        System.out.println("a is the same as arthur: " + a.equals(arthur));
        System.out.println("a is the same as dinosaur: " + a.equals("dinosaur"));

        Aardvark arthur2 = new Aardvark(140);
        System.out.println("arthur is the same as arthur 2: " + arthur.equals(arthur2));
    }
}
