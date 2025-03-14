public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int originalNum = num, remainder, result = 0, n = 0;

        int temp = num;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        temp = num;
        while (temp != 0) {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
            temp /= 10;
        }

        if (result == originalNum)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
