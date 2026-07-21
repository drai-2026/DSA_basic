import java.util.Scanner;
public class hashing {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your input : ");
        String test = sc.nextLine();
        int[] str = new int[26];
        int index = 0;
        for(int i = 0 ; i < test.length(); i++){
          str[test.charAt(i)-'a']++;//using assai key
        }
        for(int i = 0 ; i <test.length();i++){
            System.out.println(str[i]);
        }
    }
}
