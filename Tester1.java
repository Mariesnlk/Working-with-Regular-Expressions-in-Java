import java.util.Scanner;

public class Tester1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line ");
        String str = scanner.nextLine();
        System.out.println(onlyOdd(str));
    }

  
    static boolean onlyOdd(String str) {
        int countA=0, countB = 0;
        for (char element : str.toCharArray()){
            if (element == 'a') countA++;
            if (element == 'b') countB++;
        }
                if (countA%2 !=0){
                    if (countB%2 !=0){
                        return true;
                    } else {
                        return false;
                    }
                }  else {
                    return false;
                }
    }

}