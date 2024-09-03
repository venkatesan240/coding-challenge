// Function to reverse an array
function reverseArray(arr) {
    let reversedArray = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        reversedArray.push(arr[i]);
    }
    return reversedArray;
}

// Test with an array of 5 numbers
let smallArray = [1, 2, 3, 4, 5];
console.log(`Original array: ${smallArray}`);
console.log(`Reversed array: ${reverseArray(smallArray)}`);

// Test with a larger array
let largeArray = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100];
console.log(`Original array: ${largeArray}`);
console.log(`Reversed array: ${reverseArray(largeArray)}`);
