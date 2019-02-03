public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers(2,8);
        numbers.displayMintoMax();

        Numbers numbers2 = new Numbers(2,8);
        System.out.println(numbers2.displayListRange());

        numbers.setMin(5);
        numbers.setMax(9);
        numbers.displayMintoMax();


    }

}
