var Calculator = require('../../public/js/calculator.js')
var assert = require('assert')

describe('calculator', function () {
  beforeEach(function () {
    calculator = new Calculator()
  });

  it('addition function test', function(){
    calculator.add(4);
    assert.equal(4, calculator.runningTotal);
  });

  it('subtraction function test', function(){
    calculator.subtract(4);  
    assert.equal(-4, calculator.runningTotal);
  });

  it('multiplication function test', function(){   
    calculator.multiply(6);
    assert.equal(0, calculator.runningTotal);
  });

  it('division function test', function(){
    calculator.divide(3);  
    assert.equal(0, calculator.runningTotal);
  });

  it('numberClick function test', function(){
    calculator.numberClick(8);  
    assert.equal(8, calculator.runningTotal);
  });

  it('operatorClick + (addition) test', function() {
    calculator.operatorClick('+');
    assert.equal('+', calculator.previousOperator);
  });

  it('operatorClick - (subtraction) test', function() {
    calculator.operatorClick('-');
    assert.equal('-', calculator.previousOperator);
  });

  it('operatorClick / (division) test', function(){
    calculator.operatorClick('/');
    assert.equal('/', calculator.previousOperator);
  });

  it('operatorClick * (multiplication) test', function(){
    calculator.operatorClick('*');
    assert.equal('*', calculator.previousOperator);
  });

  it('clearClick function test', function(){
    calculator.clearClick();
    assert.equal(null, calculator.previousOperator);
    assert.equal(null, calculator.previousTotal);
    assert.equal(0, calculator.runningTotal)
  });

  it('multiply 3x5 and get 15 test', function() {
    calculator.numberClick(3);
    calculator.operatorClick('=');
    calculator.multiply(5);
    assert.equal(15, calculator.runningTotal);
  });

  it('divide 21/7 and get 3 test', function() {
    calculator.numberClick(21);
    calculator.operatorClick('=');
    calculator.divide(7);
    assert.equal(3, calculator.runningTotal);
  });

  it('add 1+4 and get 5 test', function() {
    calculator.numberClick(1);
    calculator.operatorClick('=');
    calculator.add(4);
    assert.equal(5, calculator.runningTotal);
  });

  it('subtract 7-4 and get 3 test', function() {
    calculator.numberClick(7);
    calculator.operatorClick('=');
    calculator.subtract(4);
    assert.equal(3, calculator.runningTotal);
  });

  it('concatenating multiple numbers 4,5,6,7,8 test', function(){
    calculator.numberClick(4);
    calculator.numberClick(5);
    calculator.numberClick(6);
    calculator.numberClick(7);
    calculator.numberClick(8);
    calculator.operatorClick('=');
    assert.equal(45678, calculator.runningTotal);
  });

  it('test chain multiple operations together 6 / 2 * 5 + 7 - 3', function(){
    calculator.numberClick(6);
    calculator.operatorClick('=');
    calculator.divide(2);
    calculator.operatorClick('=');
    calculator.multiply(5);
    calculator.operatorClick('=');
    calculator.add(7);
    calculator.operatorClick('=');
    calculator.subtract(3);
    assert.equal(19, calculator.runningTotal);
  });

  it('clear the running total without affecting the calculation 6 / 2 * 5 + (clear) 7 - 3', function(){
    calculator.numberClick(6);
    calculator.operatorClick('=');
    calculator.divide(2);
    calculator.operatorClick('=');
    calculator.multiply(5);
    calculator.operatorClick('=');
    calculator.clearClick();
    calculator.numberClick(7);
    calculator.operatorClick('=');
    calculator.subtract(3);
    assert.equal(4, calculator.runningTotal);
  });

  it('division by zero test (infinity)', function(){
    calculator.numberClick(8);
    calculator.operatorClick('=');
    calculator.divide(0);
    calculator.operatorClick('=');
    assert.equal(Infinity, calculator.runningTotal);
  })

});
