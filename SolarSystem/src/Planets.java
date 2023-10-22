public abstract class Planets {

    private String name;
    private double mass;
    private double diameter;
    private double density;
    private double gravity;
    private double lengthOfDay;

    public Planets(String name, double mass, double diameter, double density, double gravity, double lengthOfDay) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravity = gravity;
        this.lengthOfDay = lengthOfDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getLengthOfDay() {
        return lengthOfDay;
    }

    public void setLengthOfDay(double lengthOfDay) {
        this.lengthOfDay = lengthOfDay;
    }


    public double astronomicalUnitKilometers(){
        return 149597870.7; // 1 Astronomisk enhed i km
    }

    public double gravitationalConstant(){
        return 4 * Math.pow(Math.PI, 2); // Gravitationskonstanten
    }

    public abstract double orbitalPeriodDays();



    public double distanceToSun(Planets planet){
        double distance = 0;
        switch(planet.getName()){
            case "Mercury":
                distance = 57.9;
                break;
            case "Venus":
                distance = 108.2;
                break;
            case "Earth":
                distance = 149.6;
                break;
            case "Mars":
                distance = 227.9;
                break;
            case "Jupiter":
                distance = 778.3;
                break;
            case "Saturn":
                distance = 1427.0;
                break;
            case "Uranus":
                distance = 2871.0;
                break;
            case "Neptune":
                distance = 4497.1;
                break;
            case "Pluto":
                distance = 5913.0;
                break;
        }
        return Double.parseDouble(distance + " million km");
    }
}


