import java.util.*;
public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("*****************STUDENT GRADE CALCULATOR*****************");
        System.out.println("Enter the total number of subjects");
        int sub=sc.nextInt();
        System.out.println("Enter the marks out of 100");
        int total=0;
        for(int i=0;i<sub;i++){
            int marks=sc.nextInt();
            total=total+marks;
        }
        double Avg=total/sub;
        String Grade;
        if(Avg>=90){
            Grade="A+";
        }
        else if(Avg>=80){
            Grade="A";
        }
        else if(Avg>=70){
            Grade="B+";
        }
        else if(Avg>=60){
            Grade="B";
        }
        else if(Avg>=50){
            Grade="C+";
        }
        else if(Avg>=40){
            Grade="C";
        }
        else if(Avg>=30){
            Grade="D";
        }
        else{
            Grade="Fail";
        }
        System.out.println("Total marks obtained : "+total+"/"+(sub*100));
        System.out.println("The total percentage of the makrs is : "+Avg+"%");
        System.out.println("The grade obtained is : "+Grade );
        sc.close();
    }
}