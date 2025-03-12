public class RandomString {
    public static void main(String[] args) {
        String randStr = generateRandomString();
        System.out.println(randStr);
    }

    private static String generateRandomString() {
        int len = 5;
        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[i] = getRandChar();
        }
        return new String(chars);
    }

    private static char getRandChar() {
        int randInt = (int) Math.round(Math.random() * 26);
        char c = 'a';
        if (randInt >= 0 && randInt <= 25) {
            c += randInt;
        }
        return c;
    }
}
