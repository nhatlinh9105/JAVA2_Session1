
import java.util.ArrayList;
import java.util.Scanner;

//spellchecker: Disable
public class Main {

    public static void main(String[] args) {

        PersonManagement management = new PersonManagement();
        Scanner sc = new Scanner(System.in);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Linh", "HaNoi", 1200));
        persons.add(new Person("Quan", "DaNang", 700));
        persons.add(new Person("Huynh", "ThaiBinh", 200));
        try {
            var p = management.sortBySalary(persons);
            for (var per : p) {
                System.out.println(per.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSort by name:");
        var personsByName = management.sortByName(persons);
        for (var per : personsByName) {
            System.out.println(per.toString());
        }
    }
}
