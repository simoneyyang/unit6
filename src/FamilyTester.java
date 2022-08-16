public class FamilyTester {
    public static void main(String [] args) {
        Yang simeon = new Yang("Simone");
        Yang joellele = new Yang("Joelle");
        Strickland myMom = new Strickland("Jennifer", 50);
        Strickland myAuntCorinne = new Strickland("Corinne", 30);
        Syroid grandmaKay = new Syroid("Kathleen", 70);
        Kissinger jack = new Kissinger("Jack");
        Kissinger david = new Kissinger("David");
        Syroid greatgrandpaPaul = new Syroid("Paul", 20);
        Strickland auntHeather = new Strickland("Heather", 70);

        System.out.println("Simone's actions");
        simeon.setPancakeRecord(50);
        System.out.println(simeon);
        simeon.mispronounceMusk();
        simeon.takeAllTheFood();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Joelle's actions");
        joellele.distracted();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("the Kissinger family's actions");
        System.out.println(jack);
        jack.goHiking();
        david.doesntCook();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(myMom);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("My aunts' actions");
        System.out.println(myAuntCorinne.getName() + "'s hair color: " + myAuntCorinne.getHairColor());
        System.out.println();
        auntHeather.stricklandFamilySaying();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("My aunt is the same as my mom: " + myAuntCorinne.equals(myMom));
        Yang simoneclone = new Yang("Simone");
        simoneclone.setPancakeRecord(50);
        System.out.println("Simone is the same as her clone: " + simoneclone.equals(simeon));
        Strickland joelleclone = new Yang("Joelle");
        System.out.println("Joelle is the same as her clone: " + joelleclone.equals(joellele));

        System.out.println("My great-grandpa Paul is the same as my grandma: " + greatgrandpaPaul.equals(grandmaKay));
    }
}
