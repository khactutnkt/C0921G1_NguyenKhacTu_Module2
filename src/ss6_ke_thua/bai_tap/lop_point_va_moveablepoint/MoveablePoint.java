package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MoveablePoint extends Point{
    private float xSpeed = 0, ySpeed = 0;
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){}

    public float getxSpeed() {
        return this.xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float arr[] = {this.getxSpeed(), this.getySpeed()};
        return arr;
    }

    public String toString(){
        return "("+this.getX()+","+this.getY()+"), speed = ("+this.getxSpeed()+","+this.getySpeed()+")";
    }

    public MoveablePoint move(){
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }
}
