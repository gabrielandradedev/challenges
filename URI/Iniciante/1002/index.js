const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');


const raio = lines[0];
const pi = 3.14159;

const area = pi * raio * raio;

console.log(`A=${area.toFixed(4)}`);