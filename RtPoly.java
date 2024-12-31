public class RtPoly {
    public static void main(String[] args) {
    InnerRtPoly r1=new Child
    ();
        r1.m1();
    }
}
class  Child extends InnerRtPoly{
    @Override
    public void m1(){
       System.out.println("Hii I am Child class");
    }
}

class InnerRtPoly {
    public void m1()
    {
        System.out.println("Hii I am Parent class");
    }
    
}
