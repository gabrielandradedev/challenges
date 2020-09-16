const file = require('fs').readFileSync('/dev/stdin', 'utf8');
const input = parseInt(file);

const notas = [100, 50, 20, 10, 5, 2, 1];

let output = `${input}\n`;
let rest = input;
notas.forEach((nota, index) => {
  const ammount = Math.floor(rest / nota);
  rest -= ammount * nota;
  output += `${ammount} nota(s) de R$ ${nota},00${index !== (notas.length - 1) ? '\n' : ''}`;
});

console.log(output);