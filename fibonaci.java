public class fibonaci {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Fibonacci Sequence is");
        for(int i = 0; i<=n; i++){
           System.out.println(fibonacci(i) + " ");
        }
    }
}
