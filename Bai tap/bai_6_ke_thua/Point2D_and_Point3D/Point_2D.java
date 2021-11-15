package Point2D_and_Point3D;

public class Point_2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point_2D () {
    }
    public Point_2D (float x , float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float x , float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY () {
        float [] array = {x,y};
        return array;
    }
    public String toString () {
        return "hello";
    }
}
