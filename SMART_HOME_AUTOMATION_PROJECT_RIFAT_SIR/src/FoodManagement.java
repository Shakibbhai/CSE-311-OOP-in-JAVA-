import java.io.*;
import java.util.*;

class FoodManagement {
    private List<String> foodList;
    private Map<String, List<String>> mealSchedule;

    public FoodManagement() {
        foodList = new ArrayList<>();
        mealSchedule = new HashMap<>();
    }

    public void readFoodsFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                foodList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFoodsToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (String food : foodList) {
                writer.println(food);
            }
            System.out.println("Food items have been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addFoodToFile(String foodItem, String fileName) {
        foodList.add(foodItem);
        writeFoodsToFile(fileName);
    }

    public void removeFoodFromFile(String foodItem, String fileName) {
        foodList.remove(foodItem);
        writeFoodsToFile(fileName);
    }

    public void scheduleMeal(String time, List<String> items) {
        mealSchedule.put(time, items);
    }

    public void displayFoodList() {
        System.out.println("Food List:");
        for (String item : foodList) {
            System.out.println(item);
        }
    }

    public void displayMealSchedule() {
        System.out.println("Meal Schedule for Today:");
        for (Map.Entry<String, List<String>> entry : mealSchedule.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
