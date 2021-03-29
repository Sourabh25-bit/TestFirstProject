package Encapsulation;

public class Encapsulation
{
  private String stdName;
  
  public void setstdName(String sName) {
	  stdName=sName;
  }
  
  public String getstdName() {
	  return stdName;
  }
  
  public static void main (String[] args)
  {
    Encapsulation obj = new Encapsulation();
    obj.setstdName("Ganesh");
    System.out.println(obj.getstdName());
    
   
  }
}


