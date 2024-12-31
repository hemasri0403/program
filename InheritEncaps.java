public class InheritEncaps {
public static void main(String[] args) {
    Encapsulation.setBankname("SBI Banglore");
    Encapsulation e1=new Encapsulation();
    e1.setBrachName("Banglore");
    e1.setAmount(1200.00);
    System.out.println(e1);

    Encapsulation e2=new Encapsulation();
    e2.setBrachName("Chennai");
    e2.setAmount(1000.00);
    System.out.println(e2);

    Encapsulation e3=new Encapsulation();
    e3.setBrachName("Madurai");
    e3.setAmount(1200000.00);
    System.out.println(e3);

    Encapsulation e4=new Encapsulation();
    e4.setBrachName("Delhi");
    e4.setAmount(99200.00);
    System.out.println(e4);

}
    
}
