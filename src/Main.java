public class Main {
    public static void main(String[] args) {

        Kitty cat = new Kitty("Barsik", 6);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();

        Kitty [] cats = new Kitty[5];
        cats[0]=new Kitty("BOSS", 10);
        cats[1]=new Kitty("BARSIK", 8);
        cats[2]=new Kitty("KOMP0T", 11);
        cats[3]=new Kitty("TOM", 17);
        cats[4]=new Kitty("RIKOLIT", 70);

        for (Kitty c1: cats) {
            c1.eat(plate);
        }
        plate.info();
        plate.upEat(plate.food);
        plate.info();

    }


}

