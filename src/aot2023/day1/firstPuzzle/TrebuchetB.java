package aot2023.day1.firstPuzzle;

import java.io.BufferedReader;
import java.io.FileReader;

public class TrebuchetB {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("calibration.txt"));

            int sum = reader.lines()
                    .mapToInt(line -> {
                        int firstDig = 0;
                        int lastDig = 0;

                        for (String str : line.split("")) {
                            if (Character.isDigit(str.charAt(0))) {
                                if (firstDig == 0) {
                                    firstDig = Integer.parseInt(str);
                                }
                                lastDig = Integer.parseInt(str);
                            }
                        }
                        return firstDig * 10 + lastDig;
                    })
                    .sum();
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
