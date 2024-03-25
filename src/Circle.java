public class Circle {

    private double radius;
    private final static double P_I = 3.14;

    public void circlesum(double radius){
        this.radius = radius;
        System.out.println(this.radius*this.radius*P_I);

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.circlesum(8);
    }
}
