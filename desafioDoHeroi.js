//desafio javascript

/*
## Objetivo

Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói, depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:

Se XP for menor do que 1.000 = Ferro
Se XP for entre 1.001 e 2.000 = Bronze
Se XP for entre 2.001 e 5.000 = Prata
Se XP for entre 5.001 e 7.000 = Ouro
Se XP for entre 7.001 e 8.000 = Platina
Se XP for entre 8.001 e 9.000 = Ascendente
Se XP for entre 9.001 e 10.000= Imortal
Se XP for maior ou igual a 10.001 = Radiante

## Saída

Ao final deve se exibir uma mensagem:
"O Herói de nome **{nome}** está no nível de **{nivel}**"

*/

let name = prompt("Informe seu nome.");
let nivel_xp = prompt("Qual seu nivel, digite somente numéros");

if(nivel_xp <= 1000){
    console.log(`Usuário: ${name}, esta no nivel: ${nivel_xp} XP.`);

}ifelse (nivel_xp >= 1001 && nivel_xp <= 2000){
    console.log(`Usuário: ${name}, esta no nivel: ${nivel_xp} XP.`);

}ifelse (nivel_xp >= 2001 && nivel_xp <= 5000){
    console.log(`Usuário: ${name}, esta no nivel: ${nivel_xp} XP.`);

}ifelse(nivel_xp >= 5001 && nivel_xp <= 7000){
    console.log(`Usuário: ${name}, esta no nivel: ${nivel_xp} XP.`);

}ifelse(nivel_xp >= 7001 && nivel_xp <= 8000){
    console.log(`Usuário: ${name}, esta no nivel: ${nivel_xp} XP.`);

}ifelse(nivel_xp >= 8001 && nivel_xp <= 9000){

}ifelse(nivel_xp >= 9001 && nivel_xp <= 10000){

console.log("");

}else(nivel_xp > 10000){

}


