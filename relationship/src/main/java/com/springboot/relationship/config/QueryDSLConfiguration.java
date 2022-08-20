package com.springboot.relationship.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class QueryDSLConfiguration {

    @PersistenceContext
    EntityManager entityManager;

    /**
     * 이렇게 JPAQueryFactory 객체를 @Bean 객체로 등록해두면 이전 테스트 코드에서처럼
     * 매번 JPAQueryFactory를 초기화하기 않고 스프링 컨테이너에서 가져다 쓸 수 있다.
     */
    @Bean
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }

}
