const assert = require('assert');
const { todoItems } = require('../pages/todo.page');
const TodoPage = require('../pages/todo.page');

describe('Dynamic selector suite',()=> {
    it('should get text for multiple items', ()=> {
        browser.url('');

        TodoPage.createTodo('First');
        TodoPage.createTodo('second');
     
        assert.equal(TodoPage.todoItemByRow(1).getText(),'First',
        `text is actually: ${TodoPage.todoItemByRow(1).getText()}`);

        assert.equal(TodoPage.todoItemByRow(1).getText(),'second',
        `text is actually: ${TodoPage.todoItemByRow(2).getText()}`);
        browser.pause(3000);
    });
    browser.pause(3000);

    it.only('should get text using querySelecterAll',()=> {
        browser.url('');
    TodoPage.createTodo('First');
    TodoPage.createTodo('Second');
    assert.equal(
        TodoPage.todoItems[0].getText(),'First',`Text is actually: ${TodoPage.todoItems[0].getText()}`);

        assert.equal(
            TodoPage.todoItems[1].getText(),'Second',`Text is actually: ${TodoPage.todoItems[1].getText()}`);
    

    });
});