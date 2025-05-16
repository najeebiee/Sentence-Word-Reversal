/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.*;

public class Mapantas_TLA3 {

    public static void main(String[] args) {
       
        System.out.println("Sentence Reverse");
        System.out.println("Enter your words (q to Quit)\n");
        
        Stack<String> sentence = new Stack<>();
        Scanner s = new Scanner(System.in);
        boolean run = true;
        
        while (run) {
            System.out.print("word : ");
            String word = s.nextLine();
            
            if (!word.equalsIgnoreCase("q")) {
                sentence.push(word);
            } else {
                run = false;
            }
            
        }
        
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
