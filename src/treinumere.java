/**
 * Created by xyz on 20-Mar-17.
 */
public class treinumere {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        x=SkeletonJava.readIntConsole(" x = " );
        y=SkeletonJava.readIntConsole(" y = " );
        z=SkeletonJava.readIntConsole(" z = " );
        if (x<y) {
            if (x < z)
                System.out.println(" X este cel mai mic");
            else
                System.out.println(" Z este cel mai mic");
        }
        else {
            if (y<z)
                System.out.println(" Y este cel mai mic");
            else
                System.out.println(" Z este cel mai mic");
            }

    }
}
