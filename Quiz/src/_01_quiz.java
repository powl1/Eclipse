
public class _01_quiz {
    public static void main(String[] args){
        int num = 35;
        boolean result;
        result = (num % 2 == 0) || (num % 3 == 0);
        System.out.println("num : " + num + "은 2의 배수 이거나 3의 배수? :" + result);
    }
}