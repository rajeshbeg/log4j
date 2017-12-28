package kotak;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logDemo {
	
		
		
	private static Logger log = LogManager.getLogger(logDemo.class.getName());
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			log.debug("When debugging something like tap on button enter key etc");
			log.info("Object is present ");
			log.error("Object is not present");
			log.fatal("This is fatal");
		
		}

	}


