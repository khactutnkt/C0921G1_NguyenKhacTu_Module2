package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.getRadius(), 2);
    }

    public double getPerimeter(){
        return Math.PI*this.getRadius()*2;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+this.getRadius()+", color: "+this.getColor();
    }

}
