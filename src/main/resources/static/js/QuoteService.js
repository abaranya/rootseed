'use strict';

angular.module('rootseed.services', []).factory('QuoteService', ["$http", "CONSTANTS", function($http, CONSTANTS) {
    var service = {};
    service.getQuotes = function() {
        var url = CONSTANTS.getQuotes + userId;
        return $http.get(url);
    };
    service.getLastQuote = function() {
        return $http.get(CONSTANTS.getLastQuote);
    };
    return service;
}]);