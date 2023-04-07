package com.example.ao.angolar.tupuca.model.service.impl;

import com.example.ao.angolar.tupuca.dto.ProductDto;
import com.example.ao.angolar.tupuca.model.entity.Product;
import com.example.ao.angolar.tupuca.model.repository.ProductRepository;
import com.example.ao.angolar.tupuca.model.service.ProductService;
import com.example.ao.angolar.tupuca.utils.ImageUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ImageUpload imageUpload;

    @Override
    public List<ProductDto> findAll() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = transfer(products);
        return productDtos;
    }

    @Override
    public Product save(MultipartFile imageProduct, ProductDto productDto) {

        try {

            Product product = new Product();

            if (imageProduct == null) {
                product.setImage(null);
            } else {
                if (imageUpload.uploadImage(imageProduct)) {
                    System.out.println("Upload successfully");
                }
                product.setImage(Base64.getEncoder().encodeToString(imageProduct.getBytes()));
            }

            product.setName(productDto.getName());
            product.setDescription(productDto.getDescription());
            product.setCategory(productDto.getCategory());
            product.setCostPrice(productDto.getCostPrice());
            product.setCurrentQuantity(productDto.getCurrentQuantity());
            product.set_activated(true);
            product.set_deleted(false);

            return productRepository.save(product);
        } catch (Exception e ) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Product update(MultipartFile imageProduct, ProductDto productDto) {

        try {
            Product product = productRepository.getById(productDto.getId());

            if ( imageProduct == null ) {
                product.setImage(product.getImage());
            } else {

                if (!imageUpload.checkExisted(imageProduct)) {
                    System.out.println("Upload to folder");
                    imageUpload.uploadImage(imageProduct);
                }
                System.out.println("image existed");
                product.setImage(Base64.getEncoder().encodeToString(imageProduct.getBytes()));
            }

            product.setName(productDto.getName());
            product.setDescription(productDto.getDescription());
            product.setSalePrice(productDto.getSalePrice());
            product.setCostPrice(productDto.getCostPrice());
            product.setCurrentQuantity(productDto.getCurrentQuantity());
            product.setCategory(productDto.getCategory());
//            return product;
            return productRepository.save(product);
        } catch (Exception e ) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void deleteById(Long id) {

        Product product = productRepository.getById(id);
        product.set_deleted(true);
        product.set_activated(false);

        productRepository.save(product);
    }

    @Override
    public void enableById(Long id) {

        Product product = productRepository.getById(id);
        product.set_activated(true);
        product.set_deleted(false);

        productRepository.save(product);
    }

    @Override
    public ProductDto getById(Long id) {

        Product product = productRepository.getById(id);
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setCurrentQuantity(product.getCurrentQuantity());
        productDto.setCategory(product.getCategory());
        productDto.setSalePrice(product.getSalePrice());
        productDto.setCostPrice(product.getCostPrice());
        productDto.setImage((product.getImage()));
        productDto.setDeleted(product.is_deleted());
        productDto.setActivated(product.is_activated());

        return productDto;
    }

    @Override
    public Page<Product> pageProduct(int pageNo) {
        Pageable pageable = PageRequest.of(pageNo, 5);
        Page<Product> productPages = productRepository.pageProduct(pageable);
        return productPages;
    }

    @Override
    public Page<Product> searchProducts(int pageNo, String keyword) {
        Pageable pageable = PageRequest.of(pageNo, 5);
        Page<Product> products = productRepository.searchProducts(pageable, keyword);

        return products;
    }

    private List<ProductDto> transfer(List<Product> products) {
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : products) {
            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setName(product.getName());
            productDto.setDescription(product.getDescription());
            productDto.setCurrentQuantity(product.getCurrentQuantity());
            productDto.setCategory(product.getCategory());
            productDto.setSalePrice(product.getSalePrice());
            productDto.setCostPrice(product.getCostPrice());
            productDto.setImage(product.getImage());
            productDto.setDeleted(product.is_deleted());
            productDto.setActivated(product.is_activated());
            productDtoList.add(productDto);
        }
        return productDtoList;
    }
}
