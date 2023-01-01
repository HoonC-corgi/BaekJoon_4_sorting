import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;  // 수의 개수
        int arr[];  // 수
        int max=0;  // 정렬을 위해 최대값을 담을 변수

        n = scanner.nextInt();
        arr = new int[n+1];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=n; i>0; i--) {
            for(int j=0; j<n; j++) {
                if(arr[j]>arr[j+1]) {
                    max=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=max;
                }
            }
        }

        for(int i=1; i<n+1; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
