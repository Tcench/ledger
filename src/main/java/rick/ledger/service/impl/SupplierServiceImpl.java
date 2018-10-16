package rick.ledger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rick.ledger.entity.Supplier;
import rick.ledger.mapper.SupplierDAO;
import rick.ledger.service.SupplierService;
import rick.ledger.util.query.SupplierQuery;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDAO supplierDAO;

    @Override
    public List<Supplier> findList(SupplierQuery supplierQuery) {

        return supplierDAO.findList(supplierQuery);
    }

    @Override
    public int add(Supplier supplier) {
        return supplierDAO.insertSelective(supplier);
    }

    @Override
    public Supplier getById(Integer id) {
        return supplierDAO.selectByPrimaryKey(id);
    }
}
