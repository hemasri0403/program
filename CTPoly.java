public class CTPoly {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(double a,int b){
        System.out.println(a+b);
    }
    public void add(int a)
    {
        System.out.println(a);
    }
    public void add(double a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        CTPoly p=new CTPoly();
        p.add(10,10);
    }
}
