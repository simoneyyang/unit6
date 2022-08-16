//inheritance (extends)
//Aardvark is a child class (subclass) of Animal
//it will inherit (able to use) all public methods and variable of
//its parent class (superclass) Animal

//if you just write out your constructor like this: public class Aardvark extends Animal
//and public Aardvark()
//it shows red
//the first thing you MUST do in the constructor is call super() (the superclass)
//otherwise everything shows up red

public class Aardvark extends Animal {
    private boolean cute;

    public Aardvark() {
        super(10);
        cute = false;
    }

    public Aardvark(int energy) {
        super(energy);
        cute = false;
    }

    public boolean getCute() {
        return cute;
    }

    public void nap() {
        //you can directly call parent class methods in the child class
        sleep();
        sleep();
    }

    //when a circle pops up on the left side, you are overriding a method
    //you can redefine parent class methods by setting up the same method signature (name & parameters)
    //so when you call the method from a child class object, the overridden version is used
    public void setEnergy(int a) {
        //you CANNOT access parent class private variables
        //energy *= a;

        //you must use the public set and get methods
        super.setEnergy(getEnergy() * a);

        //you must specify super. otherwise the program will recursively call the child version
    }

//    public boolean equals(Object o) {
//        if (o instanceof Aardvark) {
//            if ( ((Aardvark) o).getEnergy() == this.getEnergy() && ((Aardvark)o).getCute() == this.cute) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    //this has the same functionality
    public boolean equals(Object o) {
        if (o instanceof Aardvark) {
            Aardvark other = (Aardvark)o;

            //you can call the superclass equals if the super class has multiple instance variables you need to check
            if (super.equals(other) && other.getCute() == cute) {
                return true;
            }
        }
        return false;
    }
}