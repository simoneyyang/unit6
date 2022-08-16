public class Kissinger extends Syroid{
    private boolean likesHiking;
    public Kissinger(String selfname) {
        super(selfname, 0);
        likesHiking = true;
    }

    public void goHiking() {
        System.out.println(getName() + ": *genuinely enjoys hiking for some reason*");
    }
    public void doesntCook() {
        System.out.println(getName() + ": *surprise visits the strickland-yang family for dinner*");
    }

    public String toString() {
        return "Name: " + getName() + " Kissinger" +
                "\nPancake Record: " + getRecord() +
                "\nLikes Hiking: " + likesHiking +
                "\nCooking skills: " + getCookingSkills();
    }
    public boolean equals(Object o) {
        if (o instanceof Kissinger) {
            Kissinger other = (Kissinger) o;
            if (super.equals(other) && this.likesHiking == other.likesHiking) {
                return true;
            }
        }
        return false;
    }
}
