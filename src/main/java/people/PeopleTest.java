package people;

public class PeopleTest {
    public static void main(String[] args) {

      People people = new People();
        Person z =new Person(1);
        Person bigAssTroy = new Person(2);
        z.setName("Zach");
        bigAssTroy.setName("fuckinTroy");
        people.add(bigAssTroy);
        people.add(z);

        /*
        //Find ID Test
        System.out.println(people.personList);
        people.findID(1);
        */

      /*
      //Get Length
       System.out.println(people.getCount());
        people.remove(2);
        System.out.println(people.getCount());
      */

      /*
      //Remove test
       people.remove(bigAssTroy);
        System.out.println(people.getCount());
      */

        /*
        //Arrayprint
   System.out.println(people.getArray());
       people.removeAllEntries();
      people.findID(1793677);
        System.out.println(people.getArray());
        */






        //============================================================
    }

}
