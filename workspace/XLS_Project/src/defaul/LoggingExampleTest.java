package defaul;

import org.apache.log4j.Logger;

public class LoggingExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add log4j.jar
		//add log4j properties directly to src folder
		//create the object in code
		
		Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("hello");
		APPLICATION_LOGS.debug("we are writing into a log file");
		APPLICATION_LOGS.debug("starting the test case xyz test");
		APPLICATION_LOGS.debug("starting the test case xyz test1");
		APPLICATION_LOGS.debug("JEET GAYE");

	}

}
