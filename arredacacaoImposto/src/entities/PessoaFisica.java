package entities;

public class PessoaFisica extends Contribuinte{

	private Double gastoSaude;
	
	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double impostos() {
		if(getRendaAnual() >= 20000) {
			return (getRendaAnual()*0.25) - (getGastoSaude()*0.50);
		}
		else {
			return (getRendaAnual()*0.15) - (getGastoSaude()*0.50);
		}
	}

}
