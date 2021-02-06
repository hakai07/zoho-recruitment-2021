import java.util.Scanner;

class Test{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            int startVal = n;
            for(int j = n; j >= 1; j--){
                System.out.print(startVal);
                if(startVal > i)
                    startVal--;
            }
            System.out.println();
        }
    }
}
