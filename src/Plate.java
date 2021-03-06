public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
        if (food <0){
            food =0;
        }
    }
    public void upEat (int n){
        if (food==0){
            food=100;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
