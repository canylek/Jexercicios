
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int dia1, dia2, hora1, hora2, minuto1, minuto2, segundo1, segundo2, diff_dias,  resultados;
        double quoeficiente, resto,diff_seg, diff_h, horas, resultado_h, resultado_d, resultado_m;
        String dia;

        dia = sc.next();
        dia1 = sc.nextInt();
        sc.nextLine();

        hora1 = sc.nextInt();
        dia = sc.next();
        minuto1 = sc.nextInt();
        dia = sc.next();
        segundo1 = sc.nextInt();

        dia = sc.next();
        dia2 = sc.nextInt();
        sc.nextLine();

        hora2 = sc.nextInt();
        dia = sc.next();
        minuto2 = sc.nextInt();
        dia = sc.next();
        segundo2 = sc.nextInt();

        segundo1 = segundo1 + (minuto1 * 60) + (hora1 * 3600);
        segundo2 = segundo2 + (minuto2 * 60) + (hora2 * 3600);
        diff_seg = segundo2 - segundo1;
        diff_dias = dia2 - dia1;
        diff_h = diff_seg / 3600;
        horas = (diff_dias * 24) + diff_h;

        resto = horas;
        resultado_d = horas / 24;
        resultados = (int) resultado_d;
        System.out.println(resultados + " dia(s)");
        resto = resto % 24;

        quoeficiente = resto * 3600;

        resultado_h = quoeficiente / 3600;
        resultados = (int) resultado_h;
        System.out.println(resultados + " hora(s)");

        resultado_m = (quoeficiente % 3600) / 60;
        resultados = (int) resultado_m;
        System.out.println(resultados + " minuto(s)");

        resto = quoeficiente % 60;
        System.out.println((int) resto + " segundo(s)");

        sc.close();
        }
    }