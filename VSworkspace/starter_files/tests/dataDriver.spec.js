const assert = require('chai').assert;
const TodoPage = require('../pages/todo.page');
const data = require('./data/data.json');

const list = ['Eat','Sleep','Clean','Read'];
const listObj = [
    {
        todo:'Eat'
    },
    {
        todo:'Sleep'
    },
    {
        todo:'Clean'
    },
    {
        todo:'read'
    }
];
describe('Data Driven suite',()=> {
    beforeEach(()=> {
      browser.url('');
    });
    afterEach(() => {
        browser.pause(3000);
    });

    it.skip('should create items using array',()=> {

        for(let i=0;i<list.length;i++) {
            TodoPage.createTodo(list[i]);
        }

        for(let j=1;j<list.length;j++) {
            assert.equal(TodoPage.todoItemByRow(j+1).getText(),list[j],'Item value is not the same');
        }
    });
    
    it.skip('should create items using object',()=> {
        for(let i=0;i<listObj.length;i++) {
            TodoPage.createTodo(listObj[i].todo);
        }

        for(let j=0;j<listObj.length;j++){
            assert.equal(TodoPage.todoItemByRow(j+1).getText(),listObj[j].todo,'Item valueis not the same');
    
        }
    });

    it.skip('should create items using external json file', ()=> {
        for(let i=0;i<data.length;i++) {
            TodoPage.createTodo(data[i].todo);
        }
        for(let j=0;j<data.length;j++) {
            assert.equal(TodoPage.todoItemByRow(j+1).getText(),data[j].todo,'item value is not the same');
        }
    });
    
    it('should create items using external json file', ()=> {
        for(let i=0;i<data.length;i++) {
            TodoPage.createTodo(data[i].name);
        }
        for(let j=0;j<data.length;j++) {
            assert.equal(TodoPage.todoItemByRow(j+1).getText(),data[j].name,'item value is not the same');
        }
    });
    


});