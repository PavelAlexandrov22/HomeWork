package hw6;


import hw6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    private final char[] VALID_BEFORE_SYMBOLS = {',', ' ', ';', '!', '.', '?', ':', '"', '\'', ')', '(', '-' , '\n', '\t'};
    private final char[] VALID_AFTER_SYMBOLS = {',', ' ', ';', '!', '.', '?', ':', '"', '\'', ')', '(', '-', '\n', '\t'};

    @Override
    public long search(String text, String word) {
        long count = 0;
        int textLength = text.length();
        int wordLength = word.length();

        int nextStartPosition = 0;
        while ((nextStartPosition = text.indexOf(word, nextStartPosition)) != -1){
            int foundPosition = nextStartPosition;

            boolean needCheckBefore = foundPosition != 0;
            boolean needCheckAfter = foundPosition + wordLength != textLength;

            nextStartPosition += wordLength;

            boolean symbolBeforeValid = !needCheckBefore || validSymbolBeforeFoundWord(text, foundPosition);

            if(!symbolBeforeValid){
                continue;
            }

            boolean symbolAfterValid = !needCheckAfter || validSymbolAfterFoundWord(text, wordLength, foundPosition);

            if(!symbolAfterValid){
                continue;
            }

            count++;
        }

        return count;
    }

    private boolean validSymbolBeforeFoundWord(String text, int currentPosition){
        char charAt = text.charAt(currentPosition - 1);
        if(charAt == '-'){
            if(currentPosition - 2 >= 0 && text.charAt(currentPosition - 2) == ' '){
                return true;
            } else {
                return false;
            }
        }
        for (char symbol : VALID_BEFORE_SYMBOLS) {
            if(symbol == charAt){
                return true;
            }
        }
        return false;
    }

    private boolean validSymbolAfterFoundWord(String text, int wordLength, int currentPosition){
        char charAt = text.charAt(currentPosition + wordLength);
        for (char symbol : VALID_AFTER_SYMBOLS) {
            if(symbol == charAt){
                return true;
            }
        }
        return false;
    }
}
