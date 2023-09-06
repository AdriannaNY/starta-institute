package lesson3.task2;

public enum City {   // we can use only this 7 cities and cant create another
    BERLIN("Берлин", 3_645_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    MOSCOW("Москва", 11_980_000) {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    ZURICH("Цюрих", 402_762) {
        @Override
        public boolean isPopular() {
            return true;}
    },
    BERN("Берн", 133_115) {
        @Override
        public boolean isPopular() {
            return true;}
    },
    LISBON("Лиссабон", 504_718) {
        @Override
        public boolean isPopular() {
            return true;}
    },
    PARIS("Париж", 2_161_000) {
        @Override
        public boolean isPopular() {
            return false;}
    },
    LONDON("Лондон", 8_982_000) {
        @Override
        public boolean isPopular() {
            return true;}
    };

//    City() {   // default constructor
//        System.out.println("Constructor City");
//    }

    private String rusName;
    private int population;
    City(String rusName, int population) {
        System.out.println("Constructor City with variable " + rusName);
        this.rusName = rusName;
        this.population = population;
    }

    @Override
    public String toString() {  //override method toString (generate toString())
        return "City: " + name() + ", Russian name: " + rusName + ", Population: " + population;
    }


    public String toString(boolean isNeedRussianName) { //Constructor with boolean parameter
        if (isNeedRussianName) {
            return "City: " + name() + ", Russian name: " + rusName + ", Population: " + population;
        } else {
            return "City: " + name() + ", Population: " + population;
        }
    }

    public abstract boolean isPopular(); //create abstract method isPopular, it haven't body
                                         // enum can't be abstact type of class, but can have abstract methods inside
                                         //this method must be overrided in every object of enum

}
