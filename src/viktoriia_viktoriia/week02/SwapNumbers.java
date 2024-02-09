package viktoriia_viktoriia.week02;

public class SwapNumbers {

/*
1.Numbers -- Swap Numbers.
Swap two variable values without using а third variable.
*/
public static void main(String[] args) {


    int a = 5;
    int b = 7;
    a += b;
    b = a-b;
    a = a-b;

    System.out.println(a);
    System.out.println(b);

}

}
