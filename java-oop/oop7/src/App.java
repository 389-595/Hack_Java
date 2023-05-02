import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    public static void main(String[] args) throws Exception {
        Point3D p1 = new Point3D(100, 200, 300);
        Point3D p2  = new Point3D(100, 200, 300);
        

        System.out.println(p1.equals(p2));
    }
 
}
