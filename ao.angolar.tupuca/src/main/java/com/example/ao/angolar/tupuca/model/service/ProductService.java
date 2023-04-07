package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dao.ProductDto;
import com.example.ao.angolar.tupuca.model.entity.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {

//   Admin
    List<ProductDto> findAll();
    Product save(MultipartFile imageProduct, ProductDto productDto);
    Product update(ProductDto productDto);
    void deleteById(Long id);
//    ProductDto getById(Long id);



//   Customer
//    List<Product> getAllProducts();
//    List<Product> listViewProducts();
//    Product getProductById(Long id);
//    List<Product> getRelateProducys(Long categoryId);
//    List<Product> getProductInCategory(Long categoryId);
//    List<Product> filterHighPrice();
//    List<Product> filterLowPrice();

}
