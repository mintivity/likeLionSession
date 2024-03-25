public class FishBread {
    int size;
    String taste;

    public void fishPrint(){
        System.out.println("붕어빵의 크기는 "+size+"cm");
        System.out.println("붕어빵의 맛은 "+taste);
    }

    public static void main(String[] args) {
        FishBread fishBread = new FishBread();
        fishBread.size = 10;
        fishBread.taste = "팥";

        FishBread fishBread1 = new FishBread();
        fishBread1.size = 15;
        fishBread1.taste = "슈크림";

        fishBread.fishPrint();
        fishBread1.fishPrint();


    }
}
