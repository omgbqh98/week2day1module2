package thhethongdoituonghinhhoc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3, 6);
        System.out.println(rectangle);

        rectangle = new Rectangle(2, 9, "yellow", true);
        System.out.println(rectangle);
    }
}
