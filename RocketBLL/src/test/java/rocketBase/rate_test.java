package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {
	
	@Test
	public void RateTest() throws RateException {
		double rate = RateBLL.getRate(630);
		assertTrue(rate == 7);
	}
	
	@Test (expected = RateException.class)
	public void RateExceptionTest() throws RateException {
		RateBLL.getRate(200);
	}

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score

}
