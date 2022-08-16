public class WarmupClient {

    public static void main(String [] args) {
        Animal yaboi;

        if (Math.random() > 0.5) {
            yaboi = new Animal(20);
        }
        else {
            yaboi = new Cat(false);
        }

        if (yaboi instanceof Cat) {
            Cat realCat = (Cat)yaboi;
            realCat.hiss();
        }
        else {
            yaboi.sleep();
        }
    }
}
