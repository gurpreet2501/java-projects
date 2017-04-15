
/**
 * Write a description of class UserInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInterface
{
    // instance variables - replace the example below with your own
    private Company company;

    /**
     * Constructor for objects of class UserInterface
     */
    public UserInterface(Company pCompany)
    {
       this.company = pCompany;
    }

    public void run()
    {
        while(true)
        {
            switch (menu()) 
            {
                    case 1:
                        showAvailableResources();
                        break;
                    case 2:
                        makeResourceBooking();
                        break;
                    case 3:
                        showEmployeeBookings();
                        break;
                     case 4:
                        showResourceBookings();
                        break;
                      case 5:
                        deleteBooking();
                        break;      
                     case 6:
                        return;   
                     default:
                        System.out.println ( "Invalid option" );
                        break;
            }
        }
    }
    
    private int menu()
    {
        System.out.println("1) Show available resources");
        System.out.println("2) Make a resource booking");
        System.out.println("3) Show bookings made by employee");
        System.out.println("4) Show bookings for a resource");
        System.out.println("5) Delete booking");
        System.out.println("6) Exit");
        return IOUtility.getInteger("Select option:");
    }
    
    private void showAvailableResources()
    {
     IOUtility.println("Code started");       
    }
    
    private void makeResourceBooking()
    {
        //to be implemented
    }
    
    private void showEmployeeBookings()
    {
        //to be implemented
    }
    
    private void showResourceBookings()
    {
        //to be implemented
    }
    
    private void deleteBooking()
    {
        //to be implemented
    }
    
    
}
