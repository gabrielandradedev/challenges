const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const line = parseInt(input);

console.log(`${line * 2} minutos`);