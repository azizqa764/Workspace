class TodoPage{
    
    get title() {
        return $('body > section > div > header > h1');
    }
    get todoField() {
        return $('body > section > div > header > input');
    }
    
    get todoItem1() {
        return $('body > section > div > section > ul > li > div > label');
    }

   // body > section > div > section > ul > li:nth-child(1) > div > label
    //body > section > div > section > ul > li:nth-child(2) > div > label

    //row no starts with 1
     /**
      * 
      * @param number
      *  rows start 1 
      */

    todoItemByRow(row) {
        return $(`body > section > div > section > ul > li:nth-child(${row}) > div > label`)
    }

    get deleteItem1() {
        return $('body > section > div > section > ul > li > div > button');
    }

    createTodo(val){
        this.todoField.setValue(val);
        browser.pause('Enter');
    }

    get todoItems() {
        return $$('body > section > div > section > ul > li > div > label');
    }




}
module.exports = new TodoPage();