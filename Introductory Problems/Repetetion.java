import java.util.Scanner;
public class Repetetion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int longestRep = 1;
        int currentRep = 1;
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                currentRep++;
            else{
                if (currentRep > longestRep) {
                    longestRep = currentRep;
                }
                currentRep =1;
            }
            
        }
        //This part is important for the cases where single char repetition is there ex: AAAAAAA
        if (currentRep > longestRep) {
            longestRep = currentRep;
        }
        System.out.println(longestRep);
    }
}