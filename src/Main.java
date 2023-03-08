import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        String[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập chiều dài mảng");
            size = Integer.parseInt(scanner.nextLine()) ;
            if (size>20){
                System.out.println("quá dài");
            }
        }while (size >20);
        array = new String[size];
        int index = 0;
        System.out.println(array.length);

        while (index < array.length){
            array[index] = scanner.nextLine();
            index++;
        };

        for (int i = 0; i < array.length/2; i++) {
            String max = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = max;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+"\t");
        }










    }
}