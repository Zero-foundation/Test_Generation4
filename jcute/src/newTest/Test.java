package newTest;
public class Test {
    static public void test(int x, int y) {
        int z = x - y;

        if (x > y && y > 0) {
            if (z > 0) {
                System.out.println("z>0");
            } else {
                System.out.println("z<=0");
            }
        }


    }

    /* ----- Test Driver ----- */
    public static void main(String[] args) {

        test(1, 2);
    }
}
//@The following comments are auto-generated to save options for testing the current file
//@jcute.optionPrintOutput=true
//@jcute.optionLogPath=true
//@jcute.optionLogTraceAndInput=true
//@jcute.optionGenerateJUnit=true
//@jcute.optionExtraOptions=
//@jcute.optionJUnitOutputFolderName=/home/lzl/Downloads/jcute
//@jcute.optionJUnitPkgName=buffer-jtest
//@jcute.optionNumberOfPaths=100
//@jcute.optionLogLevel=3
//@jcute.optionDepthForDFS=0
//@jcute.optionSearchStrategy=1
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=false
