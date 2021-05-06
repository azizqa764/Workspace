const assert= require('assert');
const ElementStatusPage = require('../pages/element.Status.page');

beforeEach(() => {
    browser.url('');
});

afterEach(() => {
    browser.pause(3000);
});

describe('Element status suite',()=> {
    it.skip('should display hidden text', ()=> {
        ElementStatusPage.displayElementButton.click();

        //ms,reverse(t/f),error
        ElementStatusPage.hiddenText.waitForDisplayed(1000,true);  //waiting for the elements
        assert.equal(ElementStatusPage.hiddenText.isDisplayed(),false,'Element is displayed');
    });

    it.skip('should display hidden text', ()=> {
        ElementStatusPage.displayElementButton.click();

        //ms,reverse(t/f),error
        ElementStatusPage.hiddenText.waitForDisplayed(3000);  //waiting for the elements
        assert.equal(ElementStatusPage.hiddenText.isDisplayed(),true,'Element is not displayed');
    });

    it('should display existing text', ()=> {
        ElementStatusPage.createButton.click();
        //the real way of doinng it
        ElementStatusPage.newText.waitForExist(3000);
        //ElementStatusPage.newText.waitForDisplayed(3000);
        // ElementStatusPage.newText.waitForExist(1000,true); check for the not existing
        //assert.equal(ElementStatusPage.newText.isDisplayed(),false,'Element does not exist');
        assert.equal(ElementStatusPage.newText.isDisplayed(),true,'Element does not exist');
    });

    it('should be clickable', ()=> {
        ElementStatusPage.clickMeButton.click();
        ElementStatusPage.clickMeButton.waitForClickable({timeout: 3000});
        assert.equal(ElementStatusPage.clickMeTooButton.isClickable(),true,'Button is Clickable');
        ElementStatusPage.clickMeTooButton.click();
        assert.equal(ElementStatusPage.clickableText.isDisplayed(), true,'Text is not displayed');
        assert.equal(ElementStatusPage.clickableText.getText(),'','Clickable text is not the same');
    });

    it('should be enable', ()=> {
        ElementStatusPage.enableButton.click();
        ElementStatusPage.inputField.waitForEnabled(3000);
        assert.equal(ElementStatusPage.inputField.isEnabled(),true,'Input is disabled');
        ElementStatusPage.inputField.setValue('Enabled');
    });

    it('should change text',()=> {
        ElementStatusPage.changeButton.click();
        browser.waitUntil(() => {
            return ElementStatusPage.changeText.getText() == 'New Text'
        },3000);
        assert.equal(ElementStatusPage.changeText.getText(),'New Text','Text is not the same');
    });
});