import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed, ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.getXSpeed();
        this.getYSpeed();
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = getXSpeed();
        arr[1] = getYSpeed();
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed + Arrays.toString(getSpeed())+
                ", ySpeed=" + ySpeed + "speed= " + this.xSpeed+ySpeed+
                '}' + super.toString() ;
    }

    public MovablePoint move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
