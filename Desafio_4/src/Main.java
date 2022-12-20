import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < number; i++) {
            String line = String.valueOf(bufferedReader.readLine()).trim();

            line = Result.solution(line);

            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
                
        bufferedReader.close();
        bufferedWriter.close();
    }

   static class Result {
        public static String solution(String line) {
            int length = line.length();
            String subString = line.substring(0, length/2);
            String subString1 = line.substring(length/2);
            String invertedString = "";
            String invertedString1 = "";
            String result;
            Stack inverter = new Stack<>();

            for (int i = 0; i < subString.length(); i++) {
               inverter.push(subString.charAt(i));
            }

            for (int i = 0; i < subString.length(); i++) {
                invertedString += inverter.pop().toString();
            }

            for (int i = 0; i < subString1.length(); i++) {
                inverter.push(subString1.charAt(i));
            }

            for (int i = 0; i < subString1.length(); i++) {
                invertedString += inverter.pop().toString();
            }

            result = invertedString + invertedString1;

            return result;
        }
    }
}