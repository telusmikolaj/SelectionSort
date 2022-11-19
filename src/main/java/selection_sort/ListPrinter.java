package selection_sort;

import java.util.List;

public class ListPrinter {

    public static void printList(List<Integer> list) {
        System.out.println();
        for (Integer el : list) {
            System.out.print(el);
            System.out.print(" ");
        }
        System.out.println();
    }
}
