package ss6_ke_thua.bai_tap.lop_point2d_va_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point2D(){
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = {this.getX(),this.getY()};
        return arr;
    }

    public String toString(){
        return "("+this.getX()+","+this.getY()+")";
    }
}
