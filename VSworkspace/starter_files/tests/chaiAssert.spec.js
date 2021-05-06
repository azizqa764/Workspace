const assert = require('chai').assert;
const TodoPage= require('../pages/todo.page');

describe('Chai Assert Suite', ()=> {
    it('should test something with chai assert',()=> {
        browser.url('');
        assert.equal(TodoPage.title.getText(),'todos','title is not the same');
    });
});