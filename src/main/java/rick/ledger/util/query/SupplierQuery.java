package rick.ledger.util.query;

import rick.ledger.util.QueryBase;

/**
 * TODO 参数校验
 */
public class SupplierQuery extends QueryBase {

    private String linkman;

    private String shopName;

    private String username;

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
