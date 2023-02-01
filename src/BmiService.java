public class BmiService {
    public int calculate(int weight, double height) {
        double BmiIndex = weight / (height * height);
        return (int) BmiIndex;
    }
}
