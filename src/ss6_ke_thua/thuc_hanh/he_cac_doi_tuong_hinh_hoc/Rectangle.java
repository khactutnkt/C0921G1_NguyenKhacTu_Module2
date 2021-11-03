package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Rectangle extends Shape{
    private double width, height;
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return 2*(this.width+this.height);
    }

    public String toString(){
        return "A Rectangle with width = "+this.getWidth()+" and length = "+this.getHeight()+
                ", which is a subclass of "+super.toString();
    }
}
