
import java.util.Scanner;
class Info {
int subjects;
int marks;
double totalMarks;
int cutOFF;
int i,j;
private char grade;
private double percentage;
public void Calculation()
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of subjects : ");
    subjects=sc.nextInt();
    sc.nextLine();
    String Subj[]=new String[subjects];
    for(int j=0;j<subjects;j++)
    {
        System.out.println("Enter the name of subject :"+(j+1)+":");
        Subj[j]=sc.nextLine();
    }
    // for (String A1 : Subj) {
    //     System.out.println(A1);
        
    // }
    System.out.println("Enter the cuttoff of subjects");
    cutOFF=sc.nextInt();
     for(i=0;i<subjects;i++,j++){
        try{
               
        System.out.println("Enter the mark of Subject :"+ Subj[j]);
            marks=sc.nextInt();
            if( marks<0||marks>100){
                System.out.println("The marks you entered for subject "+Subj[j] + " is invalid !!");
                i--;
                j--;
                continue;
            }
             
            if(marks>=cutOFF){
                totalMarks+=marks;
            }
            else{
                System.out.println("You are fail in subject "+ Subj[j]);
                totalMarks+=marks;
            }
            Thread.sleep(200);
           
        }catch(InterruptedException e){
            System.out.println("There is something wrong");
        }
        
            
        }
        try{
            System.out.print("Calculating grade ");
            Thread.sleep(250);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);

            System.out.println();
       // getPercentage();
            System.out.println("The total marks of subjects is :"+totalMarks);
            Thread.sleep(250);
            System.out.println("The pecentage is :"+this.getPercentage());
            Thread.sleep(200);
            System.out.println("Your grade is "+this.getGrade());

        }catch(Exception e1){
            System.out.println("something went wrong!!");
        }

        sc.close();

}
public char getGrade(){

        if (getPercentage() >= 90) {
            grade = 'A';
        } else if (getPercentage() >= 80) {
            grade = 'B';
        } else if (getPercentage()>= 70) {
            grade = 'C';
        } else if (getPercentage()>= 60) {
            grade = 'D';
        } else if (getPercentage()>= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        return grade;
}
public double getPercentage(){
    double  percentage= totalMarks/(subjects*100)*100;
      return percentage;
}


}

public class GradeCalculator {
    public static void main(String[] args) {
        Info in=new Info();
        in.Calculation();
    }
}

