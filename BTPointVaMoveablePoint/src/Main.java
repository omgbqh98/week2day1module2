public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 7);
        movablePoint = new MovablePoint(4, 2, 7, 9);
        System.out.println(movablePoint.move());
    }

}
