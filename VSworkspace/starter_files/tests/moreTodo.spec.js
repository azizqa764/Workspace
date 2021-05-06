const assert = require('assert');
const TodoPage = require('../pages/todo.page');

describe('More to do suite', ()=> {
    it('should create more todos', ()=> {
     browser.url('');

     //COnvention way of writing
   /*  TodoPage.todoField.setValue('Buy Food');
     browser.keys('Enter');

     TodoPage.todoField.setValue('Eat Food');
     browser.keys('Enter');

     TodoPage.todoField.setValue('Wash dishes');
     browser.keys('Enter'); */

     //WIth methods

     //TodoPage.createTodo('Buy food');
     //TodoPage.createTodo('Eat Food');
     //TodoPage.createTodo('Wash dishes');

     for(let i =0;i< 100; i++) {
         TodoPage.createTodo(`item: ${i+1}` );
     }
     browser.pause(3000);

    });
});

it.only('should create more todos', ()=> {
    browser.url('');
    let list =  ['item 1','item 2','item 3','item 4'];

    for(let i =0;i< list.length; i++) {
        TodoPage.createTodo(list[i]);
    }
    browser.pause(3000);

   });