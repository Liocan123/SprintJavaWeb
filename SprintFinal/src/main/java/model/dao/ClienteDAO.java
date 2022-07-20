package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Cliente;


public class ClienteDAO implements IClienteDAO {

	@Override
	public void create(Cliente c) {
		String sql = "";
		String sql3 = "";

			try {
			sql = "insert into Usuario (run, nombre, fechaDeNacimiento, tipoDeUsuario) " + "values ("
				    + c.getRun() + ", '" + c.getNombre() + "', '" + c.getFechaDeNacimiento()
					+ "', 'Cliente'); ";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);
			} catch(SQLException e) {
				System.out.println("auxilio");
			}
			
			
			try {
			
			sql3 = "insert into Cliente (IdUsuario, RUT, Nombres, Apellidos, Telefono, AFP, SistemaDeSalud, FechaDeNacimiento, Direccion, Comuna) values ("
				    + "LAST_INSERT_ID()" + ", '" + c.getRut() + "', '" + c.getNombres() + "', '" + c.getApellidos() + "', '" + c.getTelefono()
				    + "', '" + c.getAfp() + "', '" +  c.getSistemaDeSalud() + "', '" +  c.getFechaDeNacimiento() + "', '"
				    + c.getDireccion() + "', '"  + c.getComuna() + "');";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			stm.execute(sql3);
			
			} catch(SQLException e) {
				System.out.println("Error por aca");
			}

	}


	@Override
	public List<Cliente> read() {
		List<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			String sql = "SELECT usuario.run, usuario.nombre, usuario.fechaDeNacimiento, usuario.tipoDeUsuario, cliente.rut, cliente.nombres, cliente.apellidos, "
					+ "cliente.telefono, cliente.afp, cliente.sistemaDeSalud, cliente.fechaDeNacimiento, cliente.direccion, cliente.comuna "
					+ "FROM usuario INNER JOIN cliente ON usuario.idUsuario=cliente.idUsuario;";
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				
				lista.add(new Cliente(rs.getInt("usuario.run"), rs.getString("usuario.nombre"), rs.getString("usuario.fechaDeNacimiento"), 
						rs.getString("tipoDeUsuario"), rs.getInt("cliente.rut"), rs.getString("cliente.nombres"), rs.getString("cliente.apellidos"),
						rs.getString("cliente.telefono"), rs.getString("cliente.afp"), rs.getInt("cliente.sistemaDeSalud"), 
						rs.getString("cliente.fechaDeNacimiento"), rs.getString("cliente.direccion"), rs.getString("cliente.comuna")));
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public Cliente read(int idUsuario) {
		
		Cliente cliente = new Cliente();

		try {

			String sql = "SELECT usuario.idUsuario, usuario.run, usuario.nombre, usuario.fechaDeNacimiento, usuario.tipoDeUsuario, cliente.rut, cliente.nombres, cliente.apellidos, "
					+ "cliente.telefono, cliente.afp, cliente.sistemaDeSalud, cliente.fechaDeNacimiento, cliente.direccion, cliente.comuna "
					+ "FROM usuario INNER JOIN cliente ON usuario.idUsuario=cliente.idUsuario where cliente.rut = " + idUsuario;

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {
				 cliente = new Cliente(rs.getInt("usuario.idUsuario"),rs.getInt("usuario.run"), rs.getString("usuario.nombre"), rs.getString("usuario.fechaDeNacimiento"), 
						rs.getString("tipoDeUsuario"), rs.getInt("cliente.rut"), rs.getString("cliente.nombres"), rs.getString("cliente.apellidos"),
						rs.getString("cliente.telefono"), rs.getString("cliente.afp"), rs.getInt("cliente.sistemaDeSalud"), 
						rs.getString("cliente.fechaDeNacimiento"), rs.getString("cliente.direccion"), rs.getString("cliente.comuna"));
			}

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD");
			e.printStackTrace();
		}

		return cliente;
	}

	@Override
	public void update(Cliente c) {
		
		String sql2 = "";
		String sql4 = "";
		
		try {
			
			sql2 = "update Usuario set run = '" + c.getRun() + "', nombre = '" + c.getNombre()
	        + "', fechaDeNacimiento = '" + c.getFechaDeNacimiento() + "' where idUsuario = '" + c.getIdUsuario() + "';";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql2);
			} catch(SQLException e) {
				System.out.println("auxilio");
			}
			
			
			try {
				
				System.out.println("update Cliente set rut = '" + c.getRut()
	            + "', nombres='" + c.getNombres() + "', apellidos = '" + c.getApellidos()
	            + "', telefono = '" + c.getTelefono() + "' afp = '" + c.getAfp() + "', sistemaDeSalud = '" + c.getSistemaDeSalud()+ 
	            "',fechaDeNacimiento = '" + c.getFechaDeNacimiento() 
	            + "', direccion = '" + c.getDireccion() + "', comuna = '" + c.getComuna()+ "' where IdUsuario= '" + c.getIdUsuario() + "';");

				
			sql4 = "update Cliente set rut = '" + c.getRut()
	            + "', nombres='" + c.getNombres() + "', apellidos = '" + c.getApellidos()
	            + "', telefono = '" + c.getTelefono() + "', afp = '" + c.getAfp() + "', sistemaDeSalud = '" + c.getSistemaDeSalud()+ 
	            "',fechaDeNacimiento = '" + c.getFechaDeNacimiento() 
	            + "', direccion = '" + c.getDireccion() + "', comuna = '" + c.getComuna()+ "' where IdUsuario= '" + c.getIdUsuario() + "';"; 
			
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			stm.execute(sql4);
			
			} catch(SQLException e) {
				System.out.println("Error por aca");
			}

	}

	@Override
	public void delete(int idUsuario) {
		// TODO Auto-generated method stub

	}

}
