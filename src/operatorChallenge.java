public class OperatorChallenge {
    public static void main(String[] args) {
        double firstVar = 20.00;
        double secondVar = 80.00;
        double thirdVar = (firstVar + secondVar) * 100.00;
        System.out.println("My Vaules Total =" +" " + thirdVar);
        double remainder = thirdVar % 40.00;
        System.out.println("The Remainder is =" + " " + remainder);
        boolean isNotRemainder = (remainder == 0 ? true : false);
        if (!isNotRemainder) {
            System.out.println("Got Some Remainder");
       }
    }
}
