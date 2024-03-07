import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class TestAppForPattern {
	private static Logger log=Logger.getLogger(TestAppForPattern.class);
	
	public static void main(String[] args) {
		
//		Layout layout=new PatternLayout("%d{dd-MMM-YYYY} %p --- [%M]: %C %L %m %n");
//		Appender app=new ConsoleAppender(layout);
//		
//		log.addAppender(app);
		
		log.debug("HELLO DEBUG");
		log.info("HELLO INFO");
		log.warn("HELLO WARN");
		log.error("HELLO ERROR");
		log.fatal("HELLO FATAL");
		System.out.println("FINISH");
	}
}
