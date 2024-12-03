package CLI;

import Ticket.Ticket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CLI {
    public static void main(String[]args){
        Scanner Scanner= new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*           Welcome to the TicketSystem          *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Get ready to explore an easy and efficient way to book tickets");

    while(true){
        List<Ticket> TicketPool= Collections.synchronizedList(new ArrayList<>());
        int TotalNoOfTickets=0;
        int MaxCapacity=0;
        System.out.println("System configuration");
        System.out.println("Enter 'Start' or 'Exit'");
        String choose= Scanner.next();
        if(choose.equalsIgnoreCase("start")){
            System.out.println("Enter the no of vendor to stimulate: ");
            int vendor= Scanner.nextInt();
            System.out.println("Enter the no of customer to stimulate: ");
            int customer=Scanner.nextInt();
            System.out.println("Enter the Max capacity: ");
            MaxCapacity=Scanner.nextInt();
            System.out.println("Enter the total number of ticket: ");
            int TotalNoOfTicket=Scanner.nextInt();
            System.out.println("Enetr the ticket release rate: ");
            int ReleaseRate=Scanner.nextInt();
            System.out.println(("Enter the customer retrieval  rate"));
            int RetrievalRate=Scanner.nextInt();
        }
        else if (choose.equalsIgnoreCase("Exit")){
            System.out.println("Exit");
            System.exit(0);
        }
        else{
            System.out.println("Invalid choose,Please try again ");
        }

    }
    }
}
