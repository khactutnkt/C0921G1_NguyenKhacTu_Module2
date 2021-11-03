package ss6_ke_thua.bai_tap.lop_point2d_va_point3d;

public class Point3D extends Point2D{
    private float z=0.0f;
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    public Point3D(){}

    public float getZ(){
        return this.z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {this.getX(), this.getY(), this.getZ()};
        return arr;
    }

    public String toString(){
        return "("+this.getX()+","+this.getY()+","+this.getZ()+")";
    }

}
