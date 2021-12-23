package praticaIntegradora2;

public class senhaMedia  extends Senha{

	private static String regex = " ^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$ ";
	
	public senhaMedia() {
		super(regex);
		
	}
}
