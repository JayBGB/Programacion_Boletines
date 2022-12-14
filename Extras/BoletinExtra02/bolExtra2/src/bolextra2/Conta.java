package bolextra2;

import javax.swing.JOptionPane;

/**
 *
 * @author JayBGB
 */
public class Conta {
    
    String nome, numero;
    double interes, saldo;

    public Conta(String nome, String numero, double interes, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public Conta (){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double ingreso (){
    
        double nuevoIngreso=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que quieras añadir al saldo."));
        saldo=nuevoIngreso+saldo;
        return saldo;
    }
    
    public double reintegro (){
    
        double nuevoReintegro=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que quieras retirar del saldo."));
        saldo=saldo-nuevoReintegro;
        return saldo;
    }
    
     public void transferencia(Conta cliente2, double importe, double tae){
       double saldoC1 = this.saldo;
       saldoC1 -= importe ;//a la primera cuenta debemos restarle el porcentaje de los intereses saldo -(saldo * tae /100)
       saldoC1 = saldoC1 - (saldoC1 * tae / 100);
       this.saldo = saldoC1;
       double saldoC2 = cliente2.getSaldo();
        saldoC2 += importe;
        cliente2.setSaldo(saldoC2);
       
    }
    public void transferencia2(Conta cliente1, Conta cliente2, double importe, double tae, Conta banco){
        double saldoC1 = cliente1.getSaldo();
        saldoC1 -= importe;
        saldoC1 = saldoC1 - (saldoC1 * tae / 100);
        double saldoC2 = cliente2.getSaldo();
        saldoC2 += importe;
        cliente2.setSaldo(saldoC2);
        
        double saldoBanco = banco.getSaldo();
        saldoBanco += saldoC1 * tae / 100;
        banco.setSaldo(saldoBanco);
    }

}
