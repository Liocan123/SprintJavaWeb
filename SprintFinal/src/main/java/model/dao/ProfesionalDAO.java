package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Administrativo;
import model.entity.Profesional;

public class ProfesionalDAO implements IProfesionalDAO {

	@Override
	public void create(Profesional p) {
		String sql = "";
		String sql2 = "";

		try {
			sql = "insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) " + "values ("
				    + p.getRun() + ", '" + p.getNombre() + "', '" + p.getFechaDeNacimiento()
					+ "', 'Profesional'); ";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);
			} catch(SQLException e) {
				System.out.println("auxilio");
			}
			
			
			try {
			
			sql2 = "insert into Profesional (idUsuario, titulo, fechaDeIngreso) values ("
				    + "LAST_INSERT_ID()" + ", '" + p.getTitulo() + "', '" + p.getFechaDeIngreso() + "');";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			stm.execute(sql2);
			
			} catch(SQLException e) {
				System.out.println("Error por aca");
			}

	}

	@Override
	public List<Profesional> read() {
		List<Profesional> lista = new ArrayList<Profesional>();
		try {
			String sql = "SELECT usuario.run, usuario.nombre, usuario.fechaDeNacimiento, usuario.tipoDeUsuario, "
					+ "profesional.titulo, profesional.fechaDeIngreso FROM usuario "
					+ "INNER JOIN profesional ON usuario.idUsuario=profesional.idUsuario;";
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				
				lista.add(new Profesional(rs.getInt("usuario.run"), rs.getString("usuario.nombre"), rs.getString("usuario.fechaDeNacimiento"), 
						rs.getString("tipoDeUsuario"), rs.getString("profesional.titulo"), rs.getString("profesional.fechaDeIngreso")));
				
				
			}
				
			
			
		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public Profesional read(int idUsuario) {
		// TODO Auto-generated method stub
				Profesional profesional = new Profesional();

				try {
					

					String sql = "SELECT usuario.idUsuario, usuario.run, usuario.nombre, usuario.fechaDeNacimiento, usuario.tipoDeUsuario,profesional.titulo,"
							+ "profesional.fechaDeIngreso FROM usuario INNER JOIN profesional ON usuario.idUsuario=profesional.idUsuario where usuario.run = " + idUsuario;

					Connection cnn = Conexion.getConnection();

					Statement stm = cnn.createStatement();
					ResultSet rs = stm.executeQuery(sql);

					if (rs.next()) {
						 profesional = new Profesional(rs.getInt("usuario.idUsuario"),rs.getInt("usuario.run"), rs.getString("usuario.nombre"), rs.getString("usuario.fechaDeNacimiento"), 
								rs.getString("usuario.tipoDeUsuario"), rs.getString("profesional.titulo"), rs.getString("profesional.fechaDeIngreso"));
						 
					}

				} catch (SQLException e) {
					System.out.println("Error al consiultar la BD");
					e.printStackTrace();
				}

				return profesional;
			}
	

	@Override
	public void update(Profesional p) {
		String sql = "";
		String sql2 = "";
		
		try {
			
			sql = "update Usuario set run = '" + p.getRun() + "', nombre = '" + p.getNombre()
	        + "', fechaDeNacimiento = '" + p.getFechaDeNacimiento() + "' where idUsuario = '" + p.getIdUsuario() + "';";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);
			} catch(SQLException e) {
				System.out.println("auxilio");
			}
			
			
			try {
				

				
			sql2 = "update profesional set titulo = '" + p.getTitulo()
	            + "', fechaDeIngreso='" + p.getFechaDeIngreso() + "' where idUsuario = '" + p.getIdUsuario() + "';";
			
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			stm.execute(sql2);
			
			} catch(SQLException e) {
				System.out.println("Error por aca");
			}

	}

	@Override
	public void delete(int idUsuario) {
		// TODO Auto-generated method stub

	}

}
