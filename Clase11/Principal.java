public class Principal {
    public static void main(String[] args) {
    
        CuentaBancaria c1 = new CuentaBancaria("Samuel Giraldo", "06091202", 500);

    
        CuentaBancaria c2 = new CuentaBancaria("", "12", -100);


        c1.depositar(200);
        c1.retirar(150);
        System.out.println(c1.toString());

        c2.depositar(-50);
        c2.retirar(100);
        System.out.println(c2.toString());
    }
}