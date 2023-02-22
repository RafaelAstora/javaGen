package atvd3;

public class TestaLojaDeGames {

	public static void main(String[] args) {

		LojaDeGames g1 = new LojaDeGames(1, 75, "Rise of the Tomb Raider", "PC", "Digital");
		LojaDeGames g2 = new LojaDeGames(2, 325, "God of war Ragnarok", "PS5", "DVD");
		LojaDeGames g3 = new LojaDeGames(3, 350, "Zelda Bafo do selvagem", "Nintendo Swittch", "Chip");

		
		g1.visualizar();
		g2.visualizar();
		g3.visualizar();
		
	}

}
