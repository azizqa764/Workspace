const internetpage = require('../pages/internet.page');
const assert = require('assert');
const InputsPage = require('../pages/inputs.page');
const inputsPage = require('../pages/inputs.page');

describe('Node Assertion tests', () => {
      it('should display correct text for the headings', ()=> {
     browser.url('https://the-internet.herokuapp.com/');

    assert.equal(
        internetpage.mainHeadingText.getText(),
        'Welcome to the-internet',"The heading text does match "
    );
   });
   
      it('should navigate to new page and enter some text',()=> {
      browser.url('https://the-internet.herokuapp.com/')
      
      internetpage.inputsLink.click();
      assert.equal(browser.getUrl(),'https://the-internet.herokuapp.com/inputs','');

     //check if initial value is empty
    assert.equal(inputsPage.inputField.getValue(),'','The value is not null');    

    inputsPage.inputField.setValue('9');

     //check if new value is something
    assert.equal(inputsPage.inputField.getValue(),'9','The value is not 9'); 

      });
});
//to run the test use this command 
//.\node_modules\.bin\wdio .\wdio.conf.js