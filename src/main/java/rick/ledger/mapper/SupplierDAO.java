package rick.ledger.mapper;

import org.apache.ibatis.annotations.Mapper;
import rick.ledger.entity.Supplier;
import rick.ledger.util.query.SupplierQuery;

import java.util.List;

@Mapper
public interface SupplierDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer id);

    List<Supplier> findList(SupplierQuery supplierQuery);

    Integer findSupplierCount(SupplierQuery supplierQuery);


    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}