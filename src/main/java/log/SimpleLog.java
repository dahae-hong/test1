package log;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;

import dao.OracleMemberDAO;

public class SimpleLog {
	static Logger logger = Logger.getLogger(SimpleLog.class.getName());
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		OracleMemberDAO m = new OracleMemberDAO();
		logger.info(String.valueOf(m.insert("test", "1111")));
		//logger.info("[INFO] hello log4j");
	}

}
