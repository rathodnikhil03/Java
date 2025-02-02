public class Program3 {
    
        public static boolean isPalindrome(int number) {
            // Convert the number to a string
            String strNum = Integer.toString(number);
            // Get the length of the string
            int len = strNum.length();
            
            // Check if the string is the same forwards and backwards
            for (int i = 0; i < len / 2; i++) {
                if (strNum.charAt(i) != strNum.charAt(len - 1 - i)) {
                    return false; // Not a palindrome
                }
            }
            return true; // Is a palindrome
        }
    
        public static void main(String[] args) {
            int number = 121; // You can change this number to test other values
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
}

