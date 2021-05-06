const expect = require('chai').expect;
const TodoPage= require('../pages/todo.page');

describe('Chai expect Suite', ()=> {
    it('should test something with chai expect',()=> {
        browser.url('');
        expect(TodoPage.title.getText()).to.equal('todos');
    });
});