package automobil;

public class Motor {
	private Integer kubikaza;
	private Integer snaga;
	private String tipMotora;
	
	public Motor(Integer kubikaza, Integer snaga, String tipMotora) {
		super();
		this.kubikaza = kubikaza;
		this.snaga = snaga;
		this.tipMotora = tipMotora;
	}
	
	public String informacijeOMotoru() {
		return "Kubikaza : "+kubikaza+"snaga"+snaga+"tipMotora"+tipMotora;
		
	}
	
/*public void stampajInformacijeOmotoru(){
 * Syso.out.println("Kubikaza : "+kubikaza+"snaga"+snaga+"tipMotora"+tipMotora) }
 */
}
