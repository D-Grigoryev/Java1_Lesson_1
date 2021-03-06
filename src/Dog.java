public class Dog extends Animal{
    private int maxRun = 500;
    private int maxSwim = 10;
    private String name;
    private int distRun;
    private int distSwim;
    public static int count=0;

    public Dog(String _name){
        name=_name;
        count++;
        System.out.println("Создано собак: "+count);
    }

    public void run(int distRun) {
        if (distRun <= maxRun) {
            System.out.println("Собака " +name+ " пробежала " + distRun + " метров");
        } else {
            System.out.println("Собака " +name+ "не смогла пробежать " + distRun + " метров и сдохла, берегите животных!!!");
        }
    }


    public void swim(int distSwim) {
        if (distSwim <= maxSwim) {
            System.out.println("Собака " +name+ " проплыла " + distSwim + " метров");
        } else {
            System.out.println("Собака " +name+ "не смогла проплыть " + distSwim + " метров и утонула, берегите животных!!!");
        }
    }
}
