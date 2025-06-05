package View;

import java.util.Scanner;

public class InputHelper {

    static Scanner scanner = new Scanner(System.in);
    public static int pegarNumeroInt(String texto) {
        int num = -1;
        boolean erro = false;
        do {
            System.out.print(texto);
            try {
                erro = false;
                num = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                erro = true;
                System.out.println("\u001B[31mApenas digite números inteiros\u001B[0m");
            }
        } while (erro);
        return num;
    }

    public static float pegarNumeroFloat(String texto){
        float num = 1.0f;
        boolean erro = false;
        do{
            System.out.print(texto);
            try {
                erro = false;
                num = Float.parseFloat(scanner.nextLine());

            } catch (Exception e){
                erro = true;
                System.out.println("\u001B[31mApenas digite números válidos\u001B[0m");
            }
        } while (erro);
        return num;
    }

    public static double pegarNumeroDouble(String texto){
        double num = 1.0f;
        boolean erro = false;
        do{
            System.out.print(texto);
            try {
                erro = false;
                num = Double.parseDouble(scanner.nextLine());

            } catch (Exception e){
                erro = true;
                System.out.println("\u001B[31mApenas digite números válidos\u001B[0m");
            }
        } while (erro);
        return num;
    }

    public static String lerString(String texto){
        System.out.print(texto);
        String txt = scanner.nextLine();
        return txt;
    }
    public static void InputText(String a) {
        System.out.println(a);
    }

    public static boolean pegarBoolean(String mensagem) {
        while (true) {
            System.out.print(mensagem + " [s/n]: ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.matches("s")) {
                return true;
            }
            else if (input.matches("n")) {
                return false;
            }
            else
                System.out.println("Resposta inválida");
        }
    }

    public static int pegarNumeroNaRange(String texto, int de, int ate){
        int num = -1;
        do {
            num = pegarNumeroInt(texto);
        }while (num < de || num > ate);
        return num;
    }
}
