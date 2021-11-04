package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Triangle extends Shape {
    private double side1 = 1, side2 = 1, side3 = 1;
    public Triangle(){}
    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double nuaChuVi = this.getPerimeter()/2;
        return Math.sqrt(nuaChuVi*(nuaChuVi-this.side1)*(nuaChuVi-this.side2)*(nuaChuVi-this.side3));
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + this.getColor() +
                ", filled=" + this.isFilled() +
                ", side1=" + this.side1 +
                ", side2=" + this.side2 +
                ", side3=" + this.side3 +
                ", Area=" + this.getArea() +
                ", Perimeter=" + this.getPerimeter() +
                '}';
    }
}
