public class BmiService {

    public int calculate(int weight, double height) {

        double bmi = weight / Math.pow(height, 2);

        return (int) bmi;

    }


}
