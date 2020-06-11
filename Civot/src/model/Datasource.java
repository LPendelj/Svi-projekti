package model;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import civotIgra.Cinjenice;
import civotIgra.Odgovori;

public class Datasource  {
	
	public static final String DB_NAME = "proba.db";
	public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Luka\\Programiranje\\workspace\\Civot\\src\\civotIgra\\" + DB_NAME;
	
	
	public static final String TABLE_cinjenice = "cinjenice";
	public static final String COLUMN_cinjenice_id = "cinjenice_id";
	public static final String COLUMN_cinjenice_sadrzaj = "sadrzaj";
	public static final String COLUMN_cinjenice_odgovor = "id_odgovora";	
	public static final String COLUMN_cinjenice_kategorija = "kategorija";
	public static final String COLUMN_cinjenice_tezina = "tezina";
	
	public static final String TABLE_odgovori = "odgovori";
	public static final String COLUMN_odgovori_id = "odgovori.id";
	public static final String COLUMN_odgovori_odgovor = "odgovor";
	
	public static final String TABLE_igraci = "igraci";
	public static final String COLUMN_igraci_id = "igraci";
	public static final String COLUMN_igraci_ime = "ime";
	public static final String COLUMN_igraci_bodovi = "bodovi";
	
	public Statement statement;
	
private Connection con;
	
	
	public boolean open() throws ClassNotFoundException  {
		try {
			
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection(CONNECTION_STRING);
			return true;
		} catch (SQLException e) {
			System.out.println("Nemoguce je povezati se sa bazom. " + e);
			return false;
		}
	}
	
	public List<Cinjenice> preuzmi() {
		try (Statement statement = con.createStatement();
				ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_cinjenice +
						" JOIN " + TABLE_odgovori +  " ON cinjenice.id_odgovora=odgovori.id;" );
				){
		List<Cinjenice> listaCinjenica = new LinkedList<>();
				while(results.next()) {
					Cinjenice cinjenica = new Cinjenice();
					cinjenica.setId(results.getInt(COLUMN_cinjenice_id));
					cinjenica.setSadrzaj(results.getString(COLUMN_cinjenice_sadrzaj));
					cinjenica.setOdgovor(new Odgovori(results.getString(COLUMN_odgovori_odgovor)));
					listaCinjenica.add(cinjenica);	
				}
		return listaCinjenica;
		}	
				
		catch (SQLException e) {
			
			System.out.println("Upit neuspesan: " + e);
			return null;
		}
		
		
		
	}
	
		
		public void close() {
			try {
				if(con!=null) {
					con.close();
					System.out.println("Baza zatvorena!");
				}
			}
			catch(SQLException e) {
				System.out.println("Ne moze se zatvoriti" + e);
			}
		
		
	}
}
