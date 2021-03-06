public class Animal {
    public String name;
    public static int count=0;

    public Animal (){


        count++;
        System.out.println("Создано животных: "+count);
    }
    public void run() {
        System.out.println("Животное бежит");
    };
    public void swim () {
        System.out.println("Животное плывет");
    };
}
