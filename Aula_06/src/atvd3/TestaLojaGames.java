package atvd3;

public class TestaLojaGames {

	public static void main(String[] args) {

		Jogo g1 = new Jogo(1, 75, "Rise of the Tomb Raider", "PC", "Digital", "Square Enix");
		Jogo g2 = new Jogo(2, 325, "God of war Ragnarok", "PS5", "DVD","Santa monica");
		
		g1.visualizar();
		g2.visualizar();
		
		
		Console c1 = new Console(3, 4500, "PS5", "-","DVD",true);
		Console c2 = new Console(4, 3000, "switch", "-","chip",true);

		c1.visualizar();
		c2.visualizar();

		
	}

}
