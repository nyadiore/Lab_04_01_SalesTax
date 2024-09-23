public class Main {
    public static void main(String[] args) {
      double purchasePrice= 100;
      double salesTaxRate= 0.05;

      //Calculate Sales Tax
        double salesTax= purchasePrice*salesTaxRate;
        //Display the results
        System.out.println("The price of the purchase is " +purchasePrice);
        System.out.println("The computed sales tax is: " +salesTax);
    }
}