set.seed(36)
dados <- data.frame(Nome = c("Ana", "Maria", "Henrique", "Paula", "Felipe",
                             "Carlos", "Cristiane"), Altura = sample(x = (150:190), size = 7, replace = TRUE)/100,
                    Peso = sample(x = 48:100, size = 7, replace = TRUE))

imc <- dados$Peso / (dados$Altura ^ 2)

dados$imc <- imc
print(dados$imc[1])
for(i in 1:7){
  
  if(dados$imc[i] < 25.0){
    dados$recomendacao[i] <- "Dieta"
  }else{
    dados$recomendacao[i] <- "Suplementacao"
  }
}
print(dados)
