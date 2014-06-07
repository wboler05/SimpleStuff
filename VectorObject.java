/* Written by: wboler05, v1.0, June 7, 2014
    I wrote a program that does simple vector operations.  It's not incredibly
    optimized, but it will knock out the basic vectors for 2D and 3D operations.
*/

public class VectorObject {

    
    double x;
    double y;
    double z;
    
    VectorObject() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    VectorObject(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }
    
    VectorObject(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    VectorObject(VectorObject a) {
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
    }
    
    public VectorObject add(VectorObject v) {
        return VectorObject.add(this, v);
    }
    
    public VectorObject subtract(VectorObject v) {
        return VectorObject.subtract(this, v);
    }
    
    public double dot(VectorObject v) {
        return VectorObject.dot(this, v);
    }
    
    public VectorObject cross(VectorObject v) {
        return VectorObject.cross(this, v);
    }
    
    public void scale(double s) {
        VectorObject n = VectorObject.scale(this, s);
        this.x = n.x;
        this.y = n.y;
        this.z = n.z;
    }
    
    public double magnitude() {
        return VectorObject.magnitude(this);
    }
    
    public static double dot(VectorObject a, VectorObject b) {
        return (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
    }
    
    public static VectorObject cross(VectorObject a, VectorObject b) {
        VectorObject cross;
        double detA, detB, detC;
        detA = a.getY() * b.getZ() - a.getZ() * b.getY();
        detB = b.getX() * a.getZ() - a.getX() * b.getZ(); 
        detC = a.getX() * b.getY() - b.getX() * a.getY();
        cross = new VectorObject(detA, detB, detC);
        return cross;
    }
    
    public static VectorObject add(VectorObject a, VectorObject b) {
        VectorObject sum = new VectorObject();
        sum.setX(a.x + b.getX());
        sum.setY(a.y + b.getY());
        sum.setZ(a.z + b.getZ());
        return sum;
    }
    
    public static VectorObject subtract(VectorObject a, VectorObject b) {
        VectorObject sum = new VectorObject();
        sum.setX(a.x - b.getX());
        sum.setY(a.y - b.getY());
        sum.setZ(a.z - b.getZ());
        return sum;
    }
    
    public static double magnitude(VectorObject a) {
        return Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2) + Math.pow(a.z, 2));
    }
    
    public static VectorObject scale(VectorObject a, double scale) {
        a.x *= scale;
        a.y *= scale;
        a.z *= scale;
        return a;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setZ(double z) {
        this.z = z;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public void print(String name) {
        System.out.println(name + ": \t" + this.x + "\t" + this.y + "\t" + this.z);
    }
}