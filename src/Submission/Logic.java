package Submission;


public class Logic {
    //Init på olika variablar som behövs
    private int charCount = 0;
    private int lineCount = 0;
    private int  wordCount = 0;
    private String longestWord = "";

    //  Uppdaterar variablarna efter varje input
        public void addLine(String line) {
            lineCount++;
            charCount+= line.length();

            //  Delar upp orden med hjälp med mellanslag
            String [] words = line.split("\\s+");
            wordCount += words.length;


            //  Om det nya order är längre än det sparade längsta ordet
            //  så uppdateras längsta ordet till senaste ordet
            for (String word : words) {
                if (word.length () > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        //  Printar ut svaren i commadprompten
        public void printResult(){
            System.out.println("Antal rader:" + lineCount);
            System.out.println("Antal tecken:" + charCount);
            System.out.println("Antal ord:" + wordCount);
            System.out.println("Längsta ord:" + longestWord);
        }

}

