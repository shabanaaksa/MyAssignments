package week1.day1;

public class TwoWheeler {

	int noOfWheels=2;
	short noOfMirrors=1;
	long chassisNumber=6545334;
	boolean isPunctured=false;
	String bikeName="RoyalEnfield";
	double runningKM=321;
	
	public static void main(String[] args) {
		TwoWheeler bike=new TwoWheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);

	}

}
