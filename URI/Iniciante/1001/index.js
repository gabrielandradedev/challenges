const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

console.log(`X = ${parseInt(lines[0]) + parseInt(lines[1])}`);