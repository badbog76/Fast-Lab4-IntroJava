/**
 * Created by xyz on 20-Mar-17.
 */
public class BMI {
    public static void main(String[] args) {
        double x, y;
        y = SkeletonJava.readDoubleConsole(" Height(m)  = ");
        x = SkeletonJava.readDoubleConsole(" Weight(kg) = ");
        double bmi=x/(y*y);
        if (bmi <= 18.5)
            System.out.println(" UnderWeight");
        else {
            if (bmi <= 24.9)
                System.out.println(" Normal Weight");
            else {
                if (bmi <= 29.9)
                    System.out.println(" OverWeight");
                else
                    System.out.println(" Obesity");

            }
        }
    }
}
