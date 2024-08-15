import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your zip code:");
        var cep = scanner.nextLine();

        CepSearch cepSearch = new CepSearch();
        try {
        Address address = cepSearch.searchAddress(cep);
            System.out.println(address);
            FileGenerator generator = new FileGenerator();
            generator.jsonFile(address);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Aplication done.");
        }
    }
}
