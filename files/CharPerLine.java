import java.util.Scanner;
class CharPerLine{
    void CharAt(String word){
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CharPerLine ch = new CharPerLine();
        System.out.print("Enter a word: ");
        String word = sc.next();
        ch.CharAt(word);
    }
}

