Algoritmo "converter horas minutos e segundos"
// Disciplina   : fundamentos de programa��o
// Professor   : Cris
// Descri��o   : ap�s a entrada de um valor em segundos deve-se converter em
//               horas, minutos e segundos
// Autor(a)    : Jose matheus oliveira cavalcante
// Data atual  : 09/11/2021
Var
   seconds, minutes, hour: real

Inicio
   escreval("Informe o valor em segundos: " )
   leia(seconds)

   hour <- seconds / 3600 //esse � o valor em segundos de uma hora
   minutes <- (seconds mod 3600) / 60 //revertendo a opera��o e convertendo em minutos
   seconds <- (seconds mod 3600) mod 60

   escreval(hour:1:1, " horas ", minutes:1:1, " minutos ", seconds:1:1, " segundos ")

Fimalgoritmo
