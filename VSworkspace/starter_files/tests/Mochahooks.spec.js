const assert = require('chai').assert;
const TodoPage= require('../pages/todo.page');

describe('Chai Assert Suite', ()=> {
    before( ()=> { 
    browser.url('');
    });

    beforeEach(()=>   {
        TodoPage.createTodo('BeforeEach');
    });

    after(()=> {
        TodoPage.createTodo('after');
        browser.pause(2000);
    });

    afterEach(()=>   {
        TodoPage.createTodo('Afteeach');
        browser.pause(2000);
    });
 
    it('should test something with chai assert',()=> {
        
        assert.equal(TodoPage.title.getText(),'todos','title is not the same');
        TodoPage.createTodo('Todo:1');
        browser.pause(2000);
    });


    it('should test something with chai assert',()=> {
        assert.equal(TodoPage.title.getText(),'todos','title is not the same');
        TodoPage.createTodo('Todo:2');
        browser.pause(2000);
    });
});