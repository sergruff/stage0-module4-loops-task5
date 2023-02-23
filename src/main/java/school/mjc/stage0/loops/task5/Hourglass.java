package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= height; j++) {
                if (i-j<=0&&j+i<=height+1||i-j>=0&&j+i>=height+1){
                    System.out.print(8);
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
