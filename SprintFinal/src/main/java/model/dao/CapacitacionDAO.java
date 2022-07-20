package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Capacitacion;

public class CapacitacionDAO implements ICapacitacionDAO {

	@Override
	public void create(Capacitacion ca) {
		String sql = "";
		try {

			sql = "insert into Capacitacion (rutCliente, dia, hora, lugar, duracion, cantidadDeAsistentes) " + "values ("
				    + ca.getRut() + ", '" + ca.getDia() + "', '" + ca.getHora()
					+ "', '" + ca.getLugar() + "', '" + ca.getDuracion()
				    + "', " + ca.getCantidadDeAsistentes()
					+ " ) ";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD: " + sql);
			e.printStackTrace();
		}

	}

	@Override
	public List<Capacitacion> read() {
		
		List<Capacitacion> lista = new ArrayList<Capacitacion>();		
		try {
			
			String sql= "select identificador, rutCliente, dia, hora, lugar, "
					+ "duracion, cantidadDeAsistentes from capacitacion";
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				
				lista.add(new Capacitacion(rs.getInt("identificador"), rs.getInt("rutCliente"), rs.getString("dia"),
						rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"), rs.getInt("cantidadDeAsistentes")));
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public Capacitacion read(int identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Capacitacion ca) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int identificador) {
		// TODO Auto-generated method stub

	}

}
