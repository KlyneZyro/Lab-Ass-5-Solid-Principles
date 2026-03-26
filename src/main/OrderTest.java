package main;

public class OrderTest {
    public static void main(String[] args) {
        
        // We only call the specific tools we need for the basic order
        OrderCalculator calculator = new SimpleOrderCalculator();
        calculator.calculateTotal(10.0, 2);

        OrderProcessor processor = new SystemOrderProcessor();
        processor.placeOrder("John Doe", "123 Main St");

        // If this specific order happens to need an invoice and email, 
        // we can use those isolated services without forcing EVERY order to use them!
        InvoiceGenerator invoiceGen = new PdfInvoiceGenerator();
        invoiceGen.generateInvoice("order_123.pdf");

        EmailNotifier notifier = new EmailService();
        notifier.sendEmailNotification("johndoe@example.com");
    }
}

w3