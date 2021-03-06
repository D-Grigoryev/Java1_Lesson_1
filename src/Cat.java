public class Cat extends Animal {
    private int maxRun = 100;
    private int distRun;
    private int distSwim;
    public static int count=0;

    public Cat(String _name){
        name =_name;
        count++;
        System.out.println("Создано котов: "+count);
    }


    public void run(int distRun) {
        if (distRun <= maxRun) {
            System.out.println("Кошка " +name+ " пробежала " + distRun + " метров");
        } else {
            System.out.println("Кошка " +name+ " не смогла пробежать " + distRun + " метров и сдохла, берегите животных!!!");
        }
    }
    public void swim() {
        System.out.println("Кошка " +name+ " не умеет плавать");
    }

}

