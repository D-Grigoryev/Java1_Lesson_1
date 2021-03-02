public class Main {
    public static void main(String[] args) {
    Animal a1 = new Animal();
    a1.run();
    a1.run();
    Animal a2 = new Animal();
    Dog d1 = new Dog("Vovan");
    Dog d2 = new Dog("BOSS");
    Cat c1 = new Cat("BARSIK");
    Cat c2 = new Cat("MURZIK");
    d1.run(100);
    d1.swim(10);
    c1.run(100);
    c1.swim();
    }
}

