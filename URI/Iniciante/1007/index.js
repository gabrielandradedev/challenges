const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseInt(lines[0]);
const b = parseInt(lines[1]);
const c = parseInt(lines[2]);
const d = parseInt(lines[3]);

console.log(`DIFERENCA = ${(a * b) - (c * d)}`);