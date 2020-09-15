const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const salary = parseFloat(lines[1]);
const comission = parseFloat(lines[2]) * 0.15;

console.log(`TOTAL = R$ ${(salary + comission).toFixed(2)}`);