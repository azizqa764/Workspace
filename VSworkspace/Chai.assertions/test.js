const chai = require('chai');
const expect = chai.expect;
const should = chai.should;  
const assert = chai.assert;
var name = "aziz";
var bool = true;
var arr = [1,2,3,4,""];


    describe('chai tests',function() {
       it.skip('should pass expect',function()    {
       //expect(name).to.be.equal("aziz","the name are the same");

         for(let i=0;i< arr.length;i++) {
              expect(arr[i].to.be.equal(1));
     }

  })
  it.skip("should pass should",function()  {
      //name.should.equal('aziz', 'this is true');

  bool.should.equal(false,'this is false');



  })

  it('should pass a skip',function()   {
      //assert.equal(name,"aziz","names are not same");
     assert.equal(bool,false);
  })

})