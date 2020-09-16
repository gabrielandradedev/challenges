const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const line = input.split(' ');

const a = parseInt(line[0]);
const b = parseInt(line[1]);
const c = parseInt(line[2]);

let maior;

maior = Math.max(a, b);
maior = Math.max(maior, c);

console.log(`${maior} eh o maior`);