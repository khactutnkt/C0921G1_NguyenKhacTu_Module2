package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public abstract class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    @Override
    public String toString() {
        return "A Shape with color of "+this.getColor()+" and filled: "+this.filled;
    }

}
