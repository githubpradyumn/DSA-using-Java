public class Solution {
    // public static void main(String[] args) {
    //     message();
    // }
    // static void message (){
    //     System.out.println("Hello World!!!!!");
    //     message1();
    // }
    // static void message1 (){
    //     System.out.println("Hello World!!!!!");
    //     message2();
    // }
    // static void message2 (){
    //     System.out.println("Hello World!!!!!");
    //     message3();
    // }
    // static void message3 (){
    //     System.out.println("Hello World!!!!!");
    //     message4();
    // }
    // static void message4 (){
    //     System.out.println("Hello World!!!!!");
    // }
    

    // print 1 2 3 4 5
    // public static void main(String[] args ){
    //     Number(1);
    // }
    // static void Number(int n) {
    //     System.out.println(1);
    //     Number1(n+ 1);
    // }
    // static void Number1(int n ) {
    //     System.out.println(n);
    //     Number2(n+ 1);
    // }
    // static void Number2(int n ) {
    //     System.out.println(n);
    //     Number3(n+ 1);
    // }
    // static void Number3(int n ) {
    //     System.out.println(n);
    //     Number4(n+ 1);
    // }
    // static void Number4(int n ) {
    //     System.out.println(n);
    // }

    // its alternative 
    public static void main (String[] args ){
        print(1);
    }
    static void print(int n ){
        if (n<=5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}