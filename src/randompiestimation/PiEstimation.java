package randompiestimation;

import java.util.Random;

public class PiEstimation {

    public static double estimatePi(int numPoints) {
        if (numPoints <= 0) {
            throw new IllegalArgumentException("Number of points should be greater than 0");
        }

        int pointsInsideCircle = 0;
        Random random = new Random();

        for (int i = 0; i < numPoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distance = Math.sqrt(x * x + y * y);

            if (distance <= 1) {
                pointsInsideCircle++;
            }
        }

        return 4.0 * pointsInsideCircle / numPoints;
    }

    public static void main(String[] args) {
        int numPoints = 1000000;
        double piEstimation = estimatePi(numPoints);
        System.out.println("Estimated value of π with " + numPoints + " points: " + piEstimation);
    }
}

