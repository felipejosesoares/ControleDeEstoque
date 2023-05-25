import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class AdmDeEstoque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dados de login e senha predefinidos
        String username = "admin";
        String password = "password";

        // Obter dados de entrada do usuário
        System.out.println("------------------------------");
        System.out.print("Digite o nome de usuário: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String inputPassword = scanner.nextLine();

        // Verificar se os dados de login estão corretos
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("------------------------------");
            System.out.println("Login bem-sucedido! Bem-vindo " + username + ".");
        } else {
            System.out.println("------------------------------");
            System.out.println("Login falhou! Nome de usuário ou senha incorretos.");
        }


        Random aleatorio = new Random();
        System.out.println("------------------------------");
        System.out.println("SALDO ATUAL DO ESTOQUE");
        int numeroAlt = aleatorio.nextInt(10);
        switch (numeroAlt) {
            case 0 -> System.out.println("40");
            case 1 -> System.out.println("60");
            case 2 -> System.out.println("80");
            case 3 -> System.out.println("100");
            case 4 -> System.out.println("55");
            case 5 -> System.out.println("93");
            case 6 -> System.out.println("44");
            case 7 -> System.out.println("15");
            case 8 -> System.out.println("76");
            case 9 -> System.out.println("32");
        }
        System.out.println("------------------------------");

        System.out.print("Confirme aqui o número que há no Estoque: ");
        int saldo = scanner.nextInt();
        System.out.println("------------------------------");

        boolean continuar = true;

        while (continuar) {
            System.out.println("Bem-vindo ao Sistema de Estoque \n" +
                    "(DIGITE 1 PARA REPOR | DIGITE 2 PARA RETIRADA): ");
            int entrada = scanner.nextInt();
            if (entrada == 1) {
                System.out.println("------------------------------");
                System.out.println("Quantas peças você irá Repor ao Estoque?");
            } else if (entrada == 2) {
                System.out.println("------------------------------");
                System.out.println("Quantas peças você irá Retirar do Estoque?");
            } else {
                System.out.println("Você digitou a opção errada!");
            }
            System.out.print("Quantidade de peças: ");
            int quantidade = scanner.nextInt();
            System.out.println("------------------------------");

            if (entrada == 1) {
                saldo = saldo + quantidade;
                System.out.println("Você acabou de repor " + quantidade + " peças no Estoque!");
            } else if (entrada == 2) {
                if (saldo >= quantidade) {
                    saldo = saldo - quantidade;
                    System.out.println("Você acabou de retirar " + quantidade + " peças do Estoque");
                    System.out.println("------------------------------");
                } else {
                    System.out.println("\n------------------------------");
                    System.out.println("SALDO INSUFICIENTE!!!");
                    System.out.println("\n------------------------------");
                }
            }
            System.out.println("------------------------------");
            System.out.println("SALDO ATUALIZADO DO ESTOQUE: " + saldo);
            System.out.println("------------------------------");

            System.out.println("Deseja encerrar o sistema? \n(Digite 's' para Continuar ou Digite 'n' Encerrar)");
            String resposta = scanner.next();
                if (!Objects.equals(resposta, "s")) {
                    continuar = false;
            }
        }

        System.out.println("Sistema encerrado");


    }
}
