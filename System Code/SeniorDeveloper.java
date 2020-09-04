public class SeniorDeveloper extends Developer                                                                          /**defining SeniorDeveloper class, the sub class of a Developer class**/
{
    /**initializing seven attributes of this class with their respective datatypes**/
    
    private float salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private float advanceSalary;
    private boolean appointed;
    private boolean terminated;
    
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, float salary, int contractPeriod)             /**defining a constructor with five attributes as parameter**/        
    {
        super(platform, interviewerName, workingHours);                                                                           /**call to a super class constructor with three parameters**/
        this.salary = salary;                                                                                                       
        this.contractPeriod = contractPeriod;
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.advanceSalary = 0.0f;
        this.appointed = false;
        this.terminated = false;
    }
    
    public float getSalary()
    {
        return this.salary;
    }
    
    public String getJoiningDate()
    {
        return this.joiningDate;
    }
    
    public String getStaffRoomNumber()
    {
        return this.staffRoomNumber;
    }
    
    public int getContractPeriod()
    {
        return this.contractPeriod;
    }
    
    public float getAdvanceSalary()
    {
        return this.advanceSalary;
    }
    
    public boolean isAppointed()
    {
        return this.appointed;
    }
    
    public boolean isTerminated()
    {
        return this.terminated;
    }
    
    public void setSalary(float salary)
    {
        this.salary = salary;
    }
    
    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod = contractPeriod;
    }
    
    public void hireDeveloper(String developerName, String joiningDate, float advanceSalary, String staffRoomNumber)
    {
        if (this.appointed == true) {
            System.out.println("Developer is already apoointed\n"+"Developer name is = " + super.getDeveloperName());
            System.out.println("Staff Room Number is =" + getStaffRoomNumber());
        }
        else {
            super.setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.staffRoomNumber = staffRoomNumber;
            this.advanceSalary = advanceSalary;
            this.appointed = true;
            this.terminated = false;
        }
    }
    
    public void termination()
    {
        if (this.terminated == true) {
            System.out.println("The developer is already terminated. You have access to hire a new developer." ); 
            System.out.println("Developer Name is " + this.getDeveloperName());
            System.out.println("The staff room number is " + this.getStaffRoomNumber());
        }
        else {
            this.setDeveloperName("");
            this.joiningDate = "";
            this.advanceSalary = 0.0f;
            this.appointed = false;
            this.terminated = true;
        }            
    }
    
    public void print()
    {
        System.out.println("The platform is = " + this.getPlatform());
        System.out.println("The Interviewer name is = " + this.getInterviewerName());
        System.out.println("Developer Salary is = " + this.getSalary());
    }
    
    public void display()
    {
        super.display();
        if (this.appointed == true) {     
            System.out.println("The termination stauts is = " + this.isTerminated());
            System.out.println("Joining Date is = " + this.getJoiningDate());
            System.out.println("Advance Salary is = " + this.getAdvanceSalary());
            System.out.println("Developer Name is = " + this.getDeveloperName());
        }
    }
}

