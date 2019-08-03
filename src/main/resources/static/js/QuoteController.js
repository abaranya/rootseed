'use strict';
var module = angular.module('rootseed.controllers', []);


module.controller("QuoteController", ["$scope",
    function QuoteController($scope) {
        console.log("Hello world!");
        $scope.quote = {
            symbol: "TICK",
            value: 0.0,
            dateTime: "2019-09-01 10:25:00"
        }
    }]);