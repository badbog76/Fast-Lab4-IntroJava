/**
 * Created by xyz on 18-Mar-17.
 */
public class Exercitii1 {
    public static void main(String[] args) {
        int numar;
        numar=SkeletonJava.readIntConsole("Introduceti un numar");
        if (numar>=0) {
            int patrat=numar*numar;
            SkeletonJava.printConsole("Aici este patratul "+patrat);

        }
        else{
            SkeletonJava.printConsole("Numarul "+numar);
        }
        }
    }

