Algoritmo "campe�es"
// Disciplina   : fundamentos de programa��o
// Professor   : Cris
// Descri��o   : ap�s a entrada de um valor em segundos deve-se converter em
//               horas, minutos e segundos
// Autor(a)    : Jose matheus oliveira cavalcante
// Data atual  : 09/11/2021
Var
   premio,premio1,premio2,premio3: real
   vencedor: inteiro

Inicio
   premio <- 520.000
   premio1<-premio * 0.45
   premio2<-premio * 0.30
   premio3<-premio * 0.25


   escreval("---------------------------")
   escreval("| Receba seu pr�mio aqui! |")
   escreval("|                                          |")
   escreval("|                                          |")
   escreval("| 1� vencedor: Digite: 1  |")
   escreval("| 2� vencedor: Digite: 2  |")
   escreval("| 3� vencedor: Digite: 3  |")
   escreval("|    ver todas as op��es: |")
   escreval("|        Digite: 4               |")
   escreval("|                                     |")
   escreval("---------------------------")
   leia(vencedor)

   limpatela

   escolha(vencedor)
   caso 1
      escreval ("O valor do seu pr�mio �: ", premio1:3:3)
      timer(3000)
   caso 2
      escreval ("O valor do seu pr�mio �: ", premio2:3:3)
      timer(3000)
   caso 3
      escreval ("O valor do seu pr�mio �: ", premio3:3:3)
      timer(3000)
   caso 4
      escreval ("O valor dos pr�mios �: ", premio1:3:3, " para o primeiro lugar ", premio2:3:3, " para o segundo lugar ", premio3:3:3, " para o terceiro lugar ")
      timer(3000)
   fimescolha
Fimalgoritmo
