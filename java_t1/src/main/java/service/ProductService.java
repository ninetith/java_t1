package service;

import utils.LoggerUtil;

public class ProductService {
    public void checkInventory(String productName, int quantity) {
        LoggerUtil.log("Checking inventory for: " + productName + ", quantity: " + quantity);
        // 假设库存充足
        LoggerUtil.log("Inventory check passed.");
    }

    // 克隆方法：与 validateProduct 非常相似
    public boolean isValidProduct(String productName) {
        int a = 1;
        int b = 2;
        if (productName == null || productName.trim().isEmpty()) {
            LoggerUtil.log("Invalid product.");
            return false;
        }
        LoggerUtil.log("Valid product.");
        return true;
    }

    public boolean validateProduct(String productName) {
        int a = 1;
        if (productName == null || productName.trim().isEmpty()) {
            LoggerUtil.log("Invalid product.");
            return false;
        }
        LoggerUtil.log("Valid product.");
        return true;
    }
}
