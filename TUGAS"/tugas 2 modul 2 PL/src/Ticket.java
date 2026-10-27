public abstract class Ticket {
    protected String passengerName;
    protected String startLocation;
    protected String destination;
    protected double price;

    public Ticket(TicketInfo ticketInfo) {
        this.passengerName = ticketInfo.getPassengerName();
        this.startLocation = ticketInfo.getStartLocation();
        this.destination = ticketInfo.getDestination();
        this.price = ticketInfo.getPrice();
    }

    public abstract void displayInfo();
}