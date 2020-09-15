const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseFloat(lines[0]) * 3.5 / 11;
const b = parseFloat(lines[1]) * 7.5 / 11;

const media = (a + b).toFixed(5);

console.log(`MEDIA = ${media}`);