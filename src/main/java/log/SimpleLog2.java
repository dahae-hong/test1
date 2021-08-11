package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLog2 {
private static final Logger logger=LoggerFactory.getLogger(LogTest.class);
	
	public static void main(String[] args) {
//		log.error("error 레벨");
//		log.warn("warn 레벨");
//		log.info("info 레벨");
//		log.debug("debug 레벨");
//		log.trace("trace 레벨");
		
		logger.error("error 레벨");
		logger.warn("warn 레벨");
		logger.info("info 레벨");
		logger.debug("debug 레벨");
		logger.trace("trace 레벨");
	}
}
