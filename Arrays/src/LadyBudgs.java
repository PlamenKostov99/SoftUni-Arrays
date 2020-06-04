import java.util.Arrays;
import java.util.Scanner;

public class LadyBudgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOnField = Integer.parseInt(scanner.nextLine());
        int[] ladyBugsField = new int[sizeOnField];

        String[] occupiedIndexes = scanner.nextLine().split(" ");

        for (int i = 0; i < occupiedIndexes.length ; i++) {
            int currentIndex = Integer.parseInt(occupiedIndexes[i]);

            if (currentIndex >= 0 && currentIndex < sizeOnField){
                ladyBugsField[currentIndex] = 1;
            }

        }

       String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
            boolean isFirst = true;
            int currentIndex = Integer.parseInt(command[0]);

            while (currentIndex >= 0 && currentIndex < sizeOnField && ladyBugsField[currentIndex] != 0){
                if (isFirst){
                    ladyBugsField[currentIndex] = 0;
                    isFirst = false;
                }
             String direction = command[1];
                int flightLenght = Integer.parseInt(command[2]);

                    if (direction.equals("left")){
                        currentIndex -= flightLenght;

                        if (currentIndex >= 0 && currentIndex < sizeOnField){

                            if (ladyBugsField[currentIndex] == 0){

                                ladyBugsField[currentIndex] = 1;
                                break;
                            }
                    }
                }else {
                        currentIndex += flightLenght;

                        if (currentIndex >= 0 && currentIndex < sizeOnField){

                            if (ladyBugsField[currentIndex] == 0){

                                ladyBugsField[currentIndex] = 1;
                                break;

                            }
                        }
                    }

            }
            command = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < ladyBugsField.length ; i++) {
            System.out.print(ladyBugsField[i] + " ");

        }

    }
}
