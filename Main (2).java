public class Main {
    public static void main(String[] args) {
        
        

        int result1 = sum(5, 3);
        System.out.println("Сумма 5 и 3: " + result1);
        
   
        int result2 = sum(5, 3, 2);
        System.out.println("Сумма 5, 3 и 2: " + result2);
        
        
        System.out.println("Число 4 четное? " + isEven(4));
        System.out.println("Число 7 четное? " + isEven(7));
        
      
        printMessage("Привет, мир!");
        printMessage("Это мой первый метод с void");
    }
    
 
    public static int sum(int a, int b) {
        return a + b;
    }
    
 
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
 
    public static void printMessage(String message) {
        System.out.println(message);
    }
}