import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("enter 1 for leap year finder : ");
        System.out.println("enter 2 to find day and dates : ");
        System.out.println("enter 3 for date difference : ");
        System.out.println("enter 4 for time difference : ");
        System.out.println("enter 5 date and time differnce : ");
        System.out.println("enter 6 add time : ");
        System.out.println("enter 7 sub time : ");
        System.out.println("enter 8 add date : ");
        System.out.println("enter 9 sub date : ");
        System.out.println("enter 10 add date and time : ");
        System.out.println("enter 11 sub date and time : ");
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        switch (val) {
            case 1:
                System.out.println("enter a 1 for check year is leap year or not : ");
                System.out.println("enter a 2 for first and last 20 years leap years : ");
                int choise = in.nextInt();
                if(choise == 1){
                    LeapYear.checkLeap();
                }
                else{
                    LeapYear.bulkLeap();
                }
                break;
            case 2:
                MonthAndDays md = new MonthAndDays();
                break;
            case 3:
                DateDifference dd = new DateDifference();
                break;
            case 4:
                TimeDifference td = new TimeDifference();
                break;
            case 5:
                DateAndTimeDiff dtf = new DateAndTimeDiff();
                break;
            case 6:
                System.out.println("enter starting time : ");
                int[] stime = Input.inputTime();
                System.out.println("enter ending time : ");
                int[] etime = Input.inputTime();
                long ans = TimeAdd.timeAdd(stime, etime);
                System.out.println(ans/60/60);
                System.out.println(ans/60%60);
                System.out.println(ans%60);
                break;

            case 7:
                TimeDifference td1 = new TimeDifference();
                break;
            case 8:
                System.out.println("enter a date : ");
                int[] start = Input.inputDate();
                int[] end = Input.inputToSumDate();
                int[] ans1 = SumOnDate.dateAdd(start, end);
                System.out.println("date is : "+ans1[0]);
                System.out.println("month is : "+ans1[1]);
                System.out.println("year is : "+ans1[2]);
                break;
            case 9:
                System.out.println("enter a date : ");
                int[] start1 = Input.inputDate();
                System.out.println("enter a days : ");
                int[] end1 = Input.inputToSumDate();
                int[] ans11 = SumOnDate.dateSub(start1, end1);
                System.out.println("date is : "+ans11[0]);
                System.out.println("month is : "+ans11[1]);
                System.out.println("year is : "+ans11[2]);
                break;
            case 10:
                int[] date = Input.inputDate();
                int[] time = Input.inputTime();
                int[] cur = new int[6];
                cur[0] = date[0];cur[1] = date[1];cur[2] = date[2];cur[3] = time[0]; cur[4] = time[1]; cur[5] = time[2];
                int[] inp = Input.inputToSumDateTime();
                int[] ans2 = SumOnDate.dateTimeAdd(cur, inp);
                for (int i : ans2) {
                    System.out.println(i);
                }
                break;
            case 11:
                int[] date1 = Input.inputDate();
                int[] time1 = Input.inputTime();
                int[] cur1 = new int[6];
                cur1[0] = date1[0];cur1[1] = date1[1];cur1[2] = date1[2];cur1[3] = time1[0]; cur1[4] = time1[1]; cur1[5] = time1[2];
                int[] inp1 = Input.inputToSumDateTime();
                int[] ans22 = SumOnDate.dateTimeSub(cur1, inp1);
                for (int i : ans22) {
                    System.out.println(i);
                }
                break;
            default:
                System.out.println("enter a right value.");
                break;
        }
    }
}
