package practice;

public class car_bicycle_vehicle {
	public static void main(String [] args) {
		
		cari_inheritence car=new cari_inheritence();
		vehicle_inheritence car1=new vehicle_inheritence();
		bicycle_inheritence car3=new bicycle_inheritence();
		
		car.go();
		
		car1.stop();
		
		System.out.println(car.speed);
		System.out.println(car3.speed);
		System.out.println(car.doors);
		System.out.println(car3.pedels);
		
		
	}//  inheritance=  the process where one class acquires and atributes and method of another class.

}
