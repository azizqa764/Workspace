if(inputField.value === "1") {
    console.value("the value is 1")
} else {
    console.log(`The value is ${inputField.value}`)
}


//Link Stuff
var links = document.querySelectorAll("#content > ul > li > a");
var linkTexts;

for(let i =0; i <links.length;i++) {

    linkTexts.push(links[i.innerHTML])
    //console.log(`this is the ${links[i].innerHTML} links `)
}