/*programa principal;
Date: 02/05/2016*/
public class Control_Command{
  public static void main(String[] args){
      Role president = new President(null/*no es una buena practica,evitar*/,"Presidente" ,150000);
      Role vicePresident = new VicePresident(president , "vice presidente" ,50000);
      Role director = new Director(vicePresident , "Director" ,15000);
      Role manager = new Manager(director , "Gerente" ,14999);
      Bill bill1 = new Bill(10000 , "ipod");
      manager.whoPayTheBill(bill1);
      Bill bill2 = new Bill(17582 ,"Laptop");
      manager.whoPayTheBill(bill2);
      Bill bill3 = new Bill(52360 ,"Carro");
      manager.whoPayTheBill(bill3);
      Bill bill4 = new Bill(150000 ,"Casa");
      manager.whoPayTheBill(bill4);
  }
}
