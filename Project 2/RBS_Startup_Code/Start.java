
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start
{


    public static void main(String[] args)
    {
        Company company = new Company("Company Name");
        UserInterface consoleApp = new UserInterface(company);
        consoleApp.run();
    } 


}
