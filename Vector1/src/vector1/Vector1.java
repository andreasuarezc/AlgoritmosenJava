
package vector1;

public class Vector1 {

    public static void main(String[] args) {
        int []vector = new int [20];
        int count = 1;
        for (int x =0; x<vector.length; x++){            
            vector[x] = count;
            System.out.println(vector[x]);
            count = count + 2;
        }
    }
    
}
