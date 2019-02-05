public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers(2,8);
        numbers.displayMinToMax();

        Numbers numbers2 = new Numbers(2,8);
        System.out.println(numbers2.displayListRange());

        numbers.setMin(5);
        numbers.setMax(9);
        numbers.displayMinToMax();

        Numbers numbers3 = new Numbers(5);
        numbers3.displayMinToMax();

        Numbers numbers5 = new Numbers(3,7);
        System.out.println(numbers5.displayListExcludingValues());

    }

}
