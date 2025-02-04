package fr.IlannStefanvitch.ExoProf;

public class Teste {

	public static void main(String[] args) {
		Livre l1 = new Livre ();
		System.out.println(l1.getName());
		System.out.println(l1.getPrice());
		System.out.println(l1.getQuatite());
		l1.setName("Le Livre ");
		System.out.println(l1.getName());
		System.out.println(l1.toString());
		Livre l2 = new Livre ("CeLivreEstSuper",10,13);
		System.out.println(l2.getName());
		System.out.println(l2.getPrice());
		System.out.println(l2.getQuatite());
		l2.setName("Le Livre ");
		System.out.println(l2.getName());
		System.out.println(l2.toString());

	}

}
