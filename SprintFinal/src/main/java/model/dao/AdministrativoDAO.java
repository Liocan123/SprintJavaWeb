package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Administrativo;
import model.entity.Cliente;
import model.conn.Conexion;

public class AdministrativoDAO implements IAdministrativoDAO {

	@Override
	public void create(Administrativo a) {
		String sql = "";
		String sql4 = "";

			try {
			sql = "insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) " + "values ("
				    + a.getRun() + ", '" + a.getNombre() + "', '" + a.getFechaDeNacimiento()
					+ "', 'Administrativo'); ";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);
			} catch(SQLException e) {
				System.out.println("auxilio");
			}
			
			
			try {
			
			sql4 = "insert into Administrativo (idUsuario, area, experienciaPrevia)"
					+ " values ("+ "LAST_INSERT_ID()" + ", '" +  a.getArea() + "', '" + a.getExperienciaPrevia() + "');";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			stm.execute(sql4);
			
			} catch(SQLException e) {
				System.out.println("Error por aca");
			}

	

}

	@Override
	public List<Administrativo> read() {
		List<Administrativo> lista = new ArrayList<Administrativo>();
		try {
			String sql = "SELECT usuario.run, usuario.nombre, usuario.fechaDeNacimiento, usuario.tipoDeUsuario, "
					+ "administrativo.area, administrativo.ExperienciaPrevia FROM usuario "
					+ "INNER JOIN administrativo ON usuario.idUsuario=administrativo.idUsuario";
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				
				lista.add(new Administrativo(rs.getInt("usuario.run"), rs.getString("usuario.nombre"), rs.getString("usuario.fechaDeNacimiento"), 
						rs.getString("tipoDeUsuario"), rs.getString("administrativo.area"), rs.getString("administrativo.ExperienciaPrevia")));
				
				
			}
				
			
			
		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public Administrativo read(int idUsuario) {
		// TODO Auto-generated method stub
		Administrativo administrativo = new Administrativo();

		try {
			
			System.out.println("SELECT usuario.idUsuario, usuario.run, usuario.nombre, usuario.fechaDeNacimiento, usuario.tipoDeUsuario,administrativo.area,"
					+ "administrativo.experienciaPrevia"
					+ "FROM usuario INNER JOIN administrativo ON usuario.idUsuario=administrativo.idUsuario where usuario.run = " + idUsuario);

			String sql = "SELECT usuario.idUsuario, usuario.run, usuario.nombre, usuario.fechaDeNacimiento, usuario.tipoDeUsuario,administrativo.area,"
					+ "administrativo.experienciaPrevia FROM usuario INNER JOIN administrativo ON usuario.idUsuario=administrativo.idUsuario where usuario.run = " + idUsuario;

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {
				 administrativo = new Administrativo(rs.getInt("usuario.idUsuario"),rs.getInt("usuario.run"), rs.getString("usuario.nombre"), rs.getString("usuario.fechaDeNacimiento"), 
						rs.getString("usuario.tipoDeUsuario"), rs.getString("administrativo.area"), rs.getString("administrativo.experienciaPrevia"));
				 System.out.println(administrativo);
			}

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD");
			e.printStackTrace();
		}

		return administrativo;
	}

	@Override
	public void update(Administrativo a) {
		String sql4 = "";
		String sql6 = "";
		
		try {
			
			sql4 = "update Usuario set run = '" + a.getRun() + "', nombre = '" + a.getNombre()
	        + "', fechaDeNacimiento = '" + a.getFechaDeNacimiento() + "' where idUsuario = '" + a.getIdUsuario() + "';";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql4);
			} catch(SQLException e) {
				System.out.println("auxilio");
			}
			
			
			try {
				

				
			sql6 = "update Administrativo set area = '" + a.getArea()
	            + "', experienciaPrevia='" + a.getExperienciaPrevia() + "' where idUsuario = '" + a.getIdUsuario() + "';";
			
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			stm.execute(sql6);
			
			} catch(SQLException e) {
				System.out.println("Error por aca");
			}

	}

	@Override
	public void delete(int idUsuario) {
		// TODO Auto-generated method stub

	}

}
