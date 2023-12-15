package using_abstract_class_interface;

abstract class Travel {
String destination;
public Travel(String destination) {
	this.destination=destination;
}
public void plan() {
	System.out.println("Planning travel "+destination);
}
public void book() {
    System.out.println("Booking place  dekhi and tickets" + destination);
}

public void travel() {
    System.out.println(" yeh Traveling to " + destination);
}

}
