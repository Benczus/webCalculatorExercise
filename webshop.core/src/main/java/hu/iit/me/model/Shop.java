package hu.iit.me.model;

import java.util.Collection;

public class Shop {

    private String shopID;
    private String shopName;
    private Collection<Product> productList;

    public Shop(String shopID, String shopName, Collection<Product> productList) {
        this.shopID = shopID;
        this.shopName = shopName;
        this.productList = productList;
    }

    public String getShopID() {
        return shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public Collection<Product> getProductList() {
        return productList;
    }
}
