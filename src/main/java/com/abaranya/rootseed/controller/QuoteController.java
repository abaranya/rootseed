package com.abaranya.rootseed.controller;


import com.abaranya.rootseed.entity.Quote;
import com.abaranya.rootseed.service.QuoteService;
import com.abaranya.rootseed.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/quote")
@RestController
public class QuoteController {
    @Autowired
    QuoteService quoteService;

    @RequestMapping(Constants.GET_QUOTES)
    public String getQuotes() {
        return quoteService.getQuotes();
    }

    @RequestMapping(Constants.GET_LAST_QUOTE)
    public Quote getLastQuote(@PathVariable String symbol) {
        return quoteService.getLastQuote(symbol);
    }

    @RequestMapping(Constants.GET_DAY_QUOTE)
    public List<Quote> getDayQuote(@PathVariable String symbol) {
        return quoteService. getDayQuote(symbol);
    }
}
