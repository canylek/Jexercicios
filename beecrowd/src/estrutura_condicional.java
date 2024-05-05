import java.util.Locale;
import java.util.Scanner;

public class estrutura_condicional {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double conta = 50.00;
        int min = sc.nextInt();

        if (min > 100){
            conta += (min - 100) * 2;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        int x = sc.nextInt();
        String dia;
        switch (x) {
            case 1 -> dia = "domingo";
            case 2 -> dia = "segunda";
            case 3 -> dia = "terca";
            case 4 -> dia = "quarta";
            case 5 -> dia = "quinta";
            case 6 -> dia = "sexta";
            case 7 -> dia = "sabado";
            default -> dia = "valor invalido";
        }
        System.out.println("Dia da semana: " + dia);

        sc.close();
        }

    }
