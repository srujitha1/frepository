package slf4jdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarServiceTst {

	@Test
	public void test() {
		CarService sr=new CarService();
		sr.process("Servicing in my car progrs");
		
	}

}
