/**
 * Created by xyz on 20-Mar-17.
 */
public class InmultireIntre2Numere {
    public static void main(String[] args) {
        int x,y;
        x=SkeletonJava.readIntConsole(" X= ");
        y=SkeletonJava.readIntConsole( " Y= ");
        for ( int i=0;i<=10;i++)
            for ( int j=x;j<=y;j++){
                System.out.println(j+"X"+i+"="+j*i);
            }
    }
}
