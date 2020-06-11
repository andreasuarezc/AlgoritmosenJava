
package vector2;

public class Vector2 {

    public static void main(String[] args) {
        int []vector = new int [20];
        int count = 2;
        for (int x =0; x<vector.length; x++){            
            vector[x] = count;
            System.out.println(vector[x]);
            count = count + 2;
        }
    }
    
}
