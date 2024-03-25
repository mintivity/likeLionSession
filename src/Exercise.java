import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList(10);
        arrayList.add("infp");
        arrayList.add("enfp");

        for(int i = 0; i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
