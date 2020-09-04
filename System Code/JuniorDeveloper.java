public class JuniorDeveloper extends Developer                                                                          /**defining JuniorDeveloper class, the sub class of a Developer class**/
{
    private float salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    public JuniorDeveloper(String platform, String interviewerName, int workingHours, float salary, String appointedBy, String terminationDate)                               
    {
        super(platform, interviewerName, workingHours);
        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        this.appointedDate = "";
        this.evaluationPeriod = "";
        this.specialization = "";
        this.joined = false;
    }
    
    public float getSalary()
    {
        return this.salary;
    }
    
    public String getAppointedBy()
    {
        return this.appointedBy;
    }
    
    public String getTerminationDate()
    {
        return this.terminationDate;
    }
    
    public String getAppointedDate()
    {
        return this.appointedDate;
    }
    
    public String getEvaluationPeriod()
    {
        return this.evaluationPeriod;
    }
    
    public String getSpecialization()
    {
        return this.specialization;
    }
    
    public boolean isJoined()
    {
        return this.joined;
    }
    
    public void setSalary(float salary)
    {
        if (this.joined == false) {
            this.salary = salary;
        }
        else {
            System.out.println("Developer has already joined. So, no possibility of changing the salary.");
        }
    }
    
    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
    {
        if (this.joined == false) {     
            super.setDeveloperName(developerName);
            this.joined = true;
            this.appointedDate = appointedDate;
            this.terminationDate = terminationDate;
            this.specialization = specialization;
        }
        else {      
            System.out.println("Junior Developer is already appointed.");
            System.out.println("Appointed Date is = " + this.getAppointedDate());
        }
    }
    
    public void display()
    {
        super.display();
        if (joined == true) {       
            System.out.println("Appointed Date is = " + this.getAppointedDate());
            System.out.println("Evaluation period is = " + this.getEvaluationPeriod());
            System.out.println("Termination Date is = " + this.getTerminationDate());
            System.out.println("Salary of Developer is = " + this.getSalary());
            System.out.println("Specialization of Developer is = " + this.getSpecialization());
            System.out.println("Appointed By = " + this.getAppointedBy());
        }
    }
}