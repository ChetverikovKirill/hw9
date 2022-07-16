import java.util.Comparator;

public class City implements Comparable<City> {

    /**
     * Класс с инфой о городах
     */
    private String name; // имя
    private int population; // количество

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getPopulation(){
        return population;
    }
    public void setPopulation(int population){
        this.population = population;
    }

    @Override
    public String toString(){
        return
                "Город : " + name + " - население = " + population;
    }

    @Override
    public int compareTo(City o) {//cравнивает города
        if (population == o.getPopulation()) {
            return 0;
        }
        return population > o.getPopulation() ? -1 : 1;
    }
}
