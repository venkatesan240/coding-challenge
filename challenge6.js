// Function to sum a specific row in a 2D array
function sumRow(table, rowIndex) {
    if (rowIndex < 0 || rowIndex >= table.length) {
        throw new Error("Invalid row index");
    }
    return table[rowIndex].reduce((acc, num) => acc + num, 0);
}

// Function to sum a specific column in a 2D array
function sumColumn(table, colIndex) {
    if (colIndex < 0 || colIndex >= table[0].length) {
        throw new Error("Invalid column index");
    }
    return table.reduce((acc, row) => acc + row[colIndex], 0);
}

// Example table (2D array)
let table = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
];

// Sum of the first row
console.log(`Sum of row 0: ${sumRow(table, 0)}`); // Output: 6

// Sum of the second column
console.log(`Sum of column 1: ${sumColumn(table, 1)}`); // Output: 15
