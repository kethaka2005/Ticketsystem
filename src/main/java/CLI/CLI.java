package CLI;

import Ticket.Ticket;
import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*           Welcome to the TicketSystem          *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Get ready to explore an easy and efficient way to book tickets");

        while (true) {

            int TotalNoOfTickets = 0;
            int MaxCapacity = 0;
            System.out.println("System configuration");
            System.out.println("Enter 'Start' or 'Exit'");
            String choose = Scanner.next();
            int customerCount;

            if (choose.equalsIgnoreCase("start")) {
                System.out.println("Enter the no of vendor to stimulate: ");
                int vendorCount = Scanner.nextInt();
                System.out.println("Enter the no of customer to stimulate: ");
                customerCount = Scanner.nextInt();
                System.out.println("Enter the Max capacity: ");
                MaxCapacity = Scanner.nextInt();
                TicketPool ticketPool = new TicketPool();

                for (int i = 1; i <= vendorCount; i++) {
                    System.out.println("vendor "+i+" Enter the total number of ticket: ");
                    int TotalNoOfTicket = Scanner.nextInt();
                    System.out.println("vendor "+i+" Enter the ticket release rate: ");
                    int ReleaseRate = Scanner.nextInt();
                    Vendor vendor = new Vendor(ReleaseRate, TotalNoOfTicket, ticketPool);
                    Runnable runnable = new Vendor(TotalNoOfTicket, ReleaseRate, ticketPool);
                    Thread thread = new Thread(runnable);
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                for (int i = 1; i <= customerCount; i++) {
                    System.out.println("customer "+i+" Enter the total number of ticket: ");
                    int TotalNoOfTicket = Scanner.nextInt();
                    System.out.println(("customer "+i+" Enter the customer retrieval  rate"));
                    int RetrievalRate = Scanner.nextInt();
                    Runnable runnable = new Customer(TotalNoOfTicket, RetrievalRate, ticketPool);
                    Thread thread = new Thread(runnable);
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            } else if (choose.equalsIgnoreCase("Exit")) {
                System.out.println("You exit from the Ticket System");
                System.exit(0);
            } else {
                System.out.println("Invalid choose,Please try again ");
            }
        }
    }
}
