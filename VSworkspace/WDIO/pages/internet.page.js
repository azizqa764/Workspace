class InternetPage {
  get mainHeadingText() {
      return $('#content > h1');
  }
  get subHeadingText(){
      return $('#content > h2');
  }
  get inputsLink() {
      return $('#content > ul > li:nth-child(27) > a');
  }
}

module.exports = new InternetPage() 