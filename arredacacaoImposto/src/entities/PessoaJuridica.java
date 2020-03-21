package entities;

public class PessoaJuridica extends Contribuinte {
	private Integer numeroFun;
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFun) {
		super(name, rendaAnual);
		this.numeroFun = numeroFun;
	}

	public Integer getNumeroFun() {
		return numeroFun;
	}

	public void setNumeroFun(Integer numeroFun) {
		this.numeroFun = numeroFun;
	}

	@Override
	public double impostos() {
		if(getNumeroFun() > 10) {
			return (getRendaAnual()*0.14);
		}
		else {
			return (getRendaAnual()*0.16);
		}
	}

}
