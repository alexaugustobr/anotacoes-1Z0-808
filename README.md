
## Import ##

O pacote "java.lang" contém as classes básicas da linguagem e é importado por padrão.

## Operações Aritméticas ##
No mínimo devolvem um int.

Exemplos:

```
byte b1 = 5;
byte b2 = 3;
byte b3 = b1 + b2;
// Linha não compila pois b1 +  b2 devolve um int, e um int não cabe em um byte
```

## Tamanho de tipos primitivos ##

Comparação do menor para o maior:

```
byte -> short -> int -> long -> float -> double

char -> int
```


Exemplos válidos:
```
byte b = 1;
int i = 1;
long l = 1;
```

Exemplos inválidos:

```
float f = 1.0; //Não compila pois 1.0 é double, que é maior que float
```


## byte ##
Alcance de -128 a 127

Exemplos de declarações válidas:
```
byte a;
byte b = '1';
byte z = 111;
byte pato = 0xA;
byte seven = 07;
```


## Links: ##

www.javaranch.com/game/game2.jsp

theserverside.com

coderanch.com/how-to/java/OcajpFaq

java.dzone.com

www.kaplanittraining.com/certification/oracle/1z0-808?#222977

www.examsexpert.com/oracle-certifications.html

enthuware.com

education.oracle.com/certification-practice-exams

