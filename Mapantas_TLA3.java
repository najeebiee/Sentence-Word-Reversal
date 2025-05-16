package main;

import java.util.*;

public class Mapantas_TLA3 {

    public static void main(String[] args) {
       
        System.out.println("Sentence Word Reversal");
        System.out.println("Enter your words (q to Quit)\n");
        
        Stack<String> sentence = new Stack<>();
        Scanner s = new Scanner(System.in);
        boolean run = true;
        boolean print = true;
        
        while (run) {
            System.out.print("word : ");
            String word = s.nextLine();
            
            if (!word.equalsIgnoreCase("q")) {
                sentence.push(word);
            } else {
                run = false;
                print = false;
            }
            
        }
        
        if (print) {
            for (String words : sentence) {
                System.out.print(words + " ");
            }
            
            System.out.print("\nReversed : ");
        
            while (!sentence.isEmpty()) {
                String popped = sentence.pop();
                System.out.print(popped + " ");
            }
            
        }
        
    }
    
}
