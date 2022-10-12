teste <- ArquivoTratadoCSV$SubjectData
arquivoTotal <- ArquivoTratadoCSV


numInicial <- readline(prompt = "Qual o número Inicial? ")

numFinal <- readline(prompt = "Qual o número final? ")

count <- 0

id = c()
link = c()
status = c()
nome = c()


for(i in 1:length(teste)){
  
  splitado <- strsplit(teste, ":")
  aux <- splitado[[i]]
  splitado <- strsplit(aux[2], "-")
  splitado <- splitado[[1]]
  
  if(as.numeric(splitado[1]) == "try-error") next;
  
  splitadoNumerico <- as.numeric(splitado[1])
  
  if(splitadoNumerico >= numInicial && splitadoNumerico <= numFinal){
        
    id[count + 1] = arquivoTotal$Subject.ID[i]
    nomeSimples = strsplit(arquivoTotal$SubjectData[i], ",")
    nomeSimples = nomeSimples[[1]]
    nomeSimples = nomeSimples[1]
    status[count + 1] = arquivoTotal$Current.Status[i]
    nome[count + 1] = nomeSimples
    link[count + 1] = splitadoNumerico
    count = count + 1
    
  }
  
}
  

visualizador <- data.frame(id = id,
                           link = link,
                           status = status,
                           nome = nome)
numFinal <- as.numeric(numFinal)
numInicial <- as.numeric(numInicial)
diferenca <- numFinal - numInicial
diferenca = diferenca + 1
resto <- diferenca - count
frase1 <- "A quantidade de entrevistas lidas é: "
frase2 <- "Foram feitas apenas: "
frase3 <- "A quantidade de Pesquisas que faltam é: "
print(paste(frase1, diferenca, sep = ""))
print(paste(frase2, count, sep = ""))
print(paste(frase3, resto, sep = ""))
length(visualizador)
View(visualizador)
rm(visualizador)






