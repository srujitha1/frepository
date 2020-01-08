package slf4jdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
		private Logger log=LoggerFactory.getLogger(CarService.class);
		public void process(String msg)
		{
			if(log.isDebugEnabled())
			log.debug("processing: "+msg);
			log.info("hello world");
		}

}