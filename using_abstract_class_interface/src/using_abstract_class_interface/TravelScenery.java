package using_abstract_class_interface;

public class TravelScenery extends Travel implements scenary {
	 public TravelScenery(String destination) {
	        super(destination);
	    }

	    @Override
	    public void book() {
	        System.out.println("Booking place and tickets for " + destination);
	    }

	    @Override
	    public void show() {
	        System.out.println("Enjoying the scenic beauty of " + destination);
	    }

}
