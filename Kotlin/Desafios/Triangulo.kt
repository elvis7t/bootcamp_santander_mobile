// Desafio
// Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:

// Perimetro = XX.X

// Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:

// Area = XX.X

// Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2

// Entrada
// A entrada contém três valores reais.

// Saída
// O resultado deve ser apresentado com uma casa decimal.

 
// Exemplo de Entrada	Exemplo de Saída
// 6.0 4.0 2.0

// Area = 10.0

// 6.0 4.0 2.1

// Perimetro = 12.1


// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main() {
    var a = 6.0
    var b = 4.0
    var c = 2.0
 
 //TODO: Complete os espaços em branco com uma possível solução para o desafio
  
   val perimetro = a+b+c   
   val area = ((a+b)*c)/2
   
   if ((a+b>c && a+c>b && b+c>a)){
       println(String.format("Perimetro = %.1f", perimetro))
   }else{
       println(String.format("Area = %.1f", area))
   } 
     
 }