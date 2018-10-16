package rick.ledger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rick.ledger.entity.Supplier;
import rick.ledger.service.SupplierService;
import rick.ledger.util.R;
import rick.ledger.util.query.SupplierQuery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/list")
    public List<Supplier> list(SupplierQuery supplierQuery) {
        // System.out.println("pageSize: "+supplierQuery.getPageSize());
        return supplierService.findList(supplierQuery);
    }

    @PostMapping("/add")
    public R add(@RequestBody Supplier supplier) {
        int r = supplierService.add(supplier);
        //System.out.println("存储结果: " + r);
        Map<String, Object> result = new HashMap<>();
        result.put("supplier", supplier);

        return R.ok(result);
    }

    @GetMapping("/get")
    public R get(Integer id) {
        Supplier supplier = supplierService.getById(id);
        Map<String, Object> result = new HashMap<>();
        result.put("supplier", supplier);
        return R.ok(result);
    }

}
