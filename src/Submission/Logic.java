package Submission;

public class Logic {
    //Init på de olika variablar som behövs
    private int charCount = 0;
    private int lineCount = 0;
    private int  wordCount = 0;
    private String longestWord = "";

    //  Uppdaterar variablarna efter varje input
        public boolean addLine(String line) {

            // Avsluta om användaren skriver "stop"
            if (line.equalsIgnoreCase("stop")) {
                return true;
            }

            //  Ökar linecount för varje gång addLine körs
            //  charCount = längden på line
            lineCount++;
            charCount+= line.length();

            //  words = array som sparar varje inviduellt ord i en rad
            // wordCount = antalet ord. words.length går igenom arrayen
            String [] words = line.split("\\s+");
            wordCount += words.length;


            //  : används istället för en foreach loop.
            //  Första var är en temporär var som bara används i loopen.
            //  Så loopen går igenom varje word i words arrayen och kollar utifall
            //  Det nya ordet är längre än det sparade längsta ordet
            //  Om detta är fallet så uppdateras längsta ordet
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            return false;
        }

        //  Printar ut svaren i konsolen
        public void printResult(){
            System.out.println("Antal rader:" + lineCount);
            System.out.println("Antal tecken:" + charCount);
            System.out.println("Antal ord:" + wordCount);
            System.out.println("Längsta ord:" + longestWord);
        }

        // Get metoder för att returnera variablarna för test
    public int getCharCount() {
        return charCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }
}

