package org.howard.edu.lsp.oopfinal.question1;


public class Logger {
private static Logger logger;  // singleton instance

private String log;

private Logger() {
this.log = "";
}

public static Logger getInstance() {  // public initializer to return singleton instance.
if (logger == null) {
logger = new Logger();
}
return logger;
}

public void logMessage(String message) {
this.log += message + "\n";
}

public String displayLog() {
return ("Log:\n" + log);
}
}