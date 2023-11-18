package com.demo.wearway.controller;

import com.demo.wearway.entity.Product;
import com.demo.wearway.entity.SubCategory;
import com.demo.wearway.entity.SupCategory;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Profile("local")
@Component
@RequiredArgsConstructor
public class InitData {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.init();
    }

    @Component
    static class InitService {
        @PersistenceContext
        EntityManager em;

        @Transactional
        public void init() {
            SupCategory top = new SupCategory("상의");
            em.persist(top);

            SubCategory shortT = new SubCategory(top, "반팔티");
            SubCategory longT = new SubCategory(top, "긴팔티");
            em.persist(shortT);
            em.persist(longT);

            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    em.persist(new Product(shortT, "무신사 반팔티" + i, "./img" + i + ".jpg", "무신사 반팔티" + i + "입니다.", 10000 * (i + 1), 100 * (i + 1)));
                } else {
                    em.persist(new Product(longT, "무신사 긴팔티" + i, "./img" + i + ".jpg", "무신사 긴팔티" + i + "입니다.", 10000 * (i + 1), 100 * (i + 1)));
                }
            }
        }
    }
}
