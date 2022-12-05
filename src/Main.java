import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float smallR = getRadius("меньший");
        float bigR = getRadius("больший");

        float smallCircleS = getCircleArea(smallR);
        float bigCircleS = getCircleArea(bigR);
        float squareS = getSquareArea(bigR);

        float cornerPieceS = getCornerPieceArea(squareS, bigCircleS);
        float circleSegmentS = smallCircleS / 8;
        float circleSectorS = (bigCircleS - smallCircleS) / 8;

        float figure1 = cornerPieceS * 4 + circleSegmentS * 3;
        float figure2 = cornerPieceS + circleSectorS + circleSectorS * 6;
        float figure3 = cornerPieceS * 2 + circleSectorS * 6 + circleSectorS * 2;

        printResult("1", figure1);
        printResult("2", figure2);
        printResult("3", figure3);
    }

    private static float getRadius(String radius) {
        System.out.printf("Введите %s радиус: ", radius);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static float getSquareArea(float x) {
        return x * x;
    }

    private static float getCircleArea(float x) {
        return (float)Math.PI * x * x / 4;
    }

    private static float getCornerPieceArea(float squareS, float circleS) {
        return (squareS - circleS) / 8;
    }

    private static void printResult(String figureName, float figure) {
        System.out.printf("Площадь %s фигуры: %.3f\n", figureName, figure);
    }
}