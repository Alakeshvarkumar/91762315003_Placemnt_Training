class Reverse_vowels {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] arr = s.toCharArray();
        while (l <= r) {
            if (isVowel(arr[l]) && isVowel(arr[r])) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (!isVowel(arr[l]))
                l++;
            else if (!isVowel(arr[r]))
                r--;

            else {
                l++;
                r--;
            }
        }
        return new String(arr);
    }

    public boolean isVowel(char i) {
        
            
    

        return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ||
                i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U';
    }
}