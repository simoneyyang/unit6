public class Yang extends Strickland {
    public Yang(String selfname) {
        super(selfname, 70);
    }

    public void distracted() {
        System.out.println(getName() + ": *stares at random thing for a few hours*");
    }
    public void mispronounceMusk() {
        //yang family trait--we all do it and I HATE IT but it's a habit and I can't stop it
        System.out.println(getName() + ": did you hear what Elon Moosk just did");
    }
    public boolean getHeight() {
        //System.out.println("they not tall.");
        return false;
    }

    public String toString() {
        return "Name: " + getName() + " Yang" +
                "\nPancake Record: " + getRecord() +
                "\nTall? " + getHeight() +
                "\nHair color: " + getHairColor() +
                "\nCooking skills: " + getCookingSkills();
    }
    public boolean equals(Object o) {
        if (o instanceof Yang) {
            Yang other = (Yang) o;
            if (super.equals(other) && this.getHeight() == other.getHeight()) {
                return true;
            }
        }
        return false;
    }
}
