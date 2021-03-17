package files;

import files.Dao.ProductDao;
import files.entity.Product;

public class Application {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
//        productDao.createProduct("Картошка", 50);
//        productDao.createProduct("Огурцы", 150);
//        productDao.createProduct("Помидоры", 250);
//        productDao.createProduct("Бананы", 100);
        System.out.println(productDao.findById(9L));
        productDao.deleteById(9L);
        System.out.println(productDao.findAll());
        Product product = new Product(1L,"Груша",600);
        System.out.println(productDao.saveOrUpdate(product));
        Product product2 = new Product(10L,"Бананы",400);
        System.out.println(productDao.saveOrUpdate(product2));
        System.out.println(productDao.findAll());
    }
}