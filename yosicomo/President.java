public class President extends Role{

  public President(Role inCharge, String employement ,float range){
    super(inCharge ,employement ,range);
  }

  public void whoPayTheBill(Bill bill){
    if (bill.getPrice() >= super.getRange()){
      System.out.println("//////////////////////////////////");
      System.out.println("firmo: " + super.getEmployement());
      System.out.println("factura efectuada: ");
      System.out.println("Precio artefacto " + bill.getPrice());
      System.out.println("nombre de artefacto: " + bill.getName());
      System.out.println("//////////////////////////////////");
    }

  }
}
