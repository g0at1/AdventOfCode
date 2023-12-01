package aot2023.day1.firstPuzzle;

public class TrebuchetA {
    public static void main(String[] args) {
        String text = """
                1abc2
                pqr3stu8vwx
                a1b2c3d4e5f
                treb7uchet""";

        int sum = 0;
        for (String line : text.split("\n")) {
            int first = 0;
            int last = 0;

            for (String str : line.split("")) {
                if (Character.isDigit(str.charAt(0))) {
                    if (first == 0) {
                        first = Integer.parseInt(str);
                    }
                    last = Integer.parseInt(str);
                }
            }
            sum += (first * 10) + last;
        }
        System.out.println(sum);
    }
}
