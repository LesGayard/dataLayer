package com.Jpa.dataLayer;

import com.Jpa.dataLayer.model.Category;
import com.Jpa.dataLayer.model.Comment;
import com.Jpa.dataLayer.model.Product;
import com.Jpa.dataLayer.service.CategoryService;
import com.Jpa.dataLayer.service.CommentService;
import com.Jpa.dataLayer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class DataLayerApplication implements CommandLineRunner {

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	CommentService commentService;

	public static void main(String[] args) {
		SpringApplication.run(DataLayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Iterable<Product> products = this.productService.getProducts();
		products.forEach(product -> System.out.println("List of all products : " + product.getName()));

		Iterable<Category> categories = this.categoryService.getCategories();
		categories.forEach(category -> System.out.println("List of all categoies : " + category.getName()));

		Iterable<Comment> comments = this.commentService.getComments();
		comments.forEach(comment -> System.out.println("List of all comments : " + comment.getContent()));

		Optional<Product>product1 = this.productService.getProductById(1);
		Product product01 = product1.get();
		System.out.println("Product with ID 01 : " + product01.getName());

		Optional<Category>category2 = this.categoryService.getCategoryById(2);
		Category category02 = category2.get();
		System.out.println("category ID 2 : " + category02.getName());

		Optional<Comment>comment3 = this.commentService.getCommentById(3);
		Comment comment03 = comment3.get();
		System.out.println("Comment with ID 3 : " + comment03.getContent());


	}
}
