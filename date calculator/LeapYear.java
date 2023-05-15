import java.util.Scanner;

public class LeapYear {
    static void bulkLeap(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter year : ");
        int year = in.nextInt();
        year -= 20;
        for(int i = 0; i < 41; i++){
            if(Mother.isLeap(year)){
                System.out.println(year+" is leap year");
            }
            else{
                System.out.println(year+" is not leap year");
            }
            year++;
        }
    }
    static void checkLeap(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter year : ");
        int year = in.nextInt();
        if(Mother.isLeap(year)){
            System.out.println(year+" is leap year");
        }
        else{
            System.out.println(year+" is not leap year");
        }
    }
}
