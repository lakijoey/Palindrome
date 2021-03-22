import java.util.Scanner;

public class Main {


    public static void program() {
        System.out.println("Type a sentence and I will tell if it is a palindrome or not.");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        int counter = 0;
        char[] charactersOfCurrentSentence = sentence.toCharArray();
        int k = charactersOfCurrentSentence.length - 1;
        for (int i = 0; i < charactersOfCurrentSentence.length / 2; i++) {
            if (charactersOfCurrentSentence[i] == charactersOfCurrentSentence[k]) {
                counter++;
            }
            k--;
        }
        if (counter == charactersOfCurrentSentence.length / 2) {
            System.out.println("Yes, it is.");
        } else {
            System.out.println("No, it's not");
        }
        askMe();
    }

    public static void askMe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check an other one? ('c' for continue, 'q' for quit)");
        String c = sc.next();
        if (c.equals("c") || c.equals("C")){
            program();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        program();
    }
}
