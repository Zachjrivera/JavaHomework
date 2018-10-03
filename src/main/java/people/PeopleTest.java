package people;

public class PeopleTest {
    public static void main(String[] args) {

      People person = new People();

      person.add(new Person(1793677,"Zach"));
      person.add(new Person(123456789,"Troy"));

       //System.out.println(person.getCount());
        person.remove(1793677);
        System.out.println(person.getCount());
        person.remove(new Person(123456789,"Troy"));
        System.out.println(person.getCount());
//        System.out.println(person.getArray());
//        person.removeAllEntrides();
//       person.findID(1793677);
       // System.out.println(person.getArray());







        //============================================================
    }

}
