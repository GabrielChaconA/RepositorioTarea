import java.util.Scanner;

class entrega {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero, ml, var;
        numero = sc.nextInt();
        var = numero;
        ml = 1;

        for (int i = 1; i < numero; i++) {
            ml = var * i;
            System.out.print(i + " X ");
            var = ml;

        }
        System.out.print(numero + "= " + ml + " ");

    }
}