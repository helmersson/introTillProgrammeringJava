package Submission;


public class Logic {
       private int charCount = 0;
       private int lineCount = 0;
       private int  wordCount = 0;
       private String longestWord = "";

        public void addLine(String line) {
            lineCount++;
            charCount+= line.length();

            String [] words = line.split("\\s+");
            wordCount += words.length;

            for (String word : words) {
                if (word.length () > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        public void printResult(){
            System.out.println("Antal rader:" + lineCount);
            System.out.println("Antal tecken:" + charCount);
            System.out.println("Antal ord:" + wordCount);
            System.out.println("Längsta ord:" + longestWord);
        }

}

