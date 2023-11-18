package com.demo.wearway.entity;

import com.demo.wearway.repository.ProductRepository;
import com.demo.wearway.repository.SubCategoryRepository;
import com.demo.wearway.repository.SupCategoryRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PrePersist;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class ProductRepositoryTest {

    @PersistenceContext
    EntityManager em;
    @Autowired
    SupCategoryRepository supCategoryRepository;
    @Autowired
    SubCategoryRepository subCategoryRepository;
    @Autowired
    ProductRepository productRepository;

    @Test
    void productBasic() throws Exception {
        //given
        SupCategory top = new SupCategory("상의");
        SubCategory shortT = new SubCategory(top, "반팔티");
        Product prod1 = new Product(shortT, "무신사 반팔티", "./img1.jpg", "무신사 반팔 티셔츠입니다.", 20000, 100);
        supCategoryRepository.save(top);
        subCategoryRepository.save(shortT);
        productRepository.save(prod1);

        em.flush();
        em.clear();

        //when
        Product findProduct = productRepository.findById(prod1.getId()).get();

        //then
        assertThat(findProduct.getName()).isEqualTo(prod1.getName());
        assertThat(findProduct.getSubCategory().getName()).isEqualTo(shortT.getName());
        assertThat(findProduct.getSubCategory().getSupCategory().getName()).isEqualTo(top.getName());
    }

    @Test
    void applySalePriceTest() throws Exception {
        //given


        //when

        //then
    }

}