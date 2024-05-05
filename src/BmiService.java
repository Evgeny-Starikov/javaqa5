public class BmiService {

    public int calculate(int weight, double height) {

        //double height = 1.87;

        double bmi = weight / Math.pow(height, 2);

        return (int) bmi;

    }


}
