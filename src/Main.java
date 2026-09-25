import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner daxilet = new Scanner(System.in);
        System.out.print("Birinci ededi daxil et:");
        int eded1= daxilet.nextInt();
        System.out.print("Ikinci ededi daxil et:");
        int eded2 = daxilet.nextInt();

        int cem = eded1 + eded2;
        System.out.println(cem);

    }
}