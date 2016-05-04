//factura del producto;
public class Bill {
    public float price;//es el precio del objeto comprado
    private String name_of_the_device;
    public Bill (float price , String name_of_the_device){
      this.price = price;
      this.name_of_the_device = name_of_the_device;
    }

    public float getPrice(){
      return this.price;//me hara saber el valor del articulo;
    }
}
