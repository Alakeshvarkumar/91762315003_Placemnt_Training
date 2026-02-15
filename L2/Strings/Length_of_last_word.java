class Length_of_last_word {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i = s.length() - 1;
        int length = 0;

        // {remove trailing spaces by using this code snippet or trim fn}
        // while (i >= 0 && s.charAt(i) == ' ') {
        //     i--;
        // }

        

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        Length_of_last_word lc = new Length_of_last_word();
        System.out.println(lc.lengthOfLastWord("Hello World"));
    }
}
