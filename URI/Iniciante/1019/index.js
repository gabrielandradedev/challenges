const file = require('fs').readFileSync('/dev/stdin', 'utf8');
const input = parseInt(file);

let rest = input;
let hours = 0;
let minutes = 0;
let seconds = 0;

hours = Math.floor(input / 3600);
rest -= hours * 3600;

minutes = Math.floor(rest / 60);
rest -= minutes * 60;

seconds = rest;

console.log(`${hours}:${minutes}:${seconds}`);