const file = require('fs').readFileSync('/dev/stdin', 'utf8');
const input = parseInt(file);

let rest = input;
let years = 0;
let months = 0;
let days = 0;

years = Math.floor(input / 365);
rest -= years * 365;

months = Math.floor(rest / 30);
rest -= months * 30;

days = rest;

console.log(`${years} ano(s)
${months} mes(es)
${days} dia(s)`);