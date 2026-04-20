import java.util.*;
public class SpiralAntiClock {

    public static void spiral(int arr[][]){
        int tle=arr.length*arr[0].length;
        int sr=0,sc=0,er=arr.length-1,ec=arr[0].length-1;
        int dir=-1;
        while(tle!=0){
            dir=(dir+1)%4;
            if(dir==0){
                for(int i=sr;i<=er;i++){
                    System.out.print(arr[i][sc]+" ");
                    tle--;
                }
                sc++;
            }
            else if(dir==1){
                for(int i=sc;i<=ec;i++){
                    System.out.print(arr[er][i]+" ");
                    tle--;
                }
                er--;
            }
            else if(dir==2){
                for(int i=er;i>=sr;i--){
                    System.out.print(arr[i][ec]+" ");
                    tle--;
                }
                ec--;
            }
            else{
                for(int i=ec;i>=sc;i--){
                    System.out.print(arr[sr][i]+" ");
                    tle--;
                }
                sr++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter elements");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spiral(arr);
    }
}
