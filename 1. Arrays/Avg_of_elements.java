public class Avg_of_elements {

    public static double Avg(int[] arr){
        double sum = 0;
        for(int i : arr ){
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    public static void main(String[] args){
        int[] array = {1,5,6,9,0};
        System.out.println(Avg(array));
    }
}
