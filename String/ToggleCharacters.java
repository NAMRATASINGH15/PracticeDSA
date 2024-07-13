public class ToggleCharacters {

    public static void main(String[] args) {
        char[] ch = {'A', 'L', 'G', 'o', 'P', 'r', 'e', 'p'};

        toggleCharacters(ch);

        System.out.println(ch);
    }

    public static void toggleCharacters(char[] ch) {

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }
    }
}
