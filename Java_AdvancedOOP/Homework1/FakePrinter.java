public class FakePrinter implements ReceiptPrinter {
    public void print(StringBuffer buf) {
        System.out.println("fake Print");
        System.out.println(buf);
    }
}
