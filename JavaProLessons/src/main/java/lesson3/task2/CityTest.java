package lesson3.task2;

public class CityTest {
    public static void main(String[] args) {
        City.valueOf("BERN"); //Constructor in console automatically - 7 times

        City[] cities = City.values();  //create array cities with enum's values
        System.out.println();  //look at them in Debug, will see created 7 objects with 4 variables each:
                               // our created: rusName, population, automatically created: name, ordinal


        //============Pluses of override method toString====================
        for (City city:cities) {
            System.out.println(city); // object city in println
                                      // inside method println "pod kapotom" have method toString,
                                      // toString will in Console automatically 7 times and will show String representation  of object city
        }
        City berlin = City.BERLIN; //create object berlin
        String cityInfo = berlin.toString(); // use toString in variable cityInfo for further using in code
        System.out.println(); // see in Debug, Java use toString in Debug automatically also for best representation of information about created objects
        //===================================================================

        System.out.println(berlin.toString(true)); //use constructor with boolean parameter
        System.out.println(berlin.toString(false));


        City paris = City.PARIS; //create object paris
        System.out.println(berlin.isPopular()); //abstract method isPopular  //true
        System.out.println(paris.isPopular()); //false




    }
}
