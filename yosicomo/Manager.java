public class Manager extends Role{

  public Manager(Role inCharge ,String employement){
    super(inCharge ,employement );
  }

  public void whoPayTheBill(Bill bill){
      if (bill.getPrice() < 15000){
          System.out.println("firmo: " + super.getEmployement());
      }
      else super.getIncharge().whoPayTheBill(bill);
  }

}
