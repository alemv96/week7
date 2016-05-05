public abstract class Role {
  /*atributos (por ahora)*/
  public Role inCharge;
  public String employement;
  public float range;//limite de empleado para pagar algun articulo.
  
  public Role (Role inCharge ,String employement ,float range){
    this.inCharge = inCharge;
    this.employement = employement;
    this.range = range;
  }
  
  public Role getIncharge(){
    return this.inCharge;
  }
  
  public String getEmployement(){
    return this.employement;
  }
  
  public float getRange(){
    return this.range;
  }
  
  public abstract void whoPayTheBill(Bill bill);
  
}
