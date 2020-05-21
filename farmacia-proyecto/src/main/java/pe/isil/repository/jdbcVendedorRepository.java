package pe.isil.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.isil.model.Vendedor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class jdbcVendedorRepository implements VendedorRepository {

    @Autowired
    private JdbcTemplate jdbctemplate;
    @Override
    public void create(Vendedor vendedor) {

        final String SQL ="INSERT INTO vendedor(nombre,lastNameFather,lastNameMother,cargo,direccion,telefono)values(?,?,?,?,?,?)";
        jdbctemplate.update(SQL,vendedor.getNombre(),vendedor.getLastNameFather(),vendedor.getLastNameMother(),vendedor.getCargo(),vendedor.getDireccion(),vendedor.getTelefono());

    }

    @Override
    public void update(Vendedor vendedor) {

        final String SQL = "UPDATE vendedor SET nombre=?,lastNameFather=?,lastNameMother=?,cargo=?,direccion=?,telefono=? WHERE id=?";
        jdbctemplate.update(SQL, vendedor.getNombre(),vendedor.getLastNameFather(),vendedor.getLastNameMother(),vendedor.getCargo(),vendedor.getDireccion(),vendedor.getTelefono(),vendedor.getId());

    }

    @Override
    public void delete(Vendedor vendedor) {

        final String SQL = "DELETE vendedor  WHERE id=?";
        jdbctemplate.update(SQL, vendedor.getId());

    }

    @Override
    public List<Vendedor> findAll() {
        final String SQL = "SELECT * FROM vendedor";

        List<Vendedor> vendedores = jdbctemplate.query(SQL, jdbcVendedorRepository::VendedorRowMapper);
        return vendedores;
    }


    private static Vendedor VendedorRowMapper(ResultSet resultSet, int i) throws SQLException {
        long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String lastNameFather = resultSet.getString("lastNameFather");
        String lastNameMother = resultSet.getString("lastNameMother");
        String cargo = resultSet.getString("cargo");
        String direccion = resultSet.getString("direccion");
        String telefono = resultSet.getString("telefono");

        return new Vendedor(id,nombre,lastNameFather,lastNameMother,cargo,direccion,telefono);

    }

    @Override
    public Vendedor findById(Long id) {
        final String SQL = "SELECT * FROM vendedor WHERE id = ?";
        Vendedor vendedor = jdbctemplate.queryForObject(SQL, new Object[]{id}, jdbcVendedorRepository::VendedorRowMapper);
        return vendedor;
    }
}
