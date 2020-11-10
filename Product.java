package Product;
public class Product  {
  private int ID ;
  private String name;
  private int quantity;
  Product(int I,String n) {
    this.ID=I;
    this.name=n;
    this.quantity=0;
  }
  public int getID(){
    return ID;
  }
  public String getName(){
    return name;
  }
  public int getQuantity(){
    return quantity;
  }
  public String toString()
  {
    return ID + ": " + name + "    stock level: " + quantity;
  }

  public void increaseQuantity(int i){
    if(i>0) {
      quantity += i;
      System.out.println("该库存为" + quantity);
    }
    else {
      System.out.println("增加的库存数量错误！" );
    }

  }
  public void SellOne(){
    if(quantity>0)
    {
     System.out.println("售出一件产品");
     quantity--;
    }
    else
      {
      System.out.println("库存为0，请补充库存！");
     }
  }
}
