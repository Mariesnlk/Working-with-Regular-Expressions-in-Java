/**
 *  ������������� � �� ���������� ����������� �������, �� ���� ������ ����� ����������� �������,
 *  ����� �� ������ ����������� (_) � ���������� � �����. ���������� ������� �������  ������:
 * static boolean isIden(String str) � ��������, �� str � �������������.
 * static int cntIden(String str) � �������� ������ �������������� � � ����� str .
 * static int distIden(String str) - �������� ������ ����� �������������� � � ����� str.
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
