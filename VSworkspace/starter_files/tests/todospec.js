const assert = require('assert');
const TodoPage = require('../pages/todo.page');

describe('Todo Suite', ()=> {  
    it('should enter values using setvalue',()=> {
        let val ='Hello';

        browser.url('');
        TodoPage.todoField.setValue(val);
        assert.equal(TodoPage.todoField.getValue(),val,'the value is not the same');
        browser.pause(2000);
    });
      
    it('should enter values using keys', ()=> {
       let val= 'hello'; 
       browser.url('');
       browser.keys(val);
      // browser.keys('H');
       //browser.keys('i');

       assert.equal(TodoPage.todoField.getValue(),val,'The value is not the same');
       browser.pause(3000);
       browser.keys(['Control','a']);
       browser.pause(3000);
       browser.keys(['Control','x']);
       browser.pause(3000);
       browser.keys(['Control','v']);
       browser.pause(3000);

      // browser.keys('Enter');
       browser.pause(3000);



    });
    it('should enter values and then delete it',()=> {
        let val ='Hello';

        browser.url('');
        TodoPage.todoField.setValue(val);
        assert.equal(TodoPage.todoField.getValue(),val,'the value is not the same');
        browser.pause(2000);

        browser.keys('Enter');

        browser.pause(2000);
        TodoPage.todoItem1.moveTo();
        TodoPage.deleteItem1.click();
        browser.pause(2000);
    });

    it.only('should enter values and then edit it',()=> {
        let val ='Hello';

        browser.url('');
        TodoPage.todoField.setValue(val);
        assert.equal(TodoPage.todoField.getValue(),val,'the value is not the same');
        browser.pause(2000);

        browser.keys('Enter');

        browser.pause(2000);
        TodoPage.todoItem1.doubleClick();
        browser.pause(2000);
        TodoPage.todoField.setValue('Blah Blah');
        TodoPage.todoItem1.doubleClick();
        browser.keys(['Control','a']);
        browser.keys('Delete');
        browser.keys('Bye');
        browser.pause('2000');
        browser.keys('Enter');
    });




});