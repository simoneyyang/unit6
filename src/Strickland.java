public class Strickland extends Syroid{
    private String hairColor;
    public Strickland(String selfname, int cookingSkills) {
        super(selfname, cookingSkills);
        hairColor = "brown";
    }

    public void takeAllTheFood() {
        System.out.println(getName() + ": you can't keep a Strickland from her food");
    }
    public void stricklandFamilySaying() {
        System.out.println("<read in strong southern accent>");
        System.out.println("War booty?");
        System.out.println("We prefer to call those 'recently acquired family heirlooms'");
    }
    public boolean getHeight() {
        //System.out.println("They tall.");
        return true;
    }
    public String getHairColor() {
        return hairColor;
    }
    public String toString() {
        return "Name: " + getName() + " Strickland" +
                "\nPancake Record: " + getRecord() +
                "\nTall? " + getHeight() +
                "\nHair color: " + hairColor +
                "\nCooking skills: " + getCookingSkills();
    }
    public boolean equals(Object o) {
        if (o instanceof Strickland) {
            Strickland other = (Strickland) o;
            if (super.equals(other) && this.hairColor == other.hairColor) {
                return true;
            }
        }
        return false;
    }
}
