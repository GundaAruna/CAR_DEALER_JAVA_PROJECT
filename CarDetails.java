package mypackage;
import java.util.Scanner;

public class CarDetails {
	
	Scanner sc= new Scanner(System.in);
	private final int rto=113990;
	private final int tcs=11000;
	private final int insurance=47300;
	private final int acc=15000;
	int shcost;
	int dis=0;
	String needInsurance;
	String needAccesseries;
	public CarDetails(int shcost) {
		this.shcost=shcost;
	}
	String discount_type;
	int discount;
	//calculate Discount
	public double discount1(String discount_type,int discount) {
		this.discount_type=discount_type;
		this.discount=discount;
		if(discount_type.equals("percentage")) {
			dis=Math.min((this.shcost*discount)/100,30000);
		}
		else
		{
			dis=Math.min(discount,30000);
		}
		return dis;
		}
	 int t1=0;
	
	public int calculateAmount1(String needInsurance,String needAccesseries) {
		this.needInsurance=needInsurance;
		this.needAccesseries=needAccesseries;
		if(needInsurance.equals("yes") && needAccesseries.equals("yes")) {
			t1=this.shcost+rto+tcs+insurance+acc;
		}
		if(needInsurance.equals("yes") && needAccesseries.equals("no")) {
			t1=this.shcost+rto+tcs+insurance+0;
		}
		if(needInsurance.equals("no") && needAccesseries.equals("yes")) {
			t1=this.shcost+rto+tcs+0+acc;
		}
		if(needInsurance.equals("no") && needAccesseries.equals("no")) {
			t1=this.shcost+rto+tcs+0+0;
		}
		
		return t1;
	}

}
