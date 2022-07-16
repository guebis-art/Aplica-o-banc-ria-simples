package contaunica;


public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    static int qtdcontas = 0;

    public Conta( String pTitular){

      this.titular = pTitular;
        qtdcontas++;
        this.numero = qtdcontas++;
        this.saldo = 0;

    }
    public void DadosBancarios(){
        System.out.println("");
        System.out.println(" --Dados Bancarios-- ");
        System.out.println(" --Numero: " + this.numero);
        System.out.println(" --Titular: " + this.titular);
        System.out.println(" --Saldo: " + this.saldo);
        System.out.println(" ---Fim dados bancarios ---");
        System.out.println("");

    }

    public void Depositar(double pValor){
        System.out.println("Realizando deposito");
        System.out.println(" --Saldo anterior " + this.saldo);
       this.saldo = this.saldo + pValor;
        System.out.println("Saldo Posterior " + this.saldo);
        System.out.println(" -- Fim do deposito");


    }
    public void Sacar( double pValor){
        System.out.println("");
        System.out.println("--- Realizando Saque ---");
        System.out.println("--- Saldo Anterior " + this.saldo);

        if(pValor <= this.saldo){
            this.saldo -=pValor;
            System.out.println("Saldo Posterior " + this.saldo);
        }else{
            System.out.println(" --Saldo Insuficiente-- ");
        }
        System.out.println("--- Fim do saque ---");

    }

}
