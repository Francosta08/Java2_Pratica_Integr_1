package praticaIntegradora2;

public class senhaFraca extends Senha {

	private static String regex= "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
	
	public senhaFraca() {
		super(regex);
		
	}
    
}
