package com.abaranya.rootseed.repository;

import com.abaranya.rootseed.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository <Quote, Integer> {
}
