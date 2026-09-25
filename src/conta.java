public class conta {
    private String numeroconta;
    private String titular;
    private double saldo;
    private boolean bloqueada;
    public conta(String numeroconta, String titular) {
        this.numeroconta = numeroconta;
        this.titular = titular;
        this.saldo = 0;
        this.bloqueada = false;
    }
    public String getNumeroconta() {
        return numeroconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.isBlank()) {
            System.out.print("Sem Titular");
        } else if (bloqueada == false){
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public boolean isBloqueada() {
        return bloqueada;
    }

    public boolean BloquearConta(){
        return bloqueada = true;
    }
    public boolean depositar(double valor) {
        if (valor > 0 && bloqueada == false) {
            saldo = saldo + valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo && !bloqueada) {
            saldo = saldo - valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean desbloquearconta() {
        if (bloqueada == true) {
            bloqueada = false;
            return true;
        }else {
            return false;
        }
    }
}

