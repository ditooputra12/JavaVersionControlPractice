public class MainApp {

    public static void main(String[] args) {
        TaxiTicket ticket = new TaxiTicket("Alice", "Downtown", "Airport", 50.0, 30.0, 60.0);

        ticket.detailedInfo(); // Display full info
        ticket.cS(); // Check taxi status

        // Display route and estimated duration
        ticket.dR();
        ticket.dED();

        // Simulate slowing down and speeding up
        ticket.slowDown(20);
        ticket.speedUp(15);
    }



}
