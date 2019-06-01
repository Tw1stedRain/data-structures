package hashtable;

public class RepeatedWord {

    public static String repeatedWord(String longString) {
        String[] allWords = longString.split(" ");

        Hashtable<String> allFoundWords = new Hashtable<>();

        for (String word : allWords) {
            // i want no whitespace & no case sensitivity
            word = word.replaceAll("[^A-Za-z]", "");
            word = word.toLowerCase();

            if (!allFoundWords.add(word, word)) {
                return word;
            }
        }
        return null;
    }

}
