public class President extends Role{

  public President(Role inCharge, String employement){
    super(inCharge,employement);
  }

  public void whoPayTheBill(Bill bill){
    if (bill.getPrice() >= 150000){
        System.out.println("firmo: " + super.getEmployement());
    }

  }
}
