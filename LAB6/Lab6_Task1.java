//LowBalanceCheck
public class Lab6_Task1 {
     
    public static void main(String[] args) {
        int[] accountBalances = {5000, 20000, 15000, 8000, 30000, 500, 25000, 10000, 7000, 4000};
        
        for (int i = 0; i < accountBalances.length; i++) {
            if (accountBalances[i] < 10000) {
                System.out.println("Account No. " + (i + 1) + " has Low Balance: " + accountBalances[i]);
            }
        }
    }
}
