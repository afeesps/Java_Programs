class Test { 
    static int count = 0; 
    public static void fun() {  
       System.out.println("Static fun() called");  
    }     
}    
       
class Main 
{ 
    public static void main(String arr[]) { 
       System.out.println("Test.count = " + Test.count);         
       Test.fun(); 
    } 
}
