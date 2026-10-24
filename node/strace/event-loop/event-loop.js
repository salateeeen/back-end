const fs = require('fs');

fs.readFile("./fs.txt", (err, data) => {
    console.log(data);
})

setTimeout(() => {
    console.log('Timeout executed after', 3000, 'milliseconds');
}, 3000);

console.log('End of the event loop example');