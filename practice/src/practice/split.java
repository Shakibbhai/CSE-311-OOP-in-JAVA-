package practice;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arraylist;

public class split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.println("Please enter the customer information string:");
        String customerInfo = scanner.nextLine();

        // Step 2: Split the input string into an array of individual values
        String[] customerInfoArray = customerInfo.split(",");

        // Step 3: Extract the customer's name, email address, and phone number from the array
        ArrayList <String> customerInfoList = new ArrayList<>(Arrays.asList(customerInfoArray));
        String customerName = customerInfoList.get(0).trim();
        String customerEmail = customerInfoList.get(1).trim();
        String customerPhone = customerInfoList.get(2).trim().replace(" ", "");

        // Step 4: Remove any spaces from the phone number string

        // Step 5: Format the extracted values into a new string
        String formattedCustomerInfo = String.format("Customer Name: %s\nEmail Address: %s\nPhone Number: %s",
                customerName, customerEmail, customerPhone);

        // Step 6: Print out the new formatted string
        System.out.println(formattedCustomerInfo);

