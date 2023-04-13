package JavaAssessment;

import java.util.Scanner;

    public class BeautifyingString {

        public static void main(String[] args) {
            System.out.println(beautifyingString());
        }

        public static String checkFullStop(String words){
            if (words.charAt(words.length()-1) != ','){
                words += ",";

            }
            return words;
        }
        public static String capitalLetter(String words){
            String first = String.valueOf(words.charAt(0)).toUpperCase();
            String refinedWord = words;

            if (!String.valueOf(words.charAt(0)).equals(first)){
                refinedWord = words.replace(String.valueOf(words.charAt(0)),first);
            }
            return refinedWord;
        }
        public static String beautifyingString(){
            Scanner scanner =new Scanner(System.in);
            System.out.println("Please Enter Your Words");
            String words = scanner.nextLine();
            String modified = capitalLetter(words);

            return checkFullStop(modified);
        }

    }

