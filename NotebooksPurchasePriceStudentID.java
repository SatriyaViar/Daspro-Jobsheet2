import java.util.Scanner;

/**
 * NotebooksPurchasePriceStudentID
 */
public class NotebooksPurchasePriceStudentID {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    String bookBrand;
    String pageCount;
    int price, quantity;
    double discount=0.10, totalPrice, purchasePrice, totalDiscount;
    System.out.println("Input User of bookBrand: ");
    bookBrand=input.nextLine();
    System.out.println("Input page count: ");
    pageCount=input.nextLine();
    System.out.println("Input price: ");
    price=input.nextInt();
    System.out.println("Input quantity: ");
    quantity=input.nextInt(); 
    totalPrice=price*quantity;
    totalDiscount=totalPrice*discount;
    purchasePrice=totalPrice-totalDiscount;
    System.out.println("The total discount is: "+totalDiscount);
    System.out.println("The purchase price is: "+purchasePrice);
    }
}