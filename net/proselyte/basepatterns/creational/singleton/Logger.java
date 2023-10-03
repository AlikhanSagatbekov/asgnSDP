package net.proselyte.basepatterns.creational.singleton;
public class Logger {
    private static Logger logger;
    private static String logfile = "This is log file. \n\n";

    public static synchronized Logger getLogger(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;

    }
    private Logger(){

    }

    public void addLogInfo(String logInfo){
        logfile += logInfo  + "\n";
    }

    public void showLogFile(){
        System.out.println(logfile);
    }

}
