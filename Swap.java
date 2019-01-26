

import java.io.*;
// A Java program to demonstrate that simply swapping 
// object references doesn't work 

// A car with number and name 
class Car 
{ 
	int model, no; 

	// Constructor 
	Car(int model, int no) 
	{ 
		this.model = model; 
		this.no = no; 
	} 

	// Utility method to print Car 
	void print() 
	{ 
		System.out.println("no = " + no + 
						", model = " + model); 
	} 

}

class CarWrapper
{

   Car c1;

   CarWrapper(Car c)
   {

     this.c1 = c;
   }
 
}

// A class that uses Car 
class Swap 
{ 
	// swap() doesn't swap c1 and c2 
	public static void swap(CarWrapper cw1, CarWrapper cw2) 
	{ 
		Car temp = cw1.c1; 
		cw1.c1= cw2.c1; 
		cw2.c1 = temp; 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		Car c1 = new Car(101, 1); 
		Car c2 = new Car(202, 2); 
		CarWrapper cw1 = new CarWrapper(c1);
		CarWrapper cw2 = new CarWrapper(c2);
		swap(cw1, cw2); 
		cw1.c1.print(); 
		cw2.c1.print(); 
	} 
} 

