const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const raio = parseInt(lines[0]);
const pi = 3.14159;

console.log(`VOLUME = ${((4/3) * pi * Math.pow(raio, 3)).toFixed(3)}`);