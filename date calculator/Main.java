public class Main {
    public static void main(String[] args) {
        int[] date = {21,0,2016,16,57,36};
        // int[] add = Input.inputToSumDateTime();5,6
        int[] add = {11,45,78,94,28,88,99};
        int[] ans = SumOnDate.dateTimeSub(date, add);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
// System.out.println(a/60/60%24); hours upto 24 hours
// System.out.println(a/60/60); hours upto infinity
// System.out.println(a/60%60);
// System.out.println(a%60);