public class rotatedhalfpyramid {
    public static void inverted_rotated_half_pyramid(int n){
        //outer 
        for(int i=1; i<=n;i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_rotated_half_pyramid(4);

    }
    
}
