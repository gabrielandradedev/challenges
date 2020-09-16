const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const p1 = lines[0].split(' ').map(val => parseFloat(val));
const p2 = lines[1].split(' ').map(val => parseFloat(val));

const distance = Math.sqrt(Math.pow((p2[0] - p1[0]), 2) + Math.pow((p2[1] - p1[1]), 2));

console.log(distance.toFixed(4));