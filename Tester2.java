/**
 *  ≤дентиф≥катор Ц це неперервна посл≥довн≥сть символ≥в, що може м≥стити букви латинського алфав≥ту,
 *  цифри та символ п≥дкресленн€ (_) ≥ починаЇтьс€ з букви. ѕобудувати наступн≥ статичн≥  методи:
 * static boolean isIden(String str) Ц перев≥р€Ї, що str Ї ≥дентиф≥катор.
 * static int cntIden(String str) Ц п≥драховуЇ ск≥льки ≥дентиф≥катор≥в Ї в р€дку str .
 * static int distIden(String str) - п≥драховуЇ ск≥льки р≥зних ≥дентиф≥катор≥в Ї в р€дку str.
 */

import java.util.Scanner;

public class Tester2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line ");
        String str = scanner.nextLine();
        System.out.println("1: " + isIden(str));
        System.out.println("2: " + cntIden(str));
        System.out.println("3: " + distIden(str));
    }

    private static boolean isIden(String str) {
        return str.matches("[A-Za-z]\\w*");
    }

    private static int cntIden(String str) {
        String[] toCheck = str.split("[\\s]");
        int count = 0;
        for (int i = 0; i < toCheck.length; i++) if (isIden(toCheck[i])) count++;
        return count;
    }

    private static int distIden(String str) {
        String[] toCheck = str.split("[\\s]");
        int count = 0;
        for (int i = 0; i < toCheck.length; i++) {
            String string = toCheck[i];
            if (isIden(string)) {
                boolean unique = true;
                for (int j = 0; j < i; j++) if (toCheck[j].equals(string)) unique = false;
                for (int j = i + 1; j < toCheck.length; j++) if (toCheck[j].equals(string)) unique = false;
                if (unique) count++;
            }
        }
        return count;
    }

}
