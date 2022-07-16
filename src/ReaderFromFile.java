import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReaderFromFile {

    List city = new ArrayList<>();// Создаем список

    /**
     * Читаем файл и добовляем в список
     */
    public List readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            while (line != null) {
                String[] cityValue = line.split("=");
                city.add(new City(cityValue[0], Integer.parseInt(cityValue[1])));
                line = reader.readLine();
            }
        } catch (IOException e) {
        }
        return city;//возврощает города
    }


    public List toSortList(List city){
        Collections.sort(city);
        return city;
    }
}
