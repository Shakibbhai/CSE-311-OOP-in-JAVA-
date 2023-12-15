import java.util.ArrayList;
import java.util.List;

class Room<T> {
      List<T> items;
     private boolean lights;
     private boolean fan;
     private boolean ac;
     private boolean tv;

    public Room() {
        this.items = new ArrayList<>();
        this.lights = false;
        this.fan = false;
        this.ac = false;
        this.tv = false;
    }

    
	public void addItem(T item) {
        items.add(item);
        System.out.println(item + " added to the room.");
    }

    public void removeItem(T item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item + " removed from the room.");
        } else {
            System.out.println(item + " is not in the room.");
        }
    }

    public void turnOnLights() {
        lights = true;
        System.out.println("Lights are turned on.");
    }

    public void turnOffLights() {
        lights = false;
        System.out.println("Lights are turned off.");
    }

    public void turnOnFan() {
        fan = true;
        System.out.println("Fan is turned on.");
    }

    public void turnOffFan() {
        fan = false;
        System.out.println("Fan is turned off.");
    }

    public void turnOnAC() {
        ac = true;
        System.out.println("AC is turned on.");
    }

    public void turnOffAC() {
        ac = false;
        System.out.println("AC is turned off.");
    }

    public void turnOnTV() {
        tv = true;
        System.out.println("TV is turned on.");
    }

    public void turnOffTV() {
        tv = false;
        System.out.println("TV is turned off.");
    }
}