describe('Getting started',function()    {
    it.skip('should open a web page',()=> {
      browser.url('https://the-internet.herokuapp.com/');

      // correct base url set in the config file 
      browser.url('');
     //console.log(browser.getUrl());
     browser.pause(5000);
    });

     it.skip('should click something',() => {
        browser.url('https://the-internet.herokuapp.com/');

    var abTestLink = $('#content > ul > li:nth-child(1) > a');
    var h2Text = $('#content > h2');
    var h1Text= $('#content > h1');

    console.log(abTestLink.getText());
    console.log(h2Text.getText());
    console.log('H1TExt:' + h1Text.getText());

           //abTestLink.click();
     browser.pause(3000);

     }) 

     it.skip('should test check boxes', ()=>{
        browser.url('https://the-internet.herokuapp.com/');
        var checkboxLink = $('#content > ul > li:nth-child(6) > a');
        checkboxLink.click();
        var checkbox1 = $('#checkboxes > input[type=checkbox]:nth-child(1)');
        var checkbox2 = $('#checkboxes > input[type=checkbox]:nth-child(3)');

        console.log('chk1 before:' + checkbox1.getAttribute('checked'));
        console.log('chk2 before:' + checkbox2.getAttribute('checked'));

        checkbox1.click();
        checkbox2.click();

        console.log('chk1 after:' + checkbox1.getAttribute('checked'));
        console.log('chk2 after:' + checkbox2.getAttribute('checked'));

        browser.pause(3000);
        

     })

     it('should check the text field', () => {
        browser.url('https://the-internet.herokuapp.com/');
        var inputLink = $('#content > ul > li:nth-child(27) > a')
        inputLink.click();

        var inputField = $('#content > div > div > div > input[type=number]');
        inputField.setValue('1');
        console.log('Input value :' + inputField.getValue());
        inputField.setValue('2');
        browser.pause(3000);

        inputField.setValue('1234456');
        inputField.clearValue();
        browser.pause(2000);




     })
});