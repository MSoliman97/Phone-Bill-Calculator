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
    }
   
}
