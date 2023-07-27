/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_14;

/**
 *
 * @author jeslinpjames
 */
public class EmployeeList {
    Employee emp[];
    int count;
    public EmployeeList()
    {
        count =0;
    }
    public EmployeeList(int count){
        this.count = count;
        emp = new Employee[count];
    }
    public void  getlist(){
        for(int i=0;i<count;i++){
            emp[i]= new Employee();
            System.out.println("Enter details of Employee "+(i+1)+" : ");
            emp[i].acceptDetails();                    
        }
    }
    public void printList(){
        for(int i=0;i<count;i++){
            System.out.println("Employee "+(i+1)+" : ");
            emp[i].displayDetails();
        }
    }
    public void sortList(){
        for(int i=0;i<count;i++){
            for (int j =0;j<count;j++){
                if(emp[i].getSalary()>emp[j].getSalary())
                {
                    Employee temp =emp[i];
                    emp[i]=emp[j];
                    emp[j]=temp;
                }
            }
        }
    }          
}
