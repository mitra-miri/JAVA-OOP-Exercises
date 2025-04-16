

public class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }
    public void bookCourt(Court court) {
        if(court.bookCourt()){
            System.out.println( name +" successfully booked a " + court.getSportType() + " court.");

        }
        else System.out.println("Court is already booked!");

    }
}
