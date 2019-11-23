package Day35.HomeWork;

    //create a class
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it

class countries {
    public String countryname;
    public String countrycapital;
    public int population;
    public int howmanycities;
    public boolean isSafe;

    public countries(String name, int pop ,int howmany) {
        countryname = name;
        population = pop;
        howmanycities= howmany;

    }

    public countries(String capital) {
        countrycapital = capital;
    }

    public countries(int pop) {
        population = pop;
    }

    public countries(String name, String capital, int pop, boolean safe ,int howmany) {
        countryname = name;
        population = pop;
        countrycapital = capital;
        isSafe = safe;
        howmanycities=howmany;
    }

    public countries(boolean safe) {
        isSafe = safe;

    }


    public String getToKnowCountries() {
        String name = "country name  is " + countryname+"\n";
        String capital = "capital is "+ countrycapital+"\n";
        String pop = "population is " + population+"\n";
        String safe = " it is safe country ---->" + isSafe+"\n";
        String howmany = "there are "+howmanycities+" cities"+"\n";
        return name+ capital+pop+safe+howmany;

    }
}



public class HW2 {
    public static void main(String[] args) {
        countries country = new countries("Turkey", "Ankara", 500, true, 81);
        System.out.println(country.getToKnowCountries());

    }

}



