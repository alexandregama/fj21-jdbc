package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/caelum-fj21", "root", "");
			return connection;
		} catch (Exception e) {
			throw new RuntimeException("Erro ao se conectar no bando de dados", e);
		}
	}
}
