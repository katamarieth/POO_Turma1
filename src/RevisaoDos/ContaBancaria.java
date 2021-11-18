package RevisaoDos;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class ContaBancaria {
    //    Attribute
    private double saldo;
    private Date dataAbertura;

    // Class Constructor
    public ContaBancaria() {
        this.saldo = 0;
        this.dataAbertura = new Date();
        System.out.println("Abertura de conta feita com sucesso");
    }

    // Getters/Setters
    public double getSaldo() {
        return saldo;
    }

    public String getSaldoFormatado() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataAberturaFormatada() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return df.format(this.dataAbertura);
    }

    // Methods
    public void depositar(double quantia) {
        this.saldo += quantia;
        System.out.println("Novo depósito efetuado!");
    }

    public void sacar(double quantia) {
        if (this.saldo < quantia) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            this.saldo -= quantia;
            System.out.println("Saque efetuado com sucesso");
        }
    }

}
