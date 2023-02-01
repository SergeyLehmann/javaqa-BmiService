public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75;
        double height = 1.82;
        int BmiIndex = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + BmiIndex);
    }
}