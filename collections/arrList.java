import java.util.ArrayList;

public class arrList{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(10);
        arr.add(20);

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        
        arr.remove(2);

        for(int i : arr){
            System.out.println(i);
        }
    }
}