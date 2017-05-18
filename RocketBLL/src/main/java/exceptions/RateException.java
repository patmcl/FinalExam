package exceptions;
import java.io.Serializable;

import rocketDomain.RateDomainModel;


public class RateException extends Exception implements Serializable{

	private RateDomainModel RateDomainModel;
	private double GivenCreditScore;
	private double GivenIncome;
	
	public RateException() {
		
	}
	
	public RateException(RateDomainModel rdm) {
		this();
		this.RateDomainModel = rdm;
	}
	
	public RateException(RateDomainModel rdm, double gcs, double gi) {
		this();
		this.RateDomainModel = rdm;
		this.GivenCreditScore = gcs;
		this.GivenIncome = gi;
	}
	
	public RateException(double gcs, double gi) {
		this();
		this.GivenCreditScore = gcs;
		this.GivenIncome = gi;
	}

	public RateDomainModel getRateDomainModel() {
		return RateDomainModel;
	}
	
	public double getGivenCreditScore() {
		return GivenCreditScore;
	}
	
	public double getGivenIncome() {
		return GivenIncome;
	}
	
	
	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
