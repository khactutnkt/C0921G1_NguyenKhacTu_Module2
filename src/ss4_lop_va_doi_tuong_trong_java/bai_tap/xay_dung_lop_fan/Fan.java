package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private boolean on;
    private int speed;
    private double radius;
    private String color;
    public Fan(){
        this.speed = SLOW;
        this.radius = 5;
        this.color = "blue";
        this.on = false;
    }
    public boolean getOn(){
        return this.on;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "on=" + this.on +
                "speed=" + this.speed +
                ", radius=" + this.radius +
                ", color='" + this.color + '\'' +
                '}';
    }
}
