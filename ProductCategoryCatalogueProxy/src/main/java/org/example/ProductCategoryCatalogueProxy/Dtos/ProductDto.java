package org.example.ProductCategoryCatalogueProxy.Dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.ProductCategoryCatalogueProxy.Model.Category;

@Getter
@Setter
@ToString
public class ProductDto {
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private Category category;
}
