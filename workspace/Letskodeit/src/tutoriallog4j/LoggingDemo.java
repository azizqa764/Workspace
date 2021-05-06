package tutoriallog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	
	private static final Logger log =  LogManager.getLogger(LoggingDemo.class.getName());

	public static void main(String[] args) {
    log.debug("debug message logged");
    log.error(" raunak chutiya");
    log.fatal("fatal error logged ");
    log.info("info messaged logged");
    log.trace("trace message logged");
    log.fatal("fatal chitiya kailaiyyaa");
    
    //first program till here 
    // 2nd program starts with the same thing
    
	}

}
