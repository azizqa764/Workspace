var assert = require('assert');
describe('math suite',function () {
        
    function add(a,b) {
        return a+b
    }
    before(function() {
     console.log("before");
    })

    beforeEach(function() {
    console.log("beforeEach");
    })

    after(function() {
    console.log("after");
    })

    afterEach(function() {
     console.log("afterEach");
    })

    it('should add two numbers correctly',function() {
        var result = 2;
       
        assert.equal(add(1,1),result);
       
        
    })

    it('should add two numbers correctly again',function() {
        var result = 3;
       
        assert.equal(add(1,2),result,"Test Failed.Numbers arent equal");
       
        
    })

    it('should add two numbers correctly again1',function() {
        var result = 3;
       
        assert.equal(add(1,2),result,"Test Failed.Numbers arent equal");
       
        
    })

    it('should add two numbers correctly again2',function() {
        var result = 3;
       
        assert.equal(add(1,2),result,"Test Failed.Numbers arent equal");
       
        
    })

    it('should add two numbers correctly again3',function() {
        var result = 3;
       
        assert.equal(add(1,2),result,"Test Failed.Numbers arent equal");
       
        
    })
    
})

