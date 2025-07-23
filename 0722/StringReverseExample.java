<<<<<<< HEAD
public class StringReverseExample {
    
    public static String reverseString(String str) {
        // 停止條件：空字串或單字符
        if (str.length() <= 1) {
            return str;
        }
        // 遞迴關係：最後一個字符 + 反轉前面的部分
        return str.charAt(str.length() - 1) + 
               reverseString(str.substring(0, str.length() - 1));
    }
    
    public static void main(String[] args) {
        System.out.println("反轉 'hello': " + reverseString("hello")); // olleh
        System.out.println("反轉 'java': " + reverseString("java"));   // avaj
        System.out.println("反轉 'a': " + reverseString("a"));         // a
    }
}
=======
public class StringReverseExample {
    
    public static String reverseString(String str) {
        // 停止條件：空字串或單字符
        if (str.length() <= 1) {
            return str;
        }
        // 遞迴關係：最後一個字符 + 反轉前面的部分
        return str.charAt(str.length() - 1) + 
               reverseString(str.substring(0, str.length() - 1));
    }
    
    public static void main(String[] args) {
        System.out.println("反轉 'hello': " + reverseString("hello")); // olleh
        System.out.println("反轉 'java': " + reverseString("java"));   // avaj
        System.out.println("反轉 'a': " + reverseString("a"));         // a
    }
}
>>>>>>> 5d6f8700988a8bcc9c45206b81be0f301e52ffd7
