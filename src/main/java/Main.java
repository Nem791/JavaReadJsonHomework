import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MovieRepository repository = new MovieRepository();
        ArrayList<Movie> list = repository.getData();
        repository.printList(list);
    }
}
