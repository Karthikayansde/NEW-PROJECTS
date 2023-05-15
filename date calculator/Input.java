import java.util.Scanner;

public class Input {
    static int[] inputDate(){
        int[] date = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.print("enter a day (1-31) : ");
        date[0] = in.nextInt();
        System.out.print("enter a month (1-12) : ");
        date[1] = in.nextInt();
        date[1]--;
        System.out.print("enter a year : ");
        date[2] = in.nextInt();
        return date;
    }
    static int[] inputForDate(){
        int[] date = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.print("enter a day (0-6) : ");
        date[0] = in.nextInt();
        System.out.print("enter a month (1-12) : ");
        date[1] = in.nextInt();
        date[1]--;
        System.out.print("enter a year : ");
        date[2] = in.nextInt();
        return date;
    }
    static int[] inputTime(){
        int[] time = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.print("enter a hour (00-23) : ");
        time[0] = in.nextInt();
        System.out.print("enter a minute (00-59) : ");
        time[1] = in.nextInt();
        System.out.print("enter a seconds (00-59) : ");
        time[2] = in.nextInt();
        return time;
    }
    static int[] inputToSumDate(){
        int[] input = new int[4];
        Scanner in = new Scanner(System.in);
        System.out.print("enter a years : ");
        input[0] = in.nextInt();
        System.out.print("enter a months : ");
        input[1] = in.nextInt();
        System.out.print("enter a weeks : ");
        input[2] = in.nextInt();
        System.out.print("enter a days : ");
        input[3] = in.nextInt();
        return input;
    }
    static int[] inputToSumDateTime(){
        int[] input = new int[7];
        Scanner in = new Scanner(System.in);
        System.out.print("enter a years : ");
        input[0] = in.nextInt();
        System.out.print("enter a months : ");
        input[1] = in.nextInt();
        System.out.print("enter a weeks : ");
        input[2] = in.nextInt();
        System.out.print("enter a days : ");
        input[3] = in.nextInt();
        System.out.print("enter a hours : ");
        input[4] = in.nextInt();
        System.out.print("enter a minutes : ");
        input[5] = in.nextInt();
        System.out.print("enter a seconds : ");
        input[6] = in.nextInt();
        return input;
    }
}
