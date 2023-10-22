

public class Main {

    public static void main(String[] args) {

//        Database.insertPerson(new Person(1202, "Jens", "Male"));
//        Database.insertPerson(new Person(1021, "Janne", "Female"));
//        Database.deletePerson(1021);
          Database.editPerson(1202, "Hans");

        for (Person p : Database.findPeople()) {
            System.out.println(p);
        }

    }
}
