import java.util.Scanner;

public class Mudah2 {
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int bilangan, i, pembagi=0;
    boolean prima = true;
    
    System.out.print("Input sebuah angka bulat: ");
    bilangan = input.nextInt();
    
    // 0 dan 1 bukan angka prima
    if (bilangan == 0 || bilangan == 1) {
    prima = false;
    }
    else {
    for (i = 2; i < bilangan; i++) {
        if (bilangan % i == 0) {
        pembagi = i;
        prima = false;
        break;
        }
    }
    }
    
    if (prima)
    System.out.println( bilangan + " adalah angka prima");
    else
    System.out.println( bilangan + " bukan angka prima karena bisa dibagi " + pembagi);
}
}