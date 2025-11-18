public class Main {
    
    public static int countElementsGreaterThanPreviousAverage(int[] responseTimes) {
        int count = 0;
        int total = responseTimes[0]; 
        
       
        for (int i = 1; i < responseTimes.length; i++) {
            
            double avgPrevious = total / (double) i;
            
            
            if (responseTimes[i] > avgPrevious) {
                count++;
            }
            
            
            total += responseTimes[i];
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countElementsGreaterThanPreviousAverage(responseTimes)); 
    }
}
