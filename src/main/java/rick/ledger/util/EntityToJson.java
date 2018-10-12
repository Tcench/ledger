package rick.ledger.util;

import com.google.gson.Gson;
import rick.ledger.entity.Supplier;

public class EntityToJson {

    public static void main(String[] args) {
        Supplier supplier = new Supplier();
        supplier.setAddress("xxxxxxxx");
        supplier.setLinkman("xxxxxxxxx");
        supplier.setMobilePhone("1232132131");
        supplier.setId(1);
        supplier.setShopName("xxxxxxx");
        supplier.setUsername("xxxxx");
        supplier.setTelephone("24234242");

        Gson gson = new Gson();
        System.out.println(gson.toJson(supplier));

    }
}
