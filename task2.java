import java.util.*;
class Student_grade_calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        System.out.println("Enter the student's marks in all 3 subjects:");
        int i=0;
        while(i<3){
            int b=sc.nextInt();
            if(b>100)
                System.out.println("Enter valid marks!");
            else{
                a[i]=b;
                i++;
            }
        }
        int tot=a[0]+a[1]+a[2];
        int avg=(int)tot/3;
        System.out.println("Total Marks:"+tot+"/300");
        System.out.println("Avg Marks:"+avg);
        if(avg>89)
            System.out.println("Grade:A");
        else if(avg>79)
            System.out.println("Grade:B");
        else if(avg>69)
            System.out.println("Grade:C");
        else if(avg>59)
            System.out.println("Grade:D");
        else
            System.out.println("Grade:F");
    }
}
