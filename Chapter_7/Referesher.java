public class Referesher {
    public static void main(String[] args) {

        int[] responseTimes = {100, 200, 150, 300};
        int count = 0;

        int sum = responseTimes[0]; 
        int elements = 1;         
    
        for (int i = 1; i < responseTimes.length; i++) {

            double average = (double) sum / elements;

            if (responseTimes[i] > average) {
                count++;
            }

            
            sum += responseTimes[i];
            elements++;
        }

        System.out.println(count);
    }
}
