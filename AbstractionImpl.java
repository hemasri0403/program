
//Inherting interface inside a class for abstraction using implements
public class AbstractionImpl implements Abstraction{
    @Override
   public void add()
    {
      System.out.println(10+20);
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
   public static void main(String[] args) {
     Abstraction impl=new  AbstractionImpl();
     impl.add();
   }
}

// //Inherting abstract calss inside a class for abstraction using extends
// public class AbstractionImpl extends AbstractClass{
//     @Override
//    public void add()
//     {
//       System.out.println(10+20);
//     }
//    public static void main(String[] args) {
//      AbstractionImpl impl=new  AbstractionImpl();
//      impl.add();
//    }
// }