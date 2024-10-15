package Submission;


public class Logic {
       private  int charCount = 0;
       private int lineCount = 0;

        public void addLine(String line) {
            lineCount++;
            charCount+= line.length();
        }
        public void printResult(){
            System.out.println("Antal rader:" + lineCount);
            System.out.println("Antal tecken:" + charCount);
        }

}

