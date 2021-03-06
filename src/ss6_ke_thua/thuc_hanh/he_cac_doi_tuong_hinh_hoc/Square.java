package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setHeight(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public String toString(){
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
