// Function to sum the elements in an array
function sumArray(numbers) {
    return numbers.reduce((acc, num) => acc + num, 0);
}

// Test with different arrays
let array1 = [1, -2, 3, -4, 5]; // Mixed positive and negative
let array2 = [1.5, 2.5, 3.5, 4.5]; // Decimals
let array3 = [10, 20, 30]; // Positive integers
let array4 = [-1.1, -2.2, -3.3]; // Negative decimals

console.log(`Sum of array1: ${sumArray(array1)}`); // Output: 3
console.log(`Sum of array2: ${sumArray(array2)}`); // Output: 12
console.log(`Sum of array3: ${sumArray(array3)}`); // Output: 60
console.log(`Sum of array4: ${sumArray(array4)}`); // Output: -6.6
