//el cargo de cada empleado o trabajador;
public class Role {
/*atributos (por ahora)*/
    public Role inCharge;
    public String employement;
    /*public final float minimumValue;//valor minimo con el que el empleado tiene acceso a firmar
    public final float maximumValue;//valor maximo que tiene el empleado para firmar*/

    public Role (Role inCharge ,String employement){
        this.inCharge = inCharge;
        this.employement = employement;
        /*this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;*/
    }

    public Role getIncharge(){
      return this.inCharge;
    }

    public String getEmployement(){
      return this.employement;
    }

  /*  public int getMinimum(){
      return this.minimumValue;
    }

    public int getMaximum(){
      return this,maximumValue;
    }*/

    public void whoPayTheBill(Bill bill){

    }

}
