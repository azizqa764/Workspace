const internetPage = require('../pages/internet.page');

describe('Page object Tests', ()=> {
  it('should use a page object', ()=> {
    browser.url('https://the-internet.herokuapp.com/');
    console.log('Main Heading:' + internetPage.mainHeadingText.getText());
    console.log('Sub Heading:' + internetPage.subHeadingText.getText());
  });

});