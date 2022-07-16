public class main {
    public static void main(String[] args) {

        ReaderFromFile reader = new ReaderFromFile();

        reader.readFromFile("File.txt.txt");

        System.out.println(reader.toSortList(reader.city));


    }
}
