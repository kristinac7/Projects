public class App {

    public static void main(String[] args) throws Exception {

        Mercury mercury = new Mercury("Mercury", 3.3011E23, 4879, 5427, 3.7, 4222.6);
        System.out.println(mercury.getName() + " has a diameter of " + mercury.getDiameter() + " km and a mass of " + mercury.getMass() + " kg.");
        System.out.println(mercury.getName() + " has a density of " + mercury.getDensity() + " kg/m^3 and a gravity of " + mercury.getGravity() + " m/s^2.");
        System.out.println(mercury.getName() + " has a length of day of " + mercury.getLengthOfDay() + " hours.");
        System.out.println(mercury.getName() + " has a orbital period of " + mercury.orbitalPeriodDays() + " days.");
        System.out.println("The distance from the sun to " + mercury.getName() + " is " + mercury.distanceToMercury + " km.");
    }

}
