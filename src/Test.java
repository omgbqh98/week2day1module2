public class Test {
    private int a;
    private String name = "huynh";

    Test() {

    }
    Test(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void getName() {
         name = "huynh";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setA(int a) {
        this.a = a;
    }



    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
