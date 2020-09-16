const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseInt(lines[0]);
const b = parseFloat(lines[1]);

console.log(`${(a / b).toFixed(3)} km/l`);
