package com.abaranya.rootseed.service;

import com.abaranya.rootseed.entity.Quote;
import com.abaranya.rootseed.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteServiceimpl implements QuoteService {
    @Autowired
    QuoteRepository quoteRepository;

    @Override
    public String getQuotes(){
        // TODO Get DTO
        return "Dunno";
    }

    @Override
    public Quote getLastQuote(String symbol){
        // TODO findQuotes
        return null;
    }

    @Override
    public List<Quote> getDayQuote(String symbol){
        // TODO implements get day quote
        return null;
    }
}
