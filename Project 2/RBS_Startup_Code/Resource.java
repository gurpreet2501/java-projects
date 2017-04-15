import java.io.*;
/**
 * Write a description of class Resource here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resource
{
    // instance variables
    
    /**
     * Constructor for objects of class Resource
     */
    // public Resource()
    // {
    //     // initialise instance variables
    // }

    public void getAvailableResources()
    {
      FileReader fis;
      try{

      fis = new FileReader("Employees.txt");
      System.out.println(fis);

      }catch(Exception e){
        System.out.println(e);
      }
       
    }

    public String toString()
    {
        // put your code here
        return "under construction";
    }
}
