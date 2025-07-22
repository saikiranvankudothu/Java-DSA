import java.util.StringTokenizer;;
public class StringTokenizerex {
    public static void main(String[] args) {
        String inputString = "Hello World, this is a sample string for string tokenizer example.";
        String reversedString = reverseString(inputString);
        System.out.println("reversed big String: "+reversedString);
        int wordcount = countWords(inputString);
        System.out.println("no. of words:"+wordcount);
        String reversedWordString = reverseWords(inputString);
        System.out.println("reversed words:"+reversedWordString);
    }

        private static String reverseString(String input){
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }
        private static int countWords(String input){
            StringTokenizer tokenizer = new StringTokenizer(input);
            return tokenizer.countTokens();
        }
        private static String reverseWords(String input){
            StringTokenizer tokenizer = new StringTokenizer(input);
            StringBuilder reversedWords = new StringBuilder();
            while(tokenizer.hasMoreTokens()){
                String word = tokenizer.nextToken();
                reversedWords.append(reverseString(word)).append(" ");
            }
            return reversedWords.toString().trim();
        }
    }

        
