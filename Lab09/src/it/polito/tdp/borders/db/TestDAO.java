package it.polito.tdp.borders.db;

public class TestDAO {

	public static void main(String[] args) {

		BordersDAO dao = new BordersDAO();

		System.out.println("Lista di tutte le nazioni:");
		
		System.out.println(dao.loadAllCountries().toString());
		
        System.out.println("Lista di tutti i confini :");
		
		System.out.println(dao.getCountryPairs(2000).toString());
		
		
	}
}
