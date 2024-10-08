public class Client {
    public static void main(String[] args) {
        Item item1 = new Item("Shampoo", 3000);
        Item item2 = new Item("Cookie", 1000);
        Sale sale = new Sale();
        sale.add(item1);
        sale.add(item2);
        sale.setReceiptPrinter(new FakePrinter());
        sale.printReceipt();
        sale.setReceiptPrinter(new HD108ReceiptPrinter());
        sale.printReceipt();
    }
}