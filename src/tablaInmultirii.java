import java.rmi.server.Skeleton;
public class tablaInmultirii {
    public static void main(String[] args) {
        int numar;
        numar=SkeletonJava.readIntGUI("Dati numarul");
        for(int i=0;i<=10;i++){
            int inmultire=i*numar;
            SkeletonJava.printConsole(i+"X"+numar+"="+inmultire);
            System.out.println();

        }

    }
}
