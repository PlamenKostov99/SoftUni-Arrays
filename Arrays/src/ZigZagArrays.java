import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n ; i++) {

            String[] line = scanner.nextLine().split(" ");

         if (i % 2 == 0){

             secondArr[i] = line[0];
             firstArr[i] = line[1];
         }else{
             secondArr[i] = line[1];
             firstArr[i] = line[0];
         }

        }
        String firstOutput = "";
        String secondOutput = "";

        for (int i = 0; i < firstArr.length ; i++) {
            if (i % 2 == 0){
                firstOutput += secondArr[i] + " ";
                secondOutput += firstArr[i] + " ";
            }else {

                secondOutput += firstArr[i] + " ";
                firstOutput += secondArr[i] + " ";

            }

        }
        System.out.println(firstOutput);
        System.out.println(secondOutput);
    }
}
