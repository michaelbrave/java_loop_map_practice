package com.company;
import java.util.*;

public class carDealer {
    public static void main(String[] args) {
        HashMap<String, String> vehicles = puts();
        find(vehicles);
        // next thing
    }
    public static HashMap puts(){
        HashMap<String, String> vehicles = new HashMap<>();
        vehicles.put("F150", "Ford");
        vehicles.put("Civic", "Honda");
        vehicles.put("Mustang", "Ford");
        vehicles.put("Cybertruck", "Tesla");
        //System.out.println(vehicles);
        return vehicles;
    }
    // Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
    public static void find(HashMap vehicles){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a make and it will return the model\n");
        String item = scanner.next();
        System.out.println(vehicles.get(item));
    }
}
