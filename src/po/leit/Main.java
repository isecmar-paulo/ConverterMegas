package po.leit;

public class Main {

    public static void main(String[] args) {
        printBytesUnit(2500);
    }
    
    public static void printBytesUnit(int valorKb) {
        int valorMb = valorKb / 1024;
        int valorRest = valorKb % 1024;
        System.out.println(valorKb+"KB = "+valorMb+"MB"+" e " + valorRest);
    }
}
