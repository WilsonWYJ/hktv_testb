public class q1 {
    public static void main(String[] args) {
        String input = "retlaohS";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move the indices towards the center
            left++;
            right--;
        }

        return new String(characters);
    }
}