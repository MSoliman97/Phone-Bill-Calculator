package Chapter6;

import java.util.Scanner;

public class PhoneBill {

    private int BillID;
    private int allottedMin;
    private int minUsed;
    private double plan;
    private double overAgeChargePerCent = .25;
    private double taxPercent = .15;
    public double subTotal ;

    public double getPlan(){
        return plan;
    }
    public void setPlan(double Plan){
        this.plan = Plan;
    }
    public int getBillID(){
        return BillID;
    }
    public void setBillID(int BillID){
        this.BillID = BillID;
    }
    public int getAllottedMin(){
        return allottedMin;
    }
    public void setAllottedMin(int allottedMin){
        this.allottedMin = allottedMin;
    }
    public  int getMinUsed(){
        return minUsed;
    }
    public void setMinUsed(int minUsed){
        this.minUsed = minUsed;
    }
    public PhoneBill (){
        BillID = 0;
        plan = 0;
        minUsed = 0;
        allottedMin = 0;
    }
    public PhoneBill(int BillID){
        this.BillID = BillID;

}

public double getSubTotal(){
        return overage() + plan;
}
    public double overage(){
        if (minUsed - allottedMin <= 0 ){
            return 0 ;
        }else
            return (minUsed - allottedMin) * overAgeChargePerCent;
    }
    public double getTax(){

        return getSubTotal()* taxPercent;

    }
    public double getTotal (){
        return    getSubTotal() + getTax();

    }
    public void GetData(){
        System.out.println(" Please Enter Your Bill ID ");
        Scanner scanner = new Scanner(System.in);
        BillID = scanner.nextInt();
        System.out.println(" Please Enter Your Plan price");
        plan = scanner.nextDouble();
        System.out.println(" Please Enter Your allotted Minutes ");
        allottedMin = scanner.nextInt();
        System.out.println(" Please Enter Your Minutes usage ");
        minUsed = scanner.nextInt();
    }
    public void printItems(){
        System.out.println("Bill ID = " + BillID);
        System.out.println("Bill ID = " + plan);
        System.out.println("overage =" + overage());
        System.out.println("Subtotal =" + getSubTotal());
        System.out.println("Tax =" + getTax());
        System.out.println("Total = " + getTotal());


    }

    //System.out.println("Bill ID = " + BillID);
    //        System.out.println("overage =" + overage );
    //        System.out.println("Subtotal =" + subTotal);
    //        System.out.println("Tax =" + Tax);
    //        System.out.println("Total = " +total);
    // overage = overageMinutes * overAgeChargePerCent;
    //Tax = subtotal * taxPercent

}
