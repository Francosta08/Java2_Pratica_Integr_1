package praticaIntegradora2;

import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;


public class Senha{

	private String regex ;


	public Senha(String regex) {
		this.regex = regex;
	}


	public Senha() {
		
	}


	public void setValue (String pwd) {
		
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(pwd);
	    boolean find = matcher.find();
		
		
		
		  if(find) {
		      System.out.println("Combinação encontrada");
		    } else {
		    	
		    	
		      System.out.println("Combinação não encontrada");
		    }
		
	}
    
}