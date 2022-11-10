public class Ticket {
   int number;

   public static void main (String[] args){
     Ticket ticket = new Ticket(1);
     System.out.println(ticket);
     WalkupTicket walk = new WalkupTicket(2);
     System.out.println(walk);
     AdvanceTicket adv = new AdvanceTicket(3, 10);
     System.out.println(adv);
     StudemtAdvancedTicket stu = new StudemtAdvancedTicket(4, 5);
     System.out.println(stu);
   }
   public Ticket(int number){

      this.number = number;

   }



   public float getPrice(){
      return 0;
   }

   public String toString(){
      return ("Number: " + number + " Price: $" + getPrice());
   }

}
