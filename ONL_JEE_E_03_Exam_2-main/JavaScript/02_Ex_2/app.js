var task1EL = document.getElementsByClassName('sample_class');
function getTag(elements) {
    var tagsArray = [];
    for (var i = 0; i < elements.length; i++) {
        tagsArray.push(elements[i].tagName);
    }
    return tagsArray;
}
console.log(getTag(task1EL));

var task2EL = document.getElementById('sample_id');
function getClass(element) {
    return element.classList ? Array.from(element.classList) : [];
}
console.log(getClass(task2EL));

var task3EL = document.querySelectorAll('.sample_class_2 li');
function getInnerText(elements) {
    var textArray = [];
    for (var i = 0; i < elements.length; i++) {
        textArray.push(elements[i].innerText);
    }
    return textArray;
}
console.log(getInnerText(task3EL));

var task4EL = document.getElementsByTagName('a');
function getAddress(elements) {
    var addressArray = [];
    for (var i = 0; i < elements.length; i++) {
        if (elements[i].href) {
            addressArray.push(elements[i].href);
        }
    }
    return addressArray;
}
console.log(getAddress(task4EL));

var task5EL = document.getElementsByClassName('sample_class_3')[0].children;
function biggestSumOfTwoElements(elements) {
    var tagsArray = [];
    for (var i = 0; i < elements.length; i++) {
        tagsArray.push(elements[i].tagName);
    }
    return tagsArray;
}

console.log(biggestSumOfTwoElements(task5EL));