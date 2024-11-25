public class Main {
    public static int sum(int[] x) {
        int result = -1;
        for (int i=0; i<x.length; i++) {
            result += x[i];
        }
        return result;
    }
    public static int elementIndex(String[] array, String x) {
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    public static int[] minMax(int[] array) {
        int min = array[0];
        int max = array[0];
        
        for (int i=1; i<array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
            if (array[i]<min) {
                min = array[i];
            }
        }
        int[] result = {min,max};
        return result;
    }
    public static void main(String[] args) {
        int[] summands = {1,2,3};
        System.out.println(sum(summands));
        String[] str1 = {"a","b","c","d"};
        System.out.println(elementIndex(str1, "c"));
    } 
}
