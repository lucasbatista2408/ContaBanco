public class ContaTerminal {
    int numero;
    int agencia;
    String nome;
    double Saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        String response = "Olá "+nome+", obrigado por criar uma conta em nosso " +
                "banco, sua agência é "+agencia+", conta "+numero+" e seu saldo " +
                +Saldo+" já esta disponivel para saque.";
        return response ;
    }
}
