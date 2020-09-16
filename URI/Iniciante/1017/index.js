const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n').map(val => parseInt(val));

const distance = ((lines[0] * lines[1]) / 12).toFixed(3);

console.log(distance);