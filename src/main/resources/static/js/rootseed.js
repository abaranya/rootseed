'use strict';
var rootseedApp = angular.module('rootseed', ['ui.bootstrap', 'rootseed.controllers',
    'rootseed.services'
]);
rootseedApp.constant("CONSTANTS", {
    getQuotes: "/quote/get-quotes/",
    getLastQuote: "/quote/get-last-quote/"
});