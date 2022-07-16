package contaunica;

import java.util.Scanner;

public class ContaUnica {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double valor;

        System.out.println("Digite o titular da conta: ");
        aux = in.nextLine();
        Conta c1 = new Conta(aux);



        do{

            System.out.println("----- Menu -----");
            System.out.println("(1) - Dados bancarios");
            System.out.println("(2) - Depositos");
            System.out.println("(3) - Saques");
            System.out.println("(0) - Sair");


            System.out.print("Opcao: ");
            opcao = in.nextInt();

            if (opcao == 1) {

                    c1.DadosBancarios();
            }
            else if(opcao == 2){
                System.out.println("Digite o valor do deposito: ");
                valor = in.nextDouble();
                c1.Depositar(valor);
            }
            else if(opcao == 3){

                System.out.println("Digite o valor do sacar: ");
                valor = in.nextDouble();
                c1.Sacar(valor);
            }
            else if(opcao != 0){

                System.out.println("Opcao invalida");
            }

            System.out.println("");
        }while(opcao != 0);

    }
}
