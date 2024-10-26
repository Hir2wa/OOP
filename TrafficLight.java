public class TrafficLight {
    // Attributes for color and duration
    private String color;
    private int duration; // Duration in seconds

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Traffic light changed to: " + color);
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }

    // Main method to demonstrate the traffic light functionality
    public static void main(String[] args) {
        // Array of colors
        String[] colors = {"Red", "Yellow", "Green"};
        // Duration for each color
        int[] durations = {30, 5, 30}; // seconds for Red, Yellow, Green

        // Create an instance of TrafficLight
        TrafficLight trafficLight = new TrafficLight();

        // Loop through the colors and change the traffic light
        for (int i = 0; i < colors.length; i++) {
            trafficLight.changeColor(colors[i]); // Change to current color

            // Print the current color and duration
            System.out.println("Current color: " + trafficLight.color);
            System.out.println("Duration: " + durations[i] + " seconds");

            // Check the current color using switch
            switch (trafficLight.color) {
                case "Red":
                    System.out.println("Stop! The light is Red.");
                    break;
                case "Yellow":
                    System.out.println("Caution! The light is Yellow.");
                    break;
                case "Green":
                    System.out.println("Go! The light is Green.");
                    break;
                default:
                    System.out.println("Invalid color.");
            }

            // Print a separator
            System.out.println("---------------------");
        }
    }
}
