public class Animal {
    //PROTECTED VARIABLES
    //public, private, protected
    //protected allows public access within class hierarchy but private outside the class hierarchy


    private int energy;

    public Animal(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int e) {
        energy = e;
    }

    public void eat() {
        energy += 5;
    }
    public void sleep() {
        System.out.println("snoooore");
        energy += 10;
    }

    public String toString() {
        return "I have " + energy + " energy";
    }

    //just like how toString() is predefined by Object and overridden,
    //the equals() method should also be set up the same way
    //the parameter should always be an Object
    //which allows you to compare any kind of Object (Strings, arrays, ArrayLists, animals, etc)
    public boolean equals(Object o) {
        //consider animals to be equal when energy is equal
        //bc you get to decide what makes something equal

        if (o instanceof Animal) {
            Animal other = (Animal)o; //cast it as Animal like you would an int
            if (other.getEnergy() == this.energy) {
                return true;
            }
        }

        return false;
    }
}
