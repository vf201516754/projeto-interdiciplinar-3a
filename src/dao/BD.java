package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
	public Connection connection = null;
	private final String DRIVE = "com.mysql.jdbc.Driver";
	private final String DBNAME = "banco"; 
	private final String URL = "jdbc:mysql://127.0.0.1:3306/" + DBNAME;
	private final String LOGIN = "root";
	private final String SENHA = "";
	
	public boolean getConnection() {
		try {
			Class.forName(DRIVE);
			connection = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conectou");
			return true;
		} catch(ClassNotFoundException erro) {
			System.out.println("Driver não encontrado" + erro.toString());
			return false;
		} catch(SQLException erro) {
			System.out.println("Falha na conexão" + erro.toString());
			return false;
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("Desconectou");
		} catch(SQLException erro) {
			
		}
	}

}
