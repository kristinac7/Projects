public class Mercury extends Planets {


    public Mercury(String name, double mass, double diameter, double density, double gravity, double lengthOfDay) {
        super(name, mass, diameter, density, gravity, lengthOfDay);

    }

    @Override
    public double orbitalPeriodDays() {
        return 87.97;
    }

    double orbitalPeriodSeconds = orbitalPeriodDays() * 24 * 60 * 60; // Omløbstid i sekunder
    double semiMajorAxis = Math.pow((Math.pow(orbitalPeriodSeconds, 2) / gravitationalConstant()), 1.0 / 3.0);
    double distanceToMercury = 2 * semiMajorAxis;
}


