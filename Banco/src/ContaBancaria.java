public abstract class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldoInicial){
        this.saldo = saldoInicial;
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar (double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("O depsito de R$" + valor + "foi realizado com sucesso!");
        } else{
            System.out.println("Valor Inválido!");
        }
    }

    public abstract void sacar (double valor);

    public void exibirDados(){
        

    }


}
