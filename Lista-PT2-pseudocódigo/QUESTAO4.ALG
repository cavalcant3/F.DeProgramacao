Algoritmo "questao4"
// Disciplina   : fundamentos de programação
// Professor   : Cris
// Descrição   : calcular a quantidade de piso, tinta e ar condicionado a ser usado
//
// Autor(a)    : Jose matheus oliveira cavalcante
// Data atual  : 09/11/2021
Var
   comprimento, altura, largura, tinta, piso,areapiso, ar: real
   opcao: inteiro
Inicio

   escreval("informe,em metros, o comprimento: ")
   leia(comprimento)
   escreval("informe,em metros, a altura: ")
   leia(altura)
   escreval("informe,em metros, a largura: ")
   leia(largura)
   escreval("informe a area do piso que pretende usar: ")
   leia(areapiso)
   // para calcular a  tinta
   tinta <- (altura * largura * largura)/10 //considerando o rendimento da tinta de 10m²
   // para calcular a  tinta
   piso <- (comprimento * largura)/areapiso
   ar <- (comprimento * largura) * 750 //video usado para calcular a qtd. de BTU: www.youtube.com/watch?v=EJXHY5UzZ5s

   limpatela

   escreval("-----------------------------------------")
   escreval("|                                       |")
   escreval("|                                       |")
   escreval("|                                       |")
   escreval("|* Descobrir a qtd. de tinta: Digite: 1 |")
   escreval("|* Descobrir a qtd. de piso: Digite: 2  |")
   escreval("|* Melhor opção de ar-condicionado:     |")
   escreval("|             Digite: 3                 |")
   escreval("|       *ver todas as opções:           |")
   escreval("|           Digite: 4                   |")
   escreval("|                                       |")
   escreval("-----------------------------------------")
   leia(opcao)

   limpatela

   escolha(opcao)
   caso 1
      escreval ("A qtd. em litros de tinta a ser usada é: ", tinta)
      timer(3000)
   caso 2
      escreval ("A qtd. de piso a ser usado é: ", piso)
      timer(3000)
   caso 3
      escreval ("A melhor opção de ar-condicionado é o qual atenda a essa quantidade de BTU's: ", ar)
      timer(3000)
   caso 4
      escreval ("Qtd. em litros de tinta ", tinta, " litros ", " Qtd. Piso: ", piso, " pisos ", " A melhor opção de ar-condicionado é o qual atenda a essa quantidade de BTU's: ", ar)
      timer(3000)
   fimescolha





Fimalgoritmo
