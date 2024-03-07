import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp {
	//3. Create Logger object
	private static Logger log=Logger.getLogger(TestApp.class);
	
	public static void main(String[] args) throws IOException {
		//1. Create layout
		//Layout layout=new SimpleLayout();
		//Layout layout=new HTMLLayout();
		//Layout layout=new XMLLayout();
		Layout layout=new PatternLayout("%p %d %C %M %m %n");
		
		//2. create appender + link layout
		
		//Appender app=new ConsoleAppender(layout);
		Appender app=new FileAppender(layout, "F:\\SpringBoot Videos\\Raghu Sir MS Video\\Notes\\data.log");
		
		
		//4. link appender with logger
		log.addAppender(app);
		
		//--- Print Message ---
		log.info("FROM INFO");
		log.debug("FROM DEBUG");
		log.error("FROM ERROR");
		log.warn("FROM WARN");
		log.fatal("FROM FATAL");
		
	}
}
