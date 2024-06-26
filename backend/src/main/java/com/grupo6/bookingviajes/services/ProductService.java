package com.grupo6.bookingviajes.services;

import com.grupo6.bookingviajes.model.Category;
import com.grupo6.bookingviajes.model.City;
import com.grupo6.bookingviajes.model.Product;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Integer id);
    List<Product>getProductsByCategory(Category id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProductById(Integer id);
    List<Product>getProductsByCity(City id);
    List<Product> getProductsByRangeDate(LocalDate check_in_date, LocalDate check_out_date);
    List<Product> getProductsByCityAndRangeDate(Integer city_id, LocalDate check_in_date, LocalDate check_out_date);

    List<Product> getRandomProduct();

}
