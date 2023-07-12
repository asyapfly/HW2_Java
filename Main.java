import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        System.out.println("Введите элементы массива");
        ArrayList<Integer> array = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            Integer next = in.nextInt();
            array.add(next);
        }
        System.out.println(nearestValue(array, 10));
    }

    public static Integer nearestValue(ArrayList<Integer> array, Integer value){
        Integer result = array.get(0);
        for (Integer item : array) {
            if(Math.abs(item - value) <= Math.abs(result - value)){
                result = item;
            }
        }
        return result;
    }
}
