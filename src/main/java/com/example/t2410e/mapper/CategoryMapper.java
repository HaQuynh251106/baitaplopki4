package com.example.t2410e.mapper;

import com.example.t2410e.dto.category.CategoryRequest;
import com.example.t2410e.dto.category.CategoryResponse;
import com.example.t2410e.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.awt.*;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    //Entity -> Response
    //@Mapping(source = "category.name", target = "categoryName")
    // --> nếu entity là name mà DTO lại l categoryName
    CategoryResponse toResponse(Category category);

    //Request -> Entity
    Category toEntity(CategoryRequest request);

    //List Entity -> List response
    List<CategoryResponse> toResponseList (List<Category> categories);
}
