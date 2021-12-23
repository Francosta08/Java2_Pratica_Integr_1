package praticaIntegradora2;

public class senhaForte  extends Senha{

	
	private static String regex= " ^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$ ";	
	
	public senhaForte() {
		super(regex);
		
	}
}
