package jpf_test_cases.replicatedcasestudies;

import cute.Cute;//import GenericCollection;
//import ca.replicatedworkers.ReplicatedWorkers;
//import ca.replicatedworkers.Configuration;

public class Generic {
  public static void main( String arg[] )
  {
    ReplicatedWorkers theInstance;
    Configuration theConfig;
    Collection workPool;
    Collection resultPool;


    theConfig = new Configuration(Configuration.EXCLUSIVE, 
                                  Configuration.SYNCHRONOUS, 
                                  Configuration.SOMEVALUES);
    workPool = new Collection();
    resultPool = new Collection();

    theInstance = new ReplicatedWorkers(theConfig, workPool, resultPool,
                                        4, 1);
    theInstance.putWork();
    theInstance.execute();
System.out.println("pool size "+theInstance.getPoolSize());

    Cute.Assert(theInstance.GlobalDone || theInstance.getPoolSize()==0);

    theInstance.destroy();
  }
}

//@The following comments are auto-generated to save options for testing the current file
//@jcute.optionPrintOutput=false
//@jcute.optionLogPath=true
//@jcute.optionLogTraceAndInput=false
//@jcute.optionGenerateJUnit=false
//@jcute.optionExtraOptions=
//@jcute.optionJUnitOutputFolderName=d:\sync\work\cute\java
//@jcute.optionJUnitPkgName=
//@jcute.optionNumberOfPaths=1
//@jcute.optionLogLevel=2
//@jcute.optionLogStatistics=true
//@jcute.optionDepthForDFS=0
//@jcute.optionSearchStrategy=0
//@jcute.optionSequential=false
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=false
