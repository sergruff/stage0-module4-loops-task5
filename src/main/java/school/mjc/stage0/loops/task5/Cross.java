package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
            for (int i = 1; i <= sideLength ; i++) {
                for (int j = 1; j <= sideLength; j++) {
                    if (i==Math.round(sideLength/2.0)){
                        System.out.print(8);
                        continue;
                    }
                    if(j==Math.round(sideLength/2.0)) {
                        System.out.print(8);
                        continue;
                    }
                    System.out.print(" ");
                }
                System.out.println("");
            }

    }
}
