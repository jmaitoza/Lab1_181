package Lab1;

public class SentenceTransformer {
	
	static String firstWord (String thePhrase) {
		int i=thePhrase.indexOf(" ");
		if (i>0) {return thePhrase.substring(0,i);}
		else {return thePhrase;}
	}

	static String lastWords (String thePhrase) {
		int i=thePhrase.indexOf(" ");
		if (i>0)
		{
			return thePhrase.substring(i+1,thePhrase.length());
		}

		else
		{
			return thePhrase;
		}
	}

	static String reverseSentence(String thePhrase){
		return null;
	}
	
	static String depunctuate (String thePhrase){
		thePhrase=thePhrase.replace('.',' ');
		thePhrase=thePhrase.replace('!',' ');
		thePhrase=thePhrase.replace('?',' ');
		thePhrase=thePhrase.substring(0,thePhrase.length()-1);
		return thePhrase;
	}
}
