import java.io.*;

class Vehicle
{

  private String manufacturer;
  public Vehicle()
  {
     manufacturer = "";
  }

 public Vehicle(String mft)
  {
    this.manufacturer = mft;
  }
 
  public void printVehicle()
  {

    System.out.print("Vehicle is made by :" + manufacturer);
  }

}

class Car extends Vehicle{

   private String name;

   public Car(String nm)
   {  super(nm);
      this.name = nm;
   }

   public void printVehicle()
   {
     System.out.print("car is made by :" + name);
   }

}

public class OverridePgm
{
   public static void main(String[] argc)
   {

     Vehicle v1 = new Car("Maruti");
     v1.printVehicle();
     Car  c1 = new Car("Bajaj");
     c1.printVehicle();

    }

}


