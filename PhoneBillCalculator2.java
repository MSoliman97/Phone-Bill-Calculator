package Chapter6;

import java.util.Scanner;

public class PhoneBillCalculator2 {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        PhoneBillCalculator2 calculator2 = new PhoneBillCalculator2();
        PhoneBill bill = new PhoneBill();
        bill.GetData();
        calculator2.scanner.close();
        bill.printItems();

       /*double overage = bill.overage();
        double subTotal = bill.subTotal;
        double total =bill.getTotal() ;
        double Tax = bill.getTax();*/



    }
    /*public PhoneBill getBill(){
        System.out.println(" Please Enter Your Bill ID ");
        BillID = scanner.nextInt();
        System.out.println(" Please Enter Your Plan price");
        double Plan = scanner.nextDouble();


        return new PhoneBill();
    */

}
