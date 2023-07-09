package mypackage;

import java.util.Scanner;

public class CarShop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String[] CarModel={"Polo Trendline","Polo Highline","Virtus Trendline","Virtus Highline","Taigun Trendline","Taigun Highline","Taigun Topline"};
	Integer[] Price={870000,1009000,1105000,1308000,1489000,1542000,1771000};
	System.out.println("Cars and Their Prices in the store");
	for(int i=0;i<CarModel.length;i++) {
		System.out.println(CarModel[i]+" "+Price[i]);
		
	}
	System.out.print("Please Enter car model: ");
	String car_model = sc.nextLine();
	int carrank=0;
	int carcost=0;
	System.out.println(car_model);
	switch(car_model) {
	case "Polo Trendline":
		carrank=1;
		carcost=870000;
		break;
	case "Polo Highline":
		carrank=2;
		carcost=1009000;
		break;
	case "Virtus Tredline":
		carrank=3;
		carcost=1105000;
		break;
	case "Virtus Highline":
		carrank=4;
		carcost=1308000;
		break;
	case "Taigun Trendline":
		carrank=5;
		carcost=1489000;
		break;
	case "Taigun Highline":
		carrank=6;
		carcost=1542000;
		break;
	case "Taigun Topline":
		carrank=7;
		carcost=1771000;
		break;
		
	}
	if(carrank>7 || carrank<0) {
		System.out.println("Car name is wrong");
	}
	System.out.println("car has been selected :"+CarModel[carrank-1]);
	System.out.println("The car cost is: "+carcost);
	System.out.println("Do you need Insurance(yes or no):");
	String needInsurance=sc.next();
	
	System.out.println("Do you need accesseries(yes or no):");
	String needAccesseries=sc.next();
	
	System.out.println("Enter Discount type(percentage/value): ");
	String discount_type=sc.next();
	
	System.out.println("Enter Discount amount: ");
	int discount=sc.nextInt();
	
	CarDetails cd=new CarDetails(carcost);
	
	int Amount=cd.calculateAmount1(needInsurance,needAccesseries);
	
	double dis_main=cd.discount1(discount_type,discount);
	System.out.println("Total Discount"+dis_main);
	//int total=cd.addrto(carcost);
	Double total=Amount-dis_main;
	//Double Final=total-dis_main;
	
	System.out.println("Total amount:"+total);
	
	}
}
