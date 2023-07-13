package homeworkjava;

import java.util.Scanner;

public class CombineWords {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.println("Enter the second word: ");
        String word2 = scanner.nextLine();

        int word1Length = word1.length();
        int word2Length = word2.length();

        if(word1Length % 2 != 0 || word2Length % 2 != 0) {
            System.out.println("The words must on even number of letter");
            return;

        }
        String combinedWord = word1.substring(0, word1Length / 2) + word2.substring(word2Length / 2);
        System.out.println("The combined word is: " + combinedWord);

    }

    }

