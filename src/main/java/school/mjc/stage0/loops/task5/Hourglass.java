package school.mjc.stage0.loops.task5;

public class Hourglass {


    public void printHourglassOfGivenSize(int height) {

        for (int row = 0; row < height; row++) {
            int numCount = height - 2 * row;
            if (numCount <= 0) {
                numCount = numCount * (-1) + 2;
            }
            int spaceCount = (height - numCount) / 2;
            for (int spaceInd = 0; spaceInd < spaceCount; spaceInd++) {
                System.out.print(" ");
            }
            for (int col = 0; col < numCount; col++) {
                System.out.print("8");
            }
            for (int spaceInd = 0; spaceInd < spaceCount; spaceInd++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}

