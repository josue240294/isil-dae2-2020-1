package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Vendedor;
import pe.isil.repository.jdbcVendedorRepository;

import java.util.List;

@Service
public class VendedorService implements BaseService<Vendedor,Long> {

    @Autowired
    jdbcVendedorRepository jdbcVendedorRepository;
    @Override
    public void create(Vendedor vendedor) {
        jdbcVendedorRepository.create(vendedor);
    }

    @Override
    public void update(Vendedor vendedor) {
        jdbcVendedorRepository.update(vendedor);

    }

    @Override
    public void delete(Vendedor vendedor) {
        jdbcVendedorRepository.delete(vendedor);
    }

    @Override
    public List<Vendedor> findAll() {
        return jdbcVendedorRepository.findAll();
    }

    @Override
    public Vendedor findById(Long id) {
        return jdbcVendedorRepository.findById(id);
    }
}
