package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getTheTich(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "+this.getHeight()+", which is a subclass of "+super.toString();
    }
}
