const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split(' ');

const pi = 3.14159;
const a = parseFloat(lines[0]);
const b = parseFloat(lines[1]);
const c = parseFloat(lines[2]);

const triangle = ((a * c) / 2).toFixed(3);
const circle = (pi * c * c).toFixed(3);
const trapeze = (((a + b) * c) / 2).toFixed(3);
const square = (b * b).toFixed(3);
const retangle = (a * b).toFixed(3);

console.log(`TRIANGULO: ${triangle}
CIRCULO: ${circle}
TRAPEZIO: ${trapeze}
QUADRADO: ${square}
RETANGULO: ${retangle}`);