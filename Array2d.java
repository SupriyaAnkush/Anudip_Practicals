
import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
    
    System.out.println("Enter rows");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        System.out.println("Enter columns");
        int col=s.nextInt();
        System.out.println("Enter Array Elements");
        int [][] matrix=new int[3][3];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=s.nextInt();
                
            }
            
        }
        System.out.println("Array Elements");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("\t"+matrix[i][j]);
            }
        
        System.out.println();
        }
        
        
    }
    

}
