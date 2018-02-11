package siit.homework.PersonHobbies;

import siit.homework.PersonSortNameAge.*;

import java.util.*;

public class Hobby {

    String name;
    int frequency;
    private static ArrayList<Address> addressesListSwimming;
    private static ArrayList<Address> addressesListRunning;
    private static ArrayList<Address> addressesListFitness;


    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return this.name + " " + this.frequency + " sesiuni/saptamana";
    }

    public static void main(String[] args) {

        Person person1 = new Person("Sebi", 31);

        Hobby swimming = new Hobby("Swimming", 3);
        Hobby running = new Hobby("Running", 2);
        Hobby fitness = new Hobby("Fitness", 2);

        List<Hobby> hobbies1 = new ArrayList<Hobby>();
        hobbies1.add(swimming);
        hobbies1.add(running);
        hobbies1.add(fitness);

        addressesListSwimming = new ArrayList<Address>();
        addressesListSwimming.add(new Address("Str. Mihai Viteazu", "Timisoara; "));
        addressesListSwimming.add(new Address("Str. Petre Olariu", "Timisoara; "));

        addressesListRunning = new ArrayList<Address>();
        addressesListRunning.add(new Address("Str. Piersicului", "Dumbravita; "));
        addressesListRunning.add(new Address("Str. Cetatii", "Timisoara; "));

        addressesListFitness = new ArrayList<Address>();
        addressesListFitness.add(new Address("Str. Buziasului", "Timisoara; "));
        addressesListFitness.add(new Address("Bvd. Eroilor", "Dumbravita; "));

        Map<Person, List<Hobby>> personHobbyMap = new HashMap<Person, List<Hobby>>();
        personHobbyMap.put(person1, hobbies1);

        Map<Hobby, List<Address>> hobbyAddressLinkedHashMap = new LinkedHashMap<Hobby, List<Address>>();
        hobbyAddressLinkedHashMap.put(swimming, addressesListSwimming);
        hobbyAddressLinkedHashMap.put(running, addressesListRunning);
        hobbyAddressLinkedHashMap.put(fitness, addressesListFitness);

        for (Map.Entry<Person, List<Hobby>> entry : personHobbyMap.entrySet()) {
            System.out.println(entry.getKey() + ", Hobbies: " + entry.getValue());
        }
        for (Map.Entry<Hobby, List<Address>> entry : hobbyAddressLinkedHashMap.entrySet()) {
            System.out.println("For " + entry.getKey() + ", the addresses are: " + entry.getValue());
        }

    }
}

