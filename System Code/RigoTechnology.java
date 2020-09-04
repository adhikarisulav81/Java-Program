/**
 * Write a description of class RigoTechnology here.
 *
 * @author Sulav Adhikari
 * @version 2.0
 */

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class RigoTechnology implements ActionListener
{
    JFrame frm;    
    JLabel lblTitle, lblPlatformNo1, lblInterviewerName, lblSalary, lblWorkingHours, lblContractPeriod, lblDeveloperName, lblJoiningDate, lblAdvanceSalary, lblStaffRoomNo, lblPlatformNo2, lblTitle2, lblPlatformNo3, lblInterviewerName2, lblSalary2, lblWorkingHours2, lblAppointedBy, lblTerminationDate, lblDeveloperName2, lblJoiningDate2, lblSpecialization, lblTerminationDate2, lblPlatformNo4, lblEvaluationPeriod;    
    JTextField txtPlatformNo1, txtInterviewerName, txtSalary, txtWorkingHours, txtContractPeriod, txtDeveloperName, txtJoiningDate, txtAdvanceSalary, txtStaffRoomNo, txtPlatformNo2, txtPlatformNo3, txtInterviewerName2, txtSalary2, txtWorkingHours2, txtAppointedBy, txtTerminationDate, txtDeveloperName2, txtJoiningDate2,txtSpecialization, txtTerminationDate2, txtPlatformNo4, txtEvaluationPeriod;
    JButton btnAdd1, btnHire, btnTerminate, btnAdd2, btnHire2, btnDisplayAll, btnClear;
    
    ArrayList<Developer> list = new ArrayList<Developer>();
    public static void main(String []args)
    {
        new RigoTechnology().developerGUI();
    }
    
    public void developerGUI()
    {           
        frm = new JFrame("Rigo Technology");        
        frm.setSize(850,1050);
        frm.setLayout(null);    //setting layout as null
        frm.setVisible(true);   //making the frame visible
        frm.setResizable(true);
        //.getContentPane().setBackground(Color.GRAY);
        
        //For Senior Developer
        lblTitle = new JLabel("Senior Developer");   //labeling the title
        frm.add(lblTitle);  //adding label to the frame
        lblTitle.setBounds(30,30,200,30);  //setting bound value of title
        Font f1 = new Font("Arial",Font.BOLD,16);    //setting font size 
        lblTitle.setFont(f1);
        
        lblTitle = new JLabel("______________________________________________________________________________________________________________________________");
        frm.add(lblTitle); 
        lblTitle.setBounds(30,40,900,30);  
        
        
        lblPlatformNo1 = new JLabel("Platform: ");
        frm.add(lblPlatformNo1);
        lblPlatformNo1.setBounds(30,80,80,30);
        txtPlatformNo1 = new JTextField();     //creating the text box of Platform
        frm.add(txtPlatformNo1);
        txtPlatformNo1.setBounds(170,80,170,30);
        Font f3 = new Font("Arial",Font.BOLD,14);
        lblPlatformNo1.setFont(f3);
        
        lblInterviewerName = new JLabel("Interviewer's Name: ");
        frm.add(lblInterviewerName);
        lblInterviewerName.setBounds(400,80,160,30);       
        txtInterviewerName = new JTextField();
        frm.add(txtInterviewerName);
        txtInterviewerName.setBounds(550,80,200,30);
        Font f4 = new Font("Arial",Font.BOLD,14);
        lblInterviewerName.setFont(f4);
        
        lblSalary = new JLabel("Salary: ");
        frm.add(lblSalary);
        lblSalary.setBounds(30,140,70,30);
        txtSalary = new JTextField();
        frm.add(txtSalary);
        txtSalary.setBounds(170,140,100,30);
        Font f5 = new Font("Arial",Font.BOLD,14);
        lblSalary.setFont(f5);
        
        lblWorkingHours = new JLabel("Working Hours: ");
        frm.add(lblWorkingHours);
        lblWorkingHours.setBounds(400,140,120,30);       
        txtWorkingHours = new JTextField();
        frm.add(txtWorkingHours);
        txtWorkingHours.setBounds(550,140,80,30);
        Font f6 = new Font("Arial",Font.BOLD,14);
        lblWorkingHours.setFont(f6);
        
        lblContractPeriod = new JLabel("Contract Period: ");
        frm.add(lblContractPeriod);
        lblContractPeriod.setBounds(30,200,120,30);       
        txtContractPeriod = new JTextField();
        frm.add(txtContractPeriod);
        txtContractPeriod.setBounds(170,200,150,30);
        Font f7 = new Font("Arial",Font.BOLD,14);
        lblContractPeriod.setFont(f7);
       
        btnAdd1 = new JButton("Add");
        btnAdd1.setBounds(550,220,100,30);
        frm.add(btnAdd1);  
        btnAdd1.addActionListener(this);
        
        lblDeveloperName = new JLabel("Developer's Name: ");
        frm.add(lblDeveloperName);
        lblDeveloperName.setBounds(30,280,150,30);       
        txtDeveloperName = new JTextField();
        frm.add(txtDeveloperName);
        txtDeveloperName.setBounds(170,280,200,30);
        Font f8 = new Font("Arial",Font.BOLD,14);
        lblDeveloperName.setFont(f8);
        
        lblJoiningDate = new JLabel("Joining Date: ");
        frm.add(lblJoiningDate);
        lblJoiningDate.setBounds(400,280,100,30);       
        txtJoiningDate = new JTextField();
        frm.add(txtJoiningDate);
        txtJoiningDate.setBounds(550,280,200,30);
        Font f9 = new Font("Arial",Font.BOLD,14);
        lblJoiningDate.setFont(f9);
        
        lblAdvanceSalary = new JLabel("Advance Salary: ");
        frm.add(lblAdvanceSalary);
        lblAdvanceSalary.setBounds(30,320,150,30);
        txtAdvanceSalary = new JTextField();
        frm.add(txtAdvanceSalary);
        txtAdvanceSalary.setBounds(170,320,100,30);
        Font f10 = new Font("Arial",Font.BOLD,14);
        lblAdvanceSalary.setFont(f10);
        
        lblStaffRoomNo = new JLabel("Staff Room No.: ");
        frm.add(lblStaffRoomNo);
        lblStaffRoomNo.setBounds(400,320,140,30);       
        txtStaffRoomNo = new JTextField();
        frm.add(txtStaffRoomNo);
        txtStaffRoomNo.setBounds(550,320,80,30);
        Font f11 = new Font("Arial",Font.BOLD,14);
        lblStaffRoomNo.setFont(f11);
        
        lblPlatformNo2 = new JLabel("Platform No: ");
        frm.add(lblPlatformNo2);
        lblPlatformNo2.setBounds(30,360,100,30);
        txtPlatformNo2 = new JTextField();     
        frm.add(txtPlatformNo2);
        txtPlatformNo2.setBounds(170,360,100,30);
        Font f22 = new Font("Arial",Font.BOLD,14);
        lblPlatformNo2.setFont(f22);
        
        btnHire = new JButton("Hire");
        btnHire.setBounds(460,390,70,30);
        frm.add(btnHire);
        btnHire.addActionListener(this);
        
        btnTerminate = new JButton("Terminate");
        btnTerminate.setBounds(550,390,120,30);
        frm.add(btnTerminate);
        btnTerminate.addActionListener(this);
               
        //For Junior Developer
        lblTitle2 = new JLabel("Junior Developer");   
        frm.add(lblTitle2);  
        lblTitle2.setBounds(30,430,200,30); 
        Font f2 = new Font("Arial",Font.BOLD,16);
        lblTitle2.setFont(f2);
        
        lblTitle = new JLabel("______________________________________________________________________________________________________________________________");
        frm.add(lblTitle); 
        lblTitle.setBounds(30,450,900,30); 
        
        lblPlatformNo3 = new JLabel("Platform: ");
        frm.add(lblPlatformNo3);
        lblPlatformNo3.setBounds(30,490,80,30);
        txtPlatformNo3 = new JTextField();     
        frm.add(txtPlatformNo3);
        txtPlatformNo3.setBounds(170,490,170,30);
        Font f12 = new Font("Arial",Font.BOLD,14);
        lblPlatformNo3.setFont(f12);
        
        lblInterviewerName2 = new JLabel("Interviewer's Name: ");
        frm.add(lblInterviewerName2);
        lblInterviewerName2.setBounds(400,490,150,30);       
        txtInterviewerName2 = new JTextField();
        frm.add(txtInterviewerName2);
        txtInterviewerName2.setBounds(550,490,200,30);
        Font f13 = new Font("Arial",Font.BOLD,14);
        lblInterviewerName2.setFont(f13);
        
        lblSalary2 = new JLabel("Salary: ");
        frm.add(lblSalary2);
        lblSalary2.setBounds(30,550,70,30);
        txtSalary2 = new JTextField();
        frm.add(txtSalary2);
        txtSalary2.setBounds(170,550,100,30);
        Font f14 = new Font("Arial",Font.BOLD,14);
        lblSalary2.setFont(f14);
        
        lblWorkingHours2 = new JLabel("Working Hours: ");
        frm.add(lblWorkingHours2);
        lblWorkingHours2.setBounds(400,550,120,30);       
        txtWorkingHours2 = new JTextField();
        frm.add(txtWorkingHours2);
        txtWorkingHours2.setBounds(550,550,80,30);
        Font f15 = new Font("Arial",Font.BOLD,14);
        lblWorkingHours2.setFont(f15);
        
        lblAppointedBy = new JLabel("Appointed By: ");
        frm.add(lblAppointedBy);
        lblAppointedBy.setBounds(30,600,140,30);       
        txtAppointedBy = new JTextField();
        frm.add(txtAppointedBy);
        txtAppointedBy.setBounds(170,600,180,30);
        Font f16 = new Font("Arial",Font.BOLD,14);
        lblAppointedBy.setFont(f16);
        
        lblTerminationDate = new JLabel("Termination Date: ");
        frm.add(lblTerminationDate);
        lblTerminationDate.setBounds(400,600,140,30);       
        txtTerminationDate = new JTextField();
        frm.add(txtTerminationDate);
        txtTerminationDate.setBounds(550,600,120,30);
        Font f17 = new Font("Arial",Font.BOLD,14);
        lblTerminationDate.setFont(f17);
        
        btnAdd2 = new JButton("Add");
        btnAdd2.setBounds(550,660,100,30);
        frm.add(btnAdd2); 
        btnAdd2.addActionListener(this);
        
        lblDeveloperName2 = new JLabel("Developer's Name: ");
        frm.add(lblDeveloperName2);
        lblDeveloperName2.setBounds(30,720,140,30);       
        txtDeveloperName2 = new JTextField();
        frm.add(txtDeveloperName2);
        txtDeveloperName2.setBounds(170,720,200,30);
        Font f18 = new Font("Arial",Font.BOLD,14);
        lblDeveloperName2.setFont(f18);
        
        lblJoiningDate2 = new JLabel("Joining Date: ");
        frm.add(lblJoiningDate2);
        lblJoiningDate2.setBounds(400,720,100,30);       
        txtJoiningDate2 = new JTextField();
        frm.add(txtJoiningDate2);
        txtJoiningDate2.setBounds(550,720,200,30);
        Font f19 = new Font("Arial",Font.BOLD,14);
        lblJoiningDate2.setFont(f19);
        
        lblSpecialization = new JLabel("Specialization: ");
        frm.add(lblSpecialization);
        lblSpecialization.setBounds(30,780,140,30);       
        txtSpecialization = new JTextField();
        frm.add(txtSpecialization);
        txtSpecialization.setBounds(170,780,200,30);
        Font f20 = new Font("Arial",Font.BOLD,14);
        lblSpecialization.setFont(f20);
        
        lblTerminationDate2 = new JLabel("Termination Date: ");
        frm.add(lblTerminationDate2);
        lblTerminationDate2.setBounds(400,780,140,30);       
        txtTerminationDate2 = new JTextField();
        frm.add(txtTerminationDate2);
        txtTerminationDate2.setBounds(550,780,120,30);
        Font f21 = new Font("Arial",Font.BOLD,14);
        lblTerminationDate2.setFont(f21);
        
        lblPlatformNo4 = new JLabel("Platform No: ");
        frm.add(lblPlatformNo4);
        lblPlatformNo4.setBounds(30,830,100,30);
        txtPlatformNo4 = new JTextField();     
        frm.add(txtPlatformNo4);
        txtPlatformNo4.setBounds(170,830,100,30);
        Font f23 = new Font("Arial",Font.BOLD,14);
        lblPlatformNo4.setFont(f23);
        
        lblEvaluationPeriod = new JLabel("Evaluation Period: ");
        frm.add(lblEvaluationPeriod);
        lblEvaluationPeriod.setBounds(400,830,150,30);
        txtEvaluationPeriod = new JTextField();
        frm.add(txtEvaluationPeriod);
        txtEvaluationPeriod.setBounds(550,830,120,30);
        Font f24 = new Font("Arial",Font.BOLD,14);
        lblEvaluationPeriod.setFont(f24);
        
        btnHire2 = new JButton("Hire");
        btnHire2.setBounds(550,880,70,30);
        frm.add(btnHire2);
        btnHire2.addActionListener(this);
        
        btnDisplayAll = new JButton("Display All");
        btnDisplayAll.setBounds(440,920,100,30);
        frm.add(btnDisplayAll);
        btnDisplayAll.addActionListener(this);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(550,920,70,30);
        frm.add(btnClear);
        btnClear.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnAdd1) {
            try {
            
                String platformP = txtPlatformNo1.getText();
                String interviewerNameI = txtInterviewerName.getText();
                String WorkingHours = txtWorkingHours.getText();
                String Salary = txtSalary.getText();
                String ContractPeriod = txtContractPeriod.getText();
                
                if (platformP.equals("") || interviewerNameI.equals("") || WorkingHours.equals("") || Salary.equals("") || ContractPeriod.equals("")) {
                
                    JOptionPane.showMessageDialog(frm,"You are requested not to input incorrect data and please do not leave empty textfield.");
                }
                else {
                
                    int workingHoursS=Integer.parseInt(WorkingHours);
                    float salaryS=Float.parseFloat(Salary);
                    int contractPeriodS=Integer.parseInt(ContractPeriod);                   
                    SeniorDeveloper seniorDeveloper = new SeniorDeveloper(platformP,interviewerNameI,workingHoursS,salaryS,contractPeriodS);
                    list.add(seniorDeveloper);
                    JOptionPane.showMessageDialog(frm,"Entered Data is Successfuly added");
                }
            }
            catch(Exception ex) {            
                JOptionPane.showMessageDialog(frm,"You are suggested to enter the valid data");
            }
        }
        
        if (e.getSource() == btnHire) {
            try {
            
                String developerNameD=txtDeveloperName.getText();
                String joiningDateJ=txtJoiningDate.getText();
                String advanceSalary=txtAdvanceSalary.getText();
                String staffRoomNoS=txtStaffRoomNo.getText();
                String platformNoP=txtPlatformNo2.getText();
                
                if(developerNameD.equals("") || joiningDateJ.equals("") || advanceSalary.equals("") || staffRoomNoS.equals("") || platformNoP.equals("")) {                
                    JOptionPane.showMessageDialog(frm,"You are requested not to input incorrect data and please do not leave empty textfield.");
                }
                else {
                    
                    float advanceSalaryA=Float.parseFloat(advanceSalary);
                    int developerNo=(Integer.parseInt(platformNoP)-1);
                    
                    if(developerNo>=0 && developerNo<list.size()) {
                        if(list.get(developerNo) instanceof SeniorDeveloper) {                        
                            SeniorDeveloper sd=(SeniorDeveloper)list.get(developerNo);
                            sd.hireDeveloper(developerNameD,joiningDateJ,advanceSalaryA,staffRoomNoS);
                            JOptionPane.showMessageDialog(frm,"Senior Developer is successfully Hired");
                        }
                        else {                        
                            JOptionPane.showMessageDialog(frm,"Not a valid platform number for Senior Developer");                            
                        }
                    }
                    else {                    
                        JOptionPane.showMessageDialog(frm,"Platform number is not Available");
                    }
                }
            }
            catch (Exception ex) {            
                JOptionPane.showMessageDialog(frm,"You are suggested to input the valid data");
            }
        }
        
        if (e.getSource() == btnTerminate) {        
            try {
            
                String developerNo1=txtPlatformNo2.getText();
                int developerNo=Integer.parseInt(developerNo1)-1;
                
                if(developerNo>=0 && developerNo<list.size()) {                
                    if(list.get(developerNo) instanceof SeniorDeveloper) {                    
                        SeniorDeveloper sd=(SeniorDeveloper)list.get(developerNo);
                        sd.termination();
                        JOptionPane.showMessageDialog(frm,"Senior Developer is Terminated Successfully");                                        
                    }
                    else {                    
                        JOptionPane.showMessageDialog(frm,"Not a valid platform number for Senior Developer");                            
                    }
                }
            }
            catch(Exception ex) {           
                JOptionPane.showMessageDialog(frm,"You are suggested to input the valid data");
            }            
        }
                        
        if (e.getSource() == btnAdd2) {        
            try {
                
                String platformP=txtPlatformNo3.getText();
                String interviewerNameI=txtInterviewerName2.getText();
                String workingHours2=txtWorkingHours2.getText();
                String salary2=txtSalary2.getText();
                String appointedByA=txtAppointedBy.getText();
                String terminationDateT=txtTerminationDate.getText();
                       
                if (platformP.equals("") || interviewerNameI.equals("") || workingHours2.equals("") || salary2.equals("") || appointedByA.equals("") || terminationDateT.equals("")) {                
                    JOptionPane.showMessageDialog(frm,"You are requested to input correct data and please do not leave empty textfield.");
                }
                else {
                
                    int workingHoursW=Integer.parseInt(workingHours2);
                    float salaryS=Float.parseFloat(salary2);        
                    JuniorDeveloper juniorDeveloper=new JuniorDeveloper(platformP, interviewerNameI, workingHoursW, salaryS, appointedByA, terminationDateT);
                    list.add(juniorDeveloper);
                    JOptionPane.showMessageDialog(frm,"Junior Developer has been Added Successfully.");
                    
                }
            }
            catch(Exception ex) {            
                JOptionPane.showMessageDialog(frm,"Enter the valid data.");         
            }
        }
                
        if (e.getSource() == btnHire2) {        
            try {
                
                String developerNameD=txtDeveloperName2.getText();
                String joiningDateJ=txtJoiningDate2.getText();
                String terminationDateT=txtTerminationDate2.getText();
                String specializationS=txtSpecialization.getText();
                String developerNo2=txtPlatformNo4.getText();
                String evaluationPeriodE=txtEvaluationPeriod.getText();
                
                if(developerNameD.equals("") || joiningDateJ.equals("") || terminationDateT.equals("") || specializationS.equals("") || developerNo2.equals("") || evaluationPeriodE.equals("")) {                
                    JOptionPane.showMessageDialog(frm,"You are insisted to input correct data and please do not leave empty textfield.");
                }
                else {                
                    int developerNo=Integer.parseInt(developerNo2)-1;                   
                    if(developerNo>=0 && developerNo<list.size()) {
                        if(list.get(developerNo) instanceof JuniorDeveloper) {                        
                            JuniorDeveloper j=(JuniorDeveloper)list.get(developerNo);
                            j.appointDeveloper(developerNameD, joiningDateJ, terminationDateT, specializationS);
                            JOptionPane.showMessageDialog(frm,"Junior Developer has been Appointed successfully.");
                        }
                        else {                        
                            JOptionPane.showMessageDialog(frm,"Invalid platform number for Junior developer.");               
                        }
                    }
                    else {                    
                        JOptionPane.showMessageDialog(frm,"Sorry!! Platform number is not Available");
                    }
                }
            }
            catch (Exception ex) {            
                JOptionPane.showMessageDialog(frm,"You are requested to input valid data.");
            }
        } 
                
        if (e.getSource() == btnDisplayAll) {        
            if(list.size()<1) {            
                JOptionPane.showMessageDialog(frm,"Nothing to Display");   
            }
            else {            
                for (Developer obj:list) {                
                    if (obj instanceof SeniorDeveloper) {                    
                        SeniorDeveloper seni = (SeniorDeveloper)obj;
                        seni.display();
                    }
                    if (obj instanceof JuniorDeveloper) {                    
                        JuniorDeveloper juni = (JuniorDeveloper)obj;
                        juni.display();
                    }
                }
            }
        }
        
        if (e.getSource() == btnClear) {
            txtPlatformNo1.setText("");
            txtInterviewerName.setText("");
            txtSalary.setText("");
            txtWorkingHours.setText("");
            txtContractPeriod.setText("");
            txtDeveloperName.setText("");
            txtJoiningDate.setText("");
            txtAdvanceSalary.setText("");
            txtStaffRoomNo.setText("");
            txtPlatformNo2.setText("");
            txtPlatformNo3.setText("");
            txtInterviewerName2.setText("");
            txtSalary2.setText("");
            txtWorkingHours2.setText("");
            txtAppointedBy.setText("");
            txtTerminationDate.setText("");
            txtDeveloperName2.setText("");
            txtJoiningDate2.setText("");
            txtSpecialization.setText("");
            txtTerminationDate2.setText("");
            txtPlatformNo4.setText("");
            txtEvaluationPeriod.setText("");
        }            
    }        
}