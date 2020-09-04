public class Developer                                                                          /**defining a class Developer**/
{
    /**initializing four attributes of this class with their respective datatypes**/
    
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHours;
    
    public Developer(String platform, String interviewerName, int workingHours)               /**constructor with parameter of a Developer class**/
    {
        /**assigning the value of constructor's parameter with this keyword**/  
        
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.workingHours = workingHours;
        this.developerName = "";                                                              
    }
    
    /**accessor method of each attribute**/
    
    public String getPlatform()
    {
        return this.platform;
    }
    
    public String getInterviewerName()
    {
        return this.interviewerName;
    }
    
    public String getDeveloperName()
    {
        return this.developerName;
    }
    
    public int getWorkingHours()
    {
        return this.workingHours;
    }
    
    public void setDeveloperName(String developerName)                                         /**defining a method to setdeveloper name to a new name**/
    {
        this.developerName = developerName;
    }
    
    public void display()                                                                       
    {
        System.out.println("Platform is: " + getPlatform());
        System.out.println("Working hour is: " + getWorkingHours()+" hours per day");
        System.out.println("Interviewer name is: " + getInterviewerName());
        
        if (!this.developerName.equals("")) {
            System.out.println("Developer Name is: " + getDeveloperName());                               
        }
        else {
            System.out.println("Developer Name is not specified.");
        }
 
    }    
}
