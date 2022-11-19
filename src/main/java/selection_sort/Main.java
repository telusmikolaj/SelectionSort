package selection_sort;

import java.io.IOException;
import java.util.List;

public class Main {

    private static final String FILE_PATH = "./src/main/resources/numsList.txt";
    private static final int RANDOM_NUM_RANGE = 1000;
    private static final int RANDOM_LIST_SIZE = 100;

    public static void main(String[] args) throws IOException {


        System.out.print("Random list before sorting: ");
        List<Integer> randomNums = RandomNumbersGenrator.generateRandomNumsList(RANDOM_LIST_SIZE, RANDOM_NUM_RANGE);
        ListPrinter.printList(randomNums);

        System.out.print("Random list sorted: ");
        List<Integer> sortedRamdomList = SelectionSort.sort(randomNums);
        ListPrinter.printList(sortedRamdomList);

        System.out.println("------------");
        System.out.print("Nums from list: ");
        List<Integer> numsList = FileLoader.loadNumListFromFile(FILE_PATH);
        ListPrinter.printList(numsList);

        System.out.print("Nums from list sorted: ");
        List<Integer> sortedNumsListFromFile = SelectionSort.sort(numsList);
        ListPrinter.printList(sortedNumsListFromFile);
    }
}
