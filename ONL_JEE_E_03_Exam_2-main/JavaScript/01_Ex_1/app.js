function biggestSumOfTwoElements(array) {

  if (array.length === 0) {
    return false;
  }

  if (array.length === 1) {
    return array[0];
  }

  array.sort((a, b) => b - a);

  return array[0] + array[1];
}