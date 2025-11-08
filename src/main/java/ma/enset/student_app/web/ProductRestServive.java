package ma.enset.student_app.web;

import ma.enset.student_app.entities.Product;
import ma.enset.student_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductRestServive {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> products(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id){
        Optional<Product> byId =productRepository.findById(id);
        return byId.get();
    }

}
