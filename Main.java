public class Main {
    public static void main(String[] args){
        int a=10, b=20, c=30, d=15;
        int max=findMax(a,b,c,d);
        System.out.println("МАксимальное число: "+max);
    }
    public static int findMax(int a, int b, int c, int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
}
