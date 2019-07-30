package com.abaranya.rootseed.service;

import com.abaranya.rootseed.entity.Quote;
import com.abaranya.rootseed.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuoteService {
    String getQuotes();
    Quote getLastQuote(String symbol);
    List <Quote> getDayQuote(String symbol);
}

