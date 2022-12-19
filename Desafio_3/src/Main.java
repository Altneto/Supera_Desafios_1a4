import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String in = String.valueOf(bufferedReader.readLine()).trim();

        Integer n = Integer.parseInt(in.substring(0, in.indexOf(" ")).trim());
        Integer k = Integer.parseInt(in.substring(in.indexOf(" ")).trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.solution(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {
        public static int solution (Integer n, Integer k, List<Integer> numbers) {
            int count = 0;
            numbers = numbers.stream().sorted(Collections.reverseOrder()).toList();

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n ; j++) {
                   if (numbers.get(i) - numbers.get(j) == k) {
                       count++;
                   }
                }
            }

            return count;
        }
    }
}