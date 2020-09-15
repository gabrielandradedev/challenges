const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

console.log(`PROD = ${parseInt(lines[0]) * parseInt(lines[1])}`);