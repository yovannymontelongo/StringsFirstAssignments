//import edu.duke.*;

public class Part1{
    public static void main(String[] args) {
        testSimpleGene();
    }

    public static String findGeneSimple(String dna) {
        String result = "";

        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) { //no ATG
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1) { //no TAA
            return "";
        }
        
        if (dna.substring(startIndex, stopIndex+3).length() % 3 == 0){
            result = dna.substring(startIndex, stopIndex+3);
        } else {
            return "";
        }

        return result;
    }

    public static void testSimpleGene() {
        // dna with ATG and TAA and gene is a multiple of 3
        String dnaString1 = "AATATGACTGCTACGTCGTAAAT";
        System.out.println("DNA strand is " + dnaString1);
        System.out.println("Gene is " + findGeneSimple(dnaString1));
        
        // dna with TAA but no ATG
        String dnaString2 = "AATAGAACTGCTACGTCGTAAAT";
        System.out.println("DNA strand is " + dnaString2);
        System.out.println("Gene is " + findGeneSimple(dnaString2));  

        // dna with ATG but no TAA
        String dnaString3 = "AATATGACTGCTACGTCGTAAAT";
        System.out.println("DNA strand is " + dnaString3);
        System.out.println("Gene is " + findGeneSimple(dnaString3));
        
        // dna without ATG nor TAA
        String dnaString4 = "AATAGGACTGCTACGTCGTAGAT";
        System.out.println("DNA strand is " + dnaString4);
        System.out.println("Gene is " + findGeneSimple(dnaString4));
        
        // dna with ATG and TAA and gene is not a multiple of 3
        String dnaString5 = "AATATGACTGCACGTCGTAAATT";
        System.out.println("DNA strand is " + dnaString5);
        System.out.println("Gene is " + findGeneSimple(dnaString5));
        
    }
}
