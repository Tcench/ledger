package rick.ledger.service;

import rick.ledger.entity.Supplier;
import rick.ledger.util.query.SupplierQuery;

import java.util.List;

public interface SupplierService {


    List<Supplier> findList(SupplierQuery supplierQuery);

    int add(Supplier supplier);

}
