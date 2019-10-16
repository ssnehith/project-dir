package org.cap.pro;

public class TaxCalculator 
{
	String empName;
	double empSal;
	 boolean isIndian;
	 
	public TaxCalculator(String empName, double empSal, boolean isIndian) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.isIndian = isIndian;
	}

	public void calculateTax(String empName,
	double empSal, boolean isIndian) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
	{
		if(!isIndian)
		{
			throw new  CountryNotValidException();
		}
		else if(empName.equals(null))
		{
			throw new EmployeeNameInvalidException();
		}
		else if(empSal<10000)
		{
			throw new  TaxNotEligibleException();
		}
		else if(empSal>100000)
		{
			double tax1=empSal*8/100;
			System.out.println("tax amount" + tax1 );
		}
		else if(empSal>=50000 && empSal<=100000)
		{
			double tax2=empSal*6/100;
			System.out.println("tax amount" + tax2 );
		}
		else if(empSal>=30000 && empSal<50000)
		{
			double tax3=empSal*5/100;
			System.out.println("tax amount" + tax3 );
		}
		else if(empSal>=10000 && empSal<30000)
		{
			double tax4=empSal*4/100;
			System.out.println("tax amount" + tax4 );
		}
		
		
		
	
    }
	
	public static void main(String[] args) 
	{
		TaxCalculator tc=new TaxCalculator("Tim",1000,true);
		
		try {
			tc.calculateTax(tc.empName, tc.empSal,tc.isIndian);
		} catch (CountryNotValidException e) {
			System.out.println(e);
		} catch (EmployeeNameInvalidException e) {
			System.out.println(e);
		} catch (TaxNotEligibleException e) {
			System.out.println(e);
		}
		
	 
	}


}
 class CountryNotValidException extends Exception
 {

	@Override
	public String toString() {
		return "CountryNotValidException [The employee should be an Indian citizen for calculating tax]";
	}
	 
	
 }
 class EmployeeNameInvalidException extends Exception

 {

	@Override
	public String toString() {
		return "EmployeeNameInvalidException [The employee name cannot be empty]";
	}
	 
	 
	 
 }
 class  TaxNotEligibleException extends  Exception
 {

	@Override
	public String toString() {
		return "TaxNotEligibleException [The employee does not need to pay tax]";
	}
	 
	 
	 
	 
 }
 