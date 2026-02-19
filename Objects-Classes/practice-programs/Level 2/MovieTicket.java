class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean booked;

    MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.booked = false;
    }

    void bookTicket(int seatNumber) {
        if (!booked) {
            this.seatNumber = seatNumber;
            booked = true;
            System.out.println("Ticket booked successfully");
        } else {
            System.out.println("Seat already booked");
        }
    }

    void display() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Avengers", 250);
        t1.bookTicket(10);
        t1.display();
    }
}
