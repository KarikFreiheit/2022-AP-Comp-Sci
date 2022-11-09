public class AdvanceTicket extends Ticket{
    int days;
    public AdvanceTicket(int number, int days){
        super(number);
        this.days = days;
    }



    public float getPrice() {
        if(days >= 10) {
            return 30;
        }else{
            return 40;
        }
    }
}
