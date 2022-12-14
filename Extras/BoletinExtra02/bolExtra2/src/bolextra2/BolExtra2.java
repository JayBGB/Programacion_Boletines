package bolextra2;

public class BolExtra2 {

    public static void main(String[] args) {
        
        Conta banco= new Conta("Santander","ES8905",0,9000);
        Conta cliente1 = new Conta("Manolo","ES3549",0,5000);
        Conta cliente2 = new Conta("Angel","ES3548",0,5000);
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        cliente1.transferencia(cliente2, 100,10);
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        System.out.println("");
        System.out.println("");
           
        cliente1.transferencia2(cliente1, cliente2, 150,10, banco);
        
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        System.out.println("saldo banco " + banco.getNome() +" " +banco.getSaldo());
    }
    
}
