import java.io.Console;

//cost based on weight and distance
//function to take in weight and distance
//function to calculate cost
//function to output cost

public class ShipCost {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("This application will calculate the shipping cost based on weight and distance.");
    System.out.println("Enter the weight for your package in pounds: ");
    Float weight = inputWeight();
    System.out.println("Enter the distance in miles you want to ship: ");
    Float distance = inputDistance();

    Float cost = calculateCost(weight, distance);
    outputCost(cost, weight, distance);
  }

  public static float inputWeight() {
    Console myConsole = System.console();

    Float weight = Float.parseFloat(myConsole.readLine());
    return weight;
  }

  public static float inputDistance() {
    Console myConsole = System.console();

    Float distance = Float.parseFloat(myConsole.readLine());
    return distance;
  }

  public static float calculateCost(Float weight, Float distance) {
    Float cost = (weight/10) + (distance/5) * 5;
    return cost;
  }
  public static void outputCost(Float cost, Float weight, Float distance) {
    System.out.println("The cost to ship your package that weighs " + weight + " lbs a distance of " + distance + " miles is $" + cost);
  }
}
