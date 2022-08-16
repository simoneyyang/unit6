public class Polymorphism {
    public static void main(String [] args) {
        Cat c = new Cat(true);
        System.out.println(c.getEnergy());
        //c.clean();
        System.out.println(c.getEnergy());
        //c.catNap();
        System.out.println(c.getEnergy());
        //c.eat();
        System.out.println(c.getEnergy());

        //from client classes you cannot access overridden parent functions
        //those are only accessible in parent and child classes

        Cat c2 = new Cat(true);
        Cat c3 = new Cat(true);
        Cat c4 = new Cat(true);
        Cat c5 = new Cat(true);
        Cat c6 = new Cat(true);
        Cat c7 = new Cat(false);

        System.out.println("c is the same as c2: " + c.equals(c2));
        System.out.println("c is the same as c3: " + c.equals(c3));
        System.out.println("c is the same as c4: " + c.equals(c4));
        System.out.println("c is the same as c5: " + c.equals(c5));
        System.out.println("c is the same as c6: " + c.equals(c6));
        System.out.println("c is the same as c7: " + c.equals(c7));

        //in equals() we cast from object to cat,
        //meaning an object can be both things simultaneously

        Object o = new Cat(false);
        //declared type is object, actual type is cat

        //o.catNap();  will not work
        //you can only use and access methods from declared type

        System.out.println(o);
        //^this will run the method from the class closest to the actual type
        //Since the actual type is cat and there's a toString() for cat, it runs that

        //but if you want to use cat exclusive methods you have to cast it as a cat

        //instanceof is a safety check bc if you cast it wrong the program crashes
        if (o instanceof Cat) {
            Cat actualCat = (Cat)o;
            actualCat.catNap();
            System.out.println("actual cat");
            System.out.println(actualCat.getEnergy());
        }

        Animal arthur = new Aardvark();
        //Cat notACat = (Cat)arthur;
        //^the program won't say anything is wrong with this but it will crash when it runs

        Animal [] zoo = new Animal[5];
        zoo[0] = c;
        zoo[1] = c2;
        zoo[2] = arthur;
        zoo[3] = c7;
        zoo[4] = new Animal(50);
        //all objects in zoo are declared as Animal objects,
        //tho they have actual types of cat or aardvark or animal

        for (Animal a: zoo) {
            a.sleep();
            //so since toString was never overridden in Aardvark,
            //aardvark objects will use the Animal toString
            System.out.println(a);

            if (a instanceof Cat) {
                ((Cat)a).hiss();
            }
        }
    }
}
