// Joshua Maitoza
// CIS 181L1
// Lab 1 - Working with Transformers

package Lab1;

public class Main
{
    public static void Example()
    {
        String myString1 = "Al says hello there.";
        String myString2 = "Who is this?";

        String temp1 = myString1;
        temp1 = SentenceTransformer.depunctuate(myString1);

        for (int i = 0; i < 3; i++)
            temp1 = SentenceTransformer.lastWords(temp1); // temp1 = "there"

        temp1 = WordTransformer.leftPadder(temp1); // there
        // Al says

        String temp2;
        String temp3;

        temp2=SentenceTransformer.firstWord(myString1);//Al
        temp3=SentenceTransformer.lastWords(myString1);

        System.out.println(temp3);
        temp3=SentenceTransformer.firstWord(temp3);
        System.out.println(temp3);

        temp2=WordTransformer.rightPadder(temp2,WordTransformer.leftPadder(temp3));// who is there?

        String temp4;
        temp4=SentenceTransformer.firstWord(myString2);//Who
        temp4=WordTransformer.lowerCase(temp4);//who
        temp4=WordTransformer.leftPadder(temp4);// who

        String temp5=SentenceTransformer.lastWords(myString2);//is this?
        temp5=SentenceTransformer.firstWord(temp5);//is
        temp5=WordTransformer.leftPadder(temp5);// is
        temp4=WordTransformer.rightPadder(temp4,temp5);
        temp4=WordTransformer.rightPadder(temp4, temp1);
        temp4=WordTransformer.rightPadder(temp4, "?");//Al says who is there?
        temp2=WordTransformer.rightPadder(temp2,temp4);

        System.out.println(temp2);
    }

    public static void Exercise1() //Poor Gilligan says hello there!
    {
        String inString0 = "Gilligan";
        String inString1 = "Hello everyone!";
        String inString2 = "My mother says the weather is poor there.";


        String temp1 = inString2;
        temp1 = SentenceTransformer.depunctuate(temp1);
//        String temp2 = inString2;
//        temp2 = SentenceTransformer.depunctuate(temp2);

        for (int i = 0; i < 6; i++)
            temp1 = SentenceTransformer.lastWords(temp1); // "poor there"


        //System.out.println(temp1);

        String temp2;
        temp2 = SentenceTransformer.firstWord(temp1); // "poor"
        temp2 = WordTransformer.makeCapital(temp2); // "Poor"

        //System.out.println(temp2);

        // Poor Gillian
        String temp3 = inString0;
        temp2 = WordTransformer.rightPadder(temp2, WordTransformer.leftPadder(temp3)); //"Poor Gilligan

        //System.out.println(temp2);

        //Poor Gilligan says
        String temp4 = temp1;
        temp4 = SentenceTransformer.lastWords(temp4); // "there"
        temp4 = WordTransformer.rightPadder(temp4, "!"); //"there!"

        String temp5 = inString2;
        for (int i = 0; i < 2; i++)
            temp5 = SentenceTransformer.lastWords(temp5);

        temp5 = SentenceTransformer.firstWord(temp5);

        temp2= WordTransformer.rightPadder(temp2, WordTransformer.leftPadder(temp5)); //"Poor Gilligan say"
        //System.out.println(temp2);

        //Poor Gilligan says hello there!
        String temp6 = inString1;
        temp6 = SentenceTransformer.firstWord(temp6); //"Hello"
        temp6 = WordTransformer.lowerCase(temp6); //"hello"
        temp6 = WordTransformer.rightPadder(temp6, WordTransformer.leftPadder(temp4)); //"hello there!"

        temp2 = WordTransformer.rightPadder(temp2, WordTransformer.leftPadder(temp6)); //"Poor Gilligan says hello there!"

        System.out.println(temp2);
    }

    public static void main(String[] args)
    {
        //Example();
        Exercise1();
    }
}
