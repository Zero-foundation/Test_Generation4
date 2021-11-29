package newTest;
public class BankAccount {

    private int balance;
    private int numberOfWithdrawals;


    public BankAccount(int amount) {
        balance = amount;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            System.out.println("I am easily reachable in deposit");
            balance = balance + amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("I am easily reachable in withdraw");
            return;
        }
        if (numberOfWithdrawals >= 5) {// was 10
            assert (false);
            System.out.println("I am very hard to reach in withdraw");
            return;
        }
        balance = balance - amount;
        numberOfWithdrawals++;
    }

    /* ----- Test Driver ----- */

    public static void testDriver(int length) {
        BankAccount b = new BankAccount(0);
        for (int i = 0; i < length; i++) {
            switch (flag(true)) {
                case 0:
                    b.deposit(10);
                    break;
                case 1:
                    b.withdraw(1);
                    break;
            }
        }
    }

    public static int flag(boolean x) {
        if (x)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        testDriver(3);
        System.out.println();
    }
}
//@The following comments are auto-generated to save options for testing the current file
//@jcute.optionPrintOutput=true
//@jcute.optionLogPath=true
//@jcute.optionLogTraceAndInput=true
//@jcute.optionGenerateJUnit=true
//@jcute.optionExtraOptions=
//@jcute.optionJUnitOutputFolderName=/home/lzl/Downloads/jcute
//@jcute.optionJUnitPkgName=
//@jcute.optionNumberOfPaths=10000
//@jcute.optionLogLevel=3
//@jcute.optionDepthForDFS=0
//@jcute.optionSearchStrategy=0
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=false
