package Test;

public class Mass {
    public static void main(String args[]) {
        int [] [] M = new int [10][10];
        for (int i=1; i<10; i++){
            for (int j =1;j<10;j++){
                M[i][j] = i*j;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }
}
