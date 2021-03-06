public class Kitty {
    private String name;
    private int appetite;
    private boolean satiety;

    public Kitty(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiety=false;
        p.decreaseFood(appetite);
        if (p.food >0 || p.food > appetite || p.food == appetite){
            satiety=true;
            System.out.println("Кот "+ name + " наелся");
        }else {
            System.out.println("Кот "+name+" не наелся, в тарелке слишком мало еды");

        }

    }
}
