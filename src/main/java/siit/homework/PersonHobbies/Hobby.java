package siit.homework.PersonHobbies;

import siit.homework.PersonSortNameAge.*;

import java.util.*;

public class Hobby {

    String name;
    int frequency;
    private static ArrayList<Address> addressesListSwimming;
    private static ArrayList<Address> adressesListRunning;
    private static ArrayList<Address> adressesListFitness;



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

        Person person1 = new Person("Sebi",31);
        Person person2 = new Person("Dorel",29);
        Person person3 = new Person("Bianca",30);

        Hobby swimming = new Hobby("Swimming",3);
        Hobby running = new Hobby("Running",2);
        Hobby fitness = new Hobby("Fitness",2);

        List <Hobby> hobbies1 = new ArrayList<Hobby>();
        hobbies1.add(swimming);
        hobbies1.add(running);
        hobbies1.add(fitness);

        addressesListSwimming = new ArrayList<Address>();
        addressesListSwimming.add(new Address("Str. Mihai Viteazu","Timisoara; "));
        addressesListSwimming.add(new Address("Str. Petre Olariu","Timisoara; "));

        adressesListRunning = new ArrayList<Address>();
        adressesListRunning.add(new Address("Str. Piersicului","Dumbravita; "));
        adressesListRunning.add(new Address("Str. Cetatii","Timisoara; "));

        adressesListFitness = new ArrayList<Address>();
        adressesListFitness.add(new Address("Str. Buziasului","Timisoara; "));
        adressesListFitness.add(new Address("Bvd. Eroilor","Dumbravita; "));

        Map<Person,List<Hobby>> personHobbyMap = new HashMap<Person,List <Hobby>>();
        personHobbyMap.put(person1,hobbies1);

        Map<Hobby,List<Address>> hobbyAddressLinkedHashMap= new LinkedHashMap<Hobby, List<Address>>();
        hobbyAddressLinkedHashMap.put(swimming,addressesListSwimming);
        hobbyAddressLinkedHashMap.put(running,adressesListRunning);
        hobbyAddressLinkedHashMap.put(fitness,adressesListFitness);


        System.out.println(personHobbyMap);
        System.out.println(hobbyAddressLinkedHashMap);

    }

}

