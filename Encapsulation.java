public class Encapsulation {
    private static String bankName;
    private String branchName;
    private double amount;
  
  
    public static String getBankName() {
        return bankName;
    }
    public String getBranchName() {
        return branchName;
    }
    public double getAmount() {
        return amount;
    }
    
    public static void setBankname(String bankName)
    {
        Encapsulation.bankName=bankName;
    }

    public  void setBrachName(String branchname)
    {
       this.branchName=branchname;
    }

    public void setAmount(double amount)
    {
          this.amount=amount;
    }
    @Override
    public String toString() {
        return "Encapsulation [branchName=" + branchName + ", amount=" + amount +"BranchName:-"+Encapsulation.bankName+ "]";
    }
  
}
