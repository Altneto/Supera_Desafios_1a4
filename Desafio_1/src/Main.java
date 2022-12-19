import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < loop; i++) {
            int number = Integer.parseInt(bufferedReader.readLine().trim());
            numbers.add(number);
        }

        List<Integer> result = Result.solution(numbers);

        for (Integer number: result) {
            bufferedWriter.write(String.valueOf(number));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {
        public static List<Integer> solution(List<Integer> numbers) {
            List<Integer> result = new ArrayList<>();
            List<Integer> evens = new ArrayList<>();
            List<Integer> odds = new ArrayList<>();

            for (Integer number: numbers) {
                if (number % 2 == 0) {
                    evens.add(number);
                } else {
                    odds.add(number);
                }
            }

            result.addAll(evens.stream().sorted().toList());
            result.addAll(odds.stream().sorted(Collections.reverseOrder()).toList());

            return result;
        }
    }
}