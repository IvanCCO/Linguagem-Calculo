tamanho <- 20000
set.seed(1234)
altura <- abs(round(rnorm(n, 1.50, 0.1), 2))
peso <- abs(round(rnorm(n, 55, 4), 2))
idade <- abs(round(rnorm(n, 35, 7),0))
imc <- round(peso/altura^2, 2)
pop.sexo <- rep(c("F","M"), n)
par( mfrow= c(2,2) )
hist(idade, main="Idades")
hist(altura, main="alturas")
hist(peso, main="Peso")
hist(imc, main="IMC")

