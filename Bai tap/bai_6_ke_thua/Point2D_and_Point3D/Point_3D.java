package Point2D_and_Point3D;

public class Point_3D extends Point_2D {
    private float z = 0.0f;
    public Point_3D () {
    }
    public Point_3D (float z , float x , float y) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ (float x , float y , float z) {
        setXY(x, y);
        setZ(z);
    }
    public float [] getXYZ () {
        float [] getXYZ = {getX() , getY() , getZ()};
        return getXYZ;
    }
    public String toString () {
        return "hello";
    }
}
