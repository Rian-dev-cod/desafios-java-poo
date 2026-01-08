package desafioAtlas.nivel09;

public class ContaBancaria {

    private String titular;

    private double saldo = 0.0;


    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    
    public double getSaldo() {
        return saldo;
    }


    public boolean depositar(double valor){
        
        if(valor > 0){
            
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double valor){
    if (valor > 0 && this.saldo >= valor) {
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}

}
