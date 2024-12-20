import java.util.*;

public class Main {

    public static void StringBuilders(){
        StringBuilder s = new StringBuilder("Tojwbekcjbjiwerf2ny");
        System.out.print(s.charAt(7));

        s.setCharAt(7,'A');
        System.out.println(s);

        s.insert(0,'W');
        System.out.println(s);

        s.delete(4,7);
        System.out.println(s);
    }
    public static void StringSub(){
        String s = "HElloTony";
        String x = s.substring(2,5);
        System.out.println(x);
    }
    public static void Strings(){
        Scanner sc = new Scanner(System.in);
//        single word
//        String s1 = sc.next();

//        full sentence
        String s2 = sc.nextLine();
//        System.out.println(s1);
        System.out.println(s2);

    }
    public static void arrayFunctions(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }

    public static void inputMyName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
        return;
    }
    public static void main(String[] args) {
        StringBuilders();
    }
//        System.out.println("Hello world \nHi");
//        String a = "HiBY";
//        System.out.print(a);
//        Scanner x = new Scanner(System.in);
//        int button = x.nextInt();
//       if(age > 18){
//           System.out.println("YES");
//       }else{
//           System.out.println("No");
//       }
//       if(age % 2 == 1){
//           System.out.println("ODD");
//       }else{
//           System.out.println("Even");
//       }

//        switch (button){
//            case 1: System.out.println("Hello");
//                break;
//            case 2: System.out.println("Bye");
//                break;
//            case 3: System.out.println("YOYO");
//                break;
//            default: System.out.println("Invalid");
//        }

//        for(int i= 0;i<5;i++){
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while(i<5){
//            System.out.println(i++);
//        }
//    }
}