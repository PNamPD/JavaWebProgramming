/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
function Sum(_arr){
  var arr = _arr.reduce((a, b) => a + b, 0);
  this.getArr = function(){
    return arr;
  }
}

var sum = new Sum([1,2,3]);       // => undefined
console.log(sum.getArr());