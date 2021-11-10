Algoritmo "converter horas minutos e segundos"
// Disciplina   : fundamentos de programação
// Professor   : Cris
// Descrição   : após a entrada de um valor em segundos deve-se converter em
//               horas, minutos e segundos
// Autor(a)    : Jose matheus oliveira cavalcante
// Data atual  : 09/11/2021
Var
   seconds, minutes, hour: real

Inicio
   escreval("Informe o valor em segundos: " )
   leia(seconds)

   hour <- seconds / 3600 //esse é o valor em segundos de uma hora
   minutes <- (seconds mod 3600) / 60 //revertendo a operação e convertendo em minutos
   seconds <- (seconds mod 3600) mod 60

   escreval(hour:1:1, " horas ", minutes:1:1, " minutos ", seconds:1:1, " segundos ")

Fimalgoritmo
