# Projeto Final - Compiladores

## Grupo
Bianca Hidemi Kanehira - 11201811183

## Checklist

|      ITEM          |FEITO                          |
|----------------|-------------------------------|
|Possui 2 tipos de variáveis |`SIM`            |     
|Possui a estrutura If.. else |`SIM`            |
|Possui estrutura de controle while/do while |`SIM`  |
|Operações Aritméticas executadas corretamente |`SIM`  |
|Atribuições realizadas corretamente |`SIM`  |
|Possui operações de Entrada e Saída |`SIM`  |
|Aceita números decimais |`SIM`  |
|Verificar se a variável já foi previamente declarada |`SIM`  |
|Verificar se a variável foi declarada e não foi usada |`NÃO`  |
|Verificar se uma variável está sendo usada sem ter valor inicial |`SIM`  |

## Youtube

https://youtu.be/vVJX1JvhHB0

## Para rodar o projeto

Na raiz do projeto rode o seguinte comando no terminal:

curl -O https://www.antlr.org/download/antlr-4.13.0-complete.jar

No Eclipse configurar o build path com a biblioteca no class path:
Build path -> Configure Build Path -> Libraries -> Class Path -> Add Jars -> Adicionar o arquivo antlr-4.13.0-complete.jar

Ainda na raiz do projeto é necessário rodar o seguinte comando no terminal (toda vez que há mudança na gramática):

java -cp .:antlr-4.13.0-complete.jar org.antlr.v4.Tool TypeExpression.g4 -o ./src/parser/ -package parser

