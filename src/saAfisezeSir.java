/**
 * Created by xyz on 23-Mar-17.
 */
public class saAfisezeSir {
    public static void main(String[] args) {
        int x,i=0;
        int[] v;
        v=new int[100];
        do {
        x=SkeletonJava.readIntConsole(" X=");
            if (x%2!= 0&&x!=0)
                System.out.println(" numarul este impar ");
            else
                System.out.println(" numarul este par ");
            v[i++]=x;
        }
        while (x!=0);
        for (int j=0;j<i;j++)
            System.out.print( j+" , ");
    }
}
