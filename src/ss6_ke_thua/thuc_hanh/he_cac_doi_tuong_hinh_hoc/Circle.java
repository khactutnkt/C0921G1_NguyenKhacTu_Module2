package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        this.radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public String toString(){
        return "A Circle with radius = "+this.getRadius()+", which is a subclass of "+super.toString();
    }
}
