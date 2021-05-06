const should = require('chai').should;
const TodoPage= require('../pages/todo.page');

describe('Chai should Suite', ()=> {
    it('should test something with chai should',()=> {
        browser.url('');
        TodoPage.title.getText().should.equal('todos');
    });
});