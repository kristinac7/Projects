public class Person {

    private int ssn;
    private String name;
    private String gender;

    public Person(int ssn, String name, String gender) {
        this.ssn = ssn;
        this.name = name;
        this.gender = gender;
    }

    public int getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person: " +
                "SSN = " + ssn +
                ", name = " + name +
                ", gender = " + gender;
    }
}
