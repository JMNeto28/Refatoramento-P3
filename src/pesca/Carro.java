package pesca;

public abstract class Carro {

	private double ar;
	private double direcaoEletrica;
	private double alarme;
	private double seguro;
	private double seguroTotal;
	
	public void setAr(int r)
	{
		ar = r;
	}
	public double getAr()
	{
		return ar;
	}
	
	public void setDirecaoEletrica(int r)
	{
		direcaoEletrica = r;
	}
	public double getDirecaoEletrica()
	{
		return direcaoEletrica;
	}
	
	public void setAlarme(int r)
	{
		alarme = r;
	}
	public double getAlarme()
	{
		return alarme;
	}
	
	public void setSeguro(int r)
	{
		seguro = r;
	}
	public double getSeguro()
	{
		return seguro;
	}
	
	public void setSeguroTotal(int r)
	{
		seguroTotal = r;
	}
	public double getSeguroTotal()
	{
		return seguroTotal;
	}

	public abstract double somar(double aux);
		

}
