
public class Main
    {
    public static void main(String[] args)
    {
        System.out.println(" ");
        System.out.println("1)");
        int num1 = 11;
        int num2  = 4;
        int sum1 = num1 / num2;
        int sum2 = num1 % num2;
        System.out.println("sum1 = "+sum1+", sum2 = "+sum2);

        System.out.println(" ");
        System.out.println("2)");
        int num =  95;
        int a = num / 10;// через те що інт заокруглює до коми
        int b = num % 10;//остача від ділення
        int sum = a + b ;
        System.out.println(a +"\n"+b+"\n"+sum);

        System.out.println(" ");
        System.out.println("3)");
        double n = 2.49;
        int xx ;
        xx = (int) n;//явне привеення
        System.out.println(xx);//е можна робити через цю функцію Math.round



    }
}

