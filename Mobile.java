package week1.assignments;

public class Mobile {
	public void makeCall() {
		String mobileModel = "Iphone15";
		float mobileWeight = 220.5f;
		System.out.println("Model" + " "+mobileModel);
		System.out.println("Weight"+" "+mobileWeight);
	}
	public void sendMsg() {
		boolean isFullyCharged = true;
		int mobileCost = 80000;
		System.out.println("IsFullyCharged"+" "+isFullyCharged);
		System.out.println("Cost"+" "+mobileCost);
		
	}
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
		
	}

}
