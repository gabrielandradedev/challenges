const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const peca1 = lines[0].split(' ');
const peca2 = lines[1].split(' ');

const valor1 = parseInt(peca1[1]) * parseFloat(peca1[2]);
const valor2 = parseInt(peca2[1]) * parseFloat(peca2[2]);

console.log(`VALOR A PAGAR: R$ ${(valor1 + valor2).toFixed(2)}`);