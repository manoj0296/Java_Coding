public class NextCharConverter {
    public static void main(String[] args) {
        String input = "abcd";  //bcde
        String output = convertString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String convertString(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'z') {
                    result.append('a');
                } else if (c == 'Z') {
                    result.append('A');
                } else {
                    result.append((char) (c + 1));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}

