public class Director extends Role {

  public Director(Role inCharge ,String employement){
    super(inCharge ,employement);
  }

  public void whoPayTheBill(Bill bill){

    if ((bill.getPrice() >= 15000) && (bill.getPrice() < 50000)){
        System.out.println("firmo: " + super.getEmployement());
    }
    else super.getIncharge().whoPayTheBill(bill);
  }
}
