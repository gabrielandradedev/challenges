const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseFloat(lines[0]) * 2 / 10;
const b = parseFloat(lines[1]) * 3 / 10;
const c = parseFloat(lines[2]) * 5 / 10;

const media = (a + b + c).toFixed(1);

console.log(`MEDIA = ${media}`);