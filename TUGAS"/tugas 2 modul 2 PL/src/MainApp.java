public class MainApp {
    public static void main(String[] args) {

        TicketInfo info = new TicketInfo("Alice", "Downtown", "Airport", 50.0);


        TaxiTicket ticket = new TaxiTicket(info, 30.0, 60.0);


        ticket.detailedInfo();
        System.out.println();

        ticket.checkStatus();
        System.out.println();

        ticket.displayRoute();
        ticket.displayEstimatedDuration();
        System.out.println();

        ticket.slowDown(20);
        ticket.speedUp(15);
    }
}