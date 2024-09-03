
function kilometersToMiles(kilometers) {
    const milesPerKilometer = 0.621371;
    return kilometers * milesPerKilometer;
}

// Example usage
let distanceInKilometers = 10; // Input distance in kilometers

let distanceInMiles = kilometersToMiles(distanceInKilometers);
console.log(`${distanceInKilometers} kilometers is equal to ${distanceInMiles.toFixed(2)} miles`);

