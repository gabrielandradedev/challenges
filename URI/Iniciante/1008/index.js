const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const number = parseInt(lines[0]);
const time = parseInt(lines[1]);
const value = parseFloat(lines[2]);
const salary = (time * value).toFixed(2);

console.log(`NUMBER = ${number}
SALARY = U$ ${salary}`);