public class VicePresident extends Role{

  public VicePresident(Role inCharge ,String employement){
    super(inCharge,employement);
  }

  public void whoPayTheBill(Bill bill ,Role role){

    if ((bill.getPrice() >= 50000) && (bill.getPrice() < 150000)){
        System.out.println("firmo: " + super.getEmployement());
    }
    else super.getIncharge().whoPayTheBill(bill);
  }
}
