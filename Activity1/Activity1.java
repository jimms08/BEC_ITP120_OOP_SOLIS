public class Activity1 {
    public static double calculateAve(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        return sum / numbers.length;
    }
    
    public static void main(String[] args) {
        double[] values = { 2.5, 4.0, 6.5, 8.0, 10.0 };
        
        double average = Activity1.calculateAve(values);
        
        System.out.println("Average: " + average);
    }
}