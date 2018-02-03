import java.util.Scanner;
public class SegitigaJava {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nilai x = ");
    int x = scan.nextInt();
    System.out.println("\nCetak Segitiga Sama Kaki");
    System.out.println("==========================");
    for(int i=1; i<=x; i++)
    {
      for(int j=x; j>i; j--)
      {
        System.out.print(" ");
      }
      for(int k=1; k<=i; k++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    scan.close(); 
  } 
}