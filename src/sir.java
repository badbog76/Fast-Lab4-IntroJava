/**
 * Created by xyz on 23-Mar-17.
 */
public class sir {
    public static void main(String[] args) {
        int i, x;
        int[] anArray = {6, 5, 9, 3, 2, 5, 5, 0};
        i = -1 ;
        do {
            i=i+1;
            x=i+1;
            if (anArray[i]%2!= 0)
                System.out.println(" numarul " +x+ " din sir este impar ");
            else
                System.out.println(" numarul " +x+ " din sir este par ");
        }
        while (i < anArray.length);
    }
}


