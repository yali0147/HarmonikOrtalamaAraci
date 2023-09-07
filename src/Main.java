import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Harmonik Ortalama ");

        Scanner imp=new Scanner(System.in);
        System.out.print("Harmonik Ortalaması alınacak 'n' sayısını girin : ");
        int n =imp.nextInt();
       double result=0;

        for (double i=1;i<=n;i++) {
           result+= (1 / i);
        }
        System.out.println("'"+n+"'" +"sayısının Harmonik Ortalaması : " + result);
    }
}