package turkcell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Lütfen giriş yapınız : ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        for(int i=0;i<= word.length()-1;i++){
            if(word.charAt(i) == 'a'){
                word = word.replace('a','1');
            }
            if(word.charAt(i) == 'e'){
                 word = word.replace('e','2');
            }
            if(word.charAt(i) == 'ı'){
                 word = word.replace('ı','3');
            }
            if(word.charAt(i) == 'i'){
                 word = word.replace('i','4');
            }
            if(word.charAt(i) == 'o'){
                 word = word.replace('o','5');
            }
            if(word.charAt(i) == 'ö'){
                 word = word.replace('ö','6');
            }
            if(word.charAt(i) == 'u'){
                 word = word.replace('u','7');
            }
            if(word.charAt(i) == 'ü'){
                 word = word.replace('ü','8');
            }
        }
        System.out.println(word);
    }
}
