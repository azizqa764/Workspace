class ElementStatusPage {
    get displayElementButton() {
        return $('#displayButton');
    }
    get hiddenText(){
        return $('#hidden');
    }
    get createButton() {
        return $('#createButton');
    }
    get newText() {
        return $('#new');
    }
    get clickMeButton() {
        return $('#clickButton1');
    }
    get clickMeTooButton() {
        return $('#clickButton2');
    }
    get clickableText() {
        return $('#hidden2');
    }
    get inputField(){
        return $('#username');
    }
    get enableButton(){
        return $('#enableButton');
    }
    get changeText() {
        return $('#changeMe');
    }
    get changeButton() {
        return $('#changeButton');
    }
}

module.exports = new ElementStatusPage();