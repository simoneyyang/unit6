public class Syroid {
    //I'm doing the family tree to about as well as I know it. I don't know it very well.
    //My family is close enough that we can trace a lot of our quirks to certain parts of the family
    //and some traits that didnt get passed on, hence the overriding
    private String name;
    private int record = 0;
    private int cookingSkills;
    public Syroid(String name, int cookingSkills) {
        this.name = name;
        this.cookingSkills = cookingSkills;
    }

    public void setPancakeRecord(int num) {
        record = num;
        if (record <= 5) {
            System.out.println("Shame. The family best is 130. Do better.");
        }
    }
    public int getRecord() {
        return record;
    }
    public int getCookingSkills() {
        return cookingSkills;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Name: " + name + " Syroid" +
                "\nPancake Record: " + record +
                "\nCooking Skills: " + cookingSkills;
    }
    public boolean equals(Object o) {
        if (o instanceof Syroid) {
            Syroid other = (Syroid)o;
            if (this.cookingSkills == other.getCookingSkills() && this.record == other.getRecord() && this.name.equals(other.getName())) {
                return true;
            }
        }
        return false;
    }
}
