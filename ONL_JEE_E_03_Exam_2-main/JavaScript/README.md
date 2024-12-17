## JavaScript - Task 1 (2.5 pts)

**Do not use the DOMContentLoaded event. The script is loaded into the html file before the end of the body.**

Write a function named biggestSumOfTwoElements(array) that takes an array of numbers and returns the sum of the two largest elements of that array.

For simplicity, you can assume that the passed array contains numbers only - no validation is needed.

If the array contains only one element, the function should return the value of that element.  
If the array contains zero elements, the function should return the logical value **false**.

**Example:**
```js
biggestSumOfTwoElements([1,2,3,4]) // => 7
biggestSumOfTwoElements([]) // => false
biggestSumOfTwoElements([76]) // => 76
biggestSumOfTwoElements([23,45,17,12]) // => 68
```

## JavaScript - Task 2 (3.5 pts)

**Do not use the DOMContentLoaded event. The script is loaded into the html file before the end of the body.**

- For each subsection, create a corresponding function with the name given in the task instruction.
- Each function should return an array filled with appropriate elements. (Remember that returning is different from displaying!)

Run the following commands:

1 - Search for tag names:
- find all elements with the class sample_class and save them in the variable **task1EL**,
- create a function named getTag(elements) to which you pass the found elements as an argument,
- create an array in this function and fill it with tag names. Get them from the elements passed as an argument,
- return the array.

2 - Search for class names:
- find the element with id sample_id and save it in the variable **task2EL**,
- create a function named getClass(element) to which you pass the found element as an argument,
- create an array in the function and fill it with class names. Get the classes from the element passed as an argument,
- return the array.

3 - Search for text:
- find all list elements found in the element with class sample_class_2 and save them in the variable **task3EL**,
- create a function named getInnerText(elements) to which you pass the found elements as an argument,
- create an array in the function and fill it with the texts taken from the elements passed as an argument,
- return the array.

4 - Search for link addresses:
- find all links and save them in the variable **task4EL**,
- create a function named getAddress(elements) to which you pass the found elements as an argument,
- create an array in the function and fill it with addresses (if the link has an address) taken from the elements passed as an argument,
- return the array.

5 - Search for child tags:
- find all the children of an element with class sample_class_3 and save them in the variable **task5EL**,
- pass the found children as an argument to the function that searches for element tags.


## JavaScript - task 3 (4 points)

Use the address [https://fer-api.coderslab.pl/v1/be-exam/movies](https://fer-api.coderslab.pl/v1/be-exam/movies) to load information about movies on the page.

Add subsequent movies to a list.  
Load film titles into h2 elements and year of production into h3 elements.

Create these elements and insert them into the DOM.

Notice that the data loaded from this address is in the form of an array.
Use a loop to load all the movies.

**Hint:**
See in the console what the object you get as a response looks like before you insert the content into the page.

