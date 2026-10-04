
package locationprojectjava;

import java.util.Scanner;
import java.util.Locale;
public class LocationProjectJava {

    public int row;
    public int column;
    public double maxValue;

    public LocationProjectJava(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static LocationProjectJava locateLargest(double[][] a) {
        int row = 0;
        int column = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new LocationProjectJava(row, column, maxValue);
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       input.useLocale(Locale.US);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] a = new double[rows][columns];

        System.out.println("Enter the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        LocationProjectJava location = locateLargest(a);

        System.out.println("The location of the largest element is "
                + location.maxValue + " at ("
                + location.row + ", " + location.column + ")");

        input.close();
    }
}
