import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Double number = Double.parseDouble(bufferedReader.readLine().trim());

        String response = Result.solution(number);

        bufferedWriter.write(response);

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {
        public static String solution(Double number) {
            String value = "";

            String result = "NOTAS:\n";

            value = String.valueOf(number / 100);
            value = value.substring(0, value.indexOf("."));
            number = number % 100;
            result += value +"  nota(s)    de    R$ 100.00\n";

            value = String.valueOf(number / 50);
            value = value.substring(0, value.indexOf("."));
            number = number % 50;
            result += value +"  nota(s)    de    R$  50.00\n";

            value = String.valueOf(number / 20);
            value = value.substring(0, value.indexOf("."));
            number = number % 20;
            result += value +"  nota(s)    de    R$  20.00\n";

            value = String.valueOf(number / 10);
            value = value.substring(0, value.indexOf("."));
            number = number % 10;
            result += value +"  nota(s)    de    R$  10.00\n";

            value = String.valueOf(number / 5);
            value = value.substring(0, value.indexOf("."));
            number = number % 5;
            result += value +"  nota(s)    de    R$   5.00\n";

            value = String.valueOf(number / 2);
            value = value.substring(0, value.indexOf("."));
            number = number % 2;
            result += value +"  nota(s)    de    R$   2.00\n";

            result += "MOEDAS:\n";

            value = String.valueOf(number / 1);
            value = value.substring(0, value.indexOf("."));
            number = number % 1;
            result += value +"  moeda(s)    de    R$  1.00\n";

            value = String.valueOf(number / 0.5);
            value = value.substring(0, value.indexOf("."));
            number = number % 0.5;
            result += value +"  moeda(s)    de    R$  0.50\n";

            value = String.valueOf(number / 0.25);
            value = value.substring(0, value.indexOf("."));
            number = number % 0.25;
            result += value +"  moeda(s)    de    R$  0.25\n";

            value = String.valueOf(number / 0.10);
            value = value.substring(0, value.indexOf("."));
            number = number % 0.10;
            result += value +"  moeda(s)    de    R$  0.10\n";

            value = String.valueOf(number / 0.05);
            value = value.substring(0, value.indexOf("."));
            number = number % 0.05;
            result += value +"  moeda(s)    de    R$  0.05\n";

            value = String.valueOf(number / 0.01);
            value = value.substring(0, value.indexOf("."));
            if (number % 0.01 >= 0.001) {
                int newValue = Integer.parseInt(value) + 1;
                value = String.valueOf(newValue);
            }
            result += value +"  moeda(s)    de    R$  0.01\n";

            return result;
        }
    }
}