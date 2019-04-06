import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line ");
        String str = scanner.nextLine();
        System.out.println(sumDouble(str));
    }

    static Double sumDouble(String str){
            double sum = 0;
            String[] toCheck = str.split("[,\\s]");
            for(int i = 0; i<toCheck.length; i++){
                if(toCheck[i].matches("[+-]?\\d+.\\d+")){
                    double number = Double.parseDouble(toCheck[i]);
                    sum+=number;
                }
            }
            return sum;

    }

}
