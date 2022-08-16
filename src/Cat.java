public class Cat extends Animal {
    private int whiskers;
    private boolean fur;
    public Cat (boolean fur) {
        super(10);
        this.fur = fur;
        whiskers = (int)(Math.random()*10 + 10);
    }
    public boolean getFur() {
        //System.out.println("This cat has fur: " + fur);
        return fur;
    }
    public int getWhiskers() {
        //System.out.println("This animal has " + whiskers + " whiskers");
        return whiskers;
    }

    public void clean() {
        setEnergy(-5);
    }
    public void catNap() {
        sleep();
        sleep();
    }

    public void sleep() {
        setEnergy(20);
    }
    public void hiss() {
        System.out.println("HISSSSSSSSSSSSS");
    }
    public void setEnergy(int a) {
        super.setEnergy(getEnergy() + a);
    }

    public boolean equals(Object o) {
        if (o instanceof Cat) {
            Cat other = (Cat)o;
            if (super.equals(other) && other.whiskers==whiskers && other.fur==fur) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "I am cat. I have " + whiskers + " whiskers";
    }
}
