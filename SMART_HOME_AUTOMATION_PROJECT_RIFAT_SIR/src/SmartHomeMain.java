import java.util.*;
public class SmartHomeMain {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
    Room<String>livingRoom = new Room();
    FoodManagement foodManager = new FoodManagement();
    foodManager.readFoodsFromFile("food_items.txt");
    

    int choice;
    do {
        System.out.println("......Smart Home Management....:");
        System.out.println("1. Room management");
        System.out.println("2. Access Food Management by file for food list.");
        System.out.println("3. Manage Workers");
        System.out.println("4. Rent management monthly");
        System.out.println("5. Exit");

        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("What do you want? Choose:");
                System.out.println("1. Home decorate");
                System.out.println("2. Light, fan, TV, AC control");
                System.out.println("3. Exit room management");

                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        livingRoom.addItem("Sofa");
                        livingRoom.addItem("Coffee Table");
                        livingRoom.addItem("Lamp");
                        livingRoom.removeItem("Lamp");
                        break;
                    case 2:
                        livingRoom.turnOnLights();
                        livingRoom.turnOnFan();
                        livingRoom.turnOnAC();
                        livingRoom.turnOnTV();
                        break;
                    case 3:
                        System.out.println("Exit from room management");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
                break;
            case 2: 
                System.out.println("Choose  one :");
                System.out.println("a. Display food list from file:");
                System.out.println("b. addFood in file:");
                System.out.println("c. remove food from file:");
                System.out.println("d. tell your chef food schedule in morning ,launch and Dinner:");
                System.out.println("e.exit");
            	char choose1 = sc.next().charAt(0);
                switch (choose1) {
                case 'a': 
                	foodManager.displayFoodList();
                	break;
                case 'b':
                	// Add a new food item and write to file
                    foodManager.addFoodToFile("Orange", "food_items.txt");
                    break;
                case 'c':
                	// Remove a food item and write to file
                    foodManager.removeFoodFromFile("Salad", "food_items.txt");
                    break;
                case 'd':
                
                }
                // Access Food Management
            	 

                 // Display the read food items
                 

                 

                 

                 // Display the updated food list
                 foodManager.displayFoodList();

                 // Schedule meals
                 List<String> morningFood = new ArrayList<>();
                 morningFood.add("Eggs");
                 morningFood.add("Bread");
                 foodManager.scheduleMeal("Morning", morningFood);

                 List<String> lunchFood = new ArrayList<>();
                 lunchFood.add("Chicken");
                 lunchFood.add("Rice");
                 lunchFood.add("Salad");
                 foodManager.scheduleMeal("Lunch", lunchFood);

                 List<String> dinnerFood = new ArrayList<>();
                 dinnerFood.add("Pasta");
                 dinnerFood.add("Milk");
                 foodManager.scheduleMeal("Dinner", dinnerFood);

                 // Display the meal schedule for the day
                 foodManager.displayMealSchedule();
            	
                break;
            case 3:
                // Manage Workers
                break;
            case 4:
                // Rent management monthly
                break;
            case 5:
                System.out.println("Exiting Smart Home System. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    } while (choice != 5);

}
}

