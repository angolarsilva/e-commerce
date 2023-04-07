package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dto.ProductDto;
import com.example.ao.angolar.tupuca.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {

//   Admin
    List<ProductDto> findAll();
    Product save(MultipartFile imageProduct, ProductDto productDto);
    Product update(MultipartFile imageProduct, ProductDto productDto);
    void deleteById(Long id);
    void enableById(Long id);
    ProductDto getById(Long id);

    Page<Product> pageProduct(int pageNo);

    Page<Product> searchProducts(int pageNo, String keyword);


    /*Customer*/
    List<Product> getAllProducts();
    List<Product> listViewProducts();
    Product getProductById(Long id);
    List<Product> getRelatedProducys(Long categoryId);
    List<Product> getProductInCategory(Long categoryId);
    List<Product> filterHighPrice();
    List<Product> filterLowPrice();

}
