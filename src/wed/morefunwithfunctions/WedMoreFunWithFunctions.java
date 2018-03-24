package wed.morefunwithfunctions;

/**
 *
 * @author john
 */
public class WedMoreFunWithFunctions {

    public static void printFoo() {
        System.out.println("Foo");
    }
    
    public static void printFooPrefix(String suffix) {
        System.out.println("Foo" + suffix);
    }
    
    public static void printFooChangeSuffix(String suffix) {
        suffix = "Foo" + suffix;
        System.out.println(suffix);
    }
    
    public static int doubleIt(int x) {
        int doubledValue = x * 2;
        return doubledValue;
    }
    
    public static double doubleIt(double x) {
        return x * 2;
    }
    
    // Can't overload a function by just changing the return type
//    public static int doubleIt(double x) {
//        return (int)(x * 2);
//    }
    
    public static String doubleIt(String x) {
        return x + x;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myInt = 2;
        double myDouble = 2.0;
        String bar = "Bar";

        printFoo();
        printFooPrefix(bar);
        printFooChangeSuffix(bar);
        System.out.println(bar);
        
        System.out.println(doubleIt(myInt));
        System.out.println(doubleIt(myDouble));
        System.out.println(doubleIt("Hi"));
        
        Point p = new Point();
        
        System.out.println(p);
        System.out.println(p.getX());
        
        Point p2 = new Point();
        
        System.out.println(p2);
        System.out.println(p2.getX());
        
        p2.setX(100);
        System.out.println(p.getX());
        System.out.println(p2.getX());
        
        mutatePoint(p);
        
        System.out.println(p.getX());
        System.out.println(p2.getX());
        
        p.setX(5);
        p2.setX(10);
    }
    
    public static void mutatePoint(Point p) {
        p.setX(42);
        Point.setX(p, 42);
    }
    
}

class Point {
    private int x = 2;
    private int y = 4;
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public static void setX(Point p, int x) {
        p.x = x;
    }
}
