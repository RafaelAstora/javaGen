package atvd3;

public class Console extends Produto {
	private boolean DriveMidiaFisica;

	public Console(long id, double preco, String nome, String foto, String tipoMidia, boolean driveMidiaFisica) {
		super(id, preco, nome, foto, tipoMidia);
		DriveMidiaFisica = driveMidiaFisica;
	}

	public boolean isDriveMidiaFisica() {
		return DriveMidiaFisica;
	}

	public void setDriveMidiaFisica(boolean driveMidiaFisica) {
		DriveMidiaFisica = driveMidiaFisica;
	}

	public void visualizar() {
		super.visualizar();
		if (DriveMidiaFisica)
			System.out.println("\nTem Drive para midia fisica");
		else
			System.out.println("\nNão Drive para midia fisica");

	}

}
