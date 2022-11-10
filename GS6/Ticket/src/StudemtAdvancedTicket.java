public class StudemtAdvancedTicket extends AdvanceTicket{
    int number;
    int days;
    public StudemtAdvancedTicket(int number, int days){
        super(number, days);

    }


    public float getPrice() {
        if(days >= 10) {
            return 15;
        }else{
            return 10;
        }
    }



    public String toString() {
        return ("Number: " + number + " Price: $" + getPrice()+ "(Student ID Required)");
    }
}
