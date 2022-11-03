library(stringr)
teste <- ArquivoTratadoCSV$V9
arquivoTotal <- ArquivoTratadoCSV


numInicial <- readline(prompt = "Qual o número Inicial? ")

numFinal <- readline(prompt = "Qual o número final? ")

numInicial <- as.numeric(numInicial)
numFinal <- as.numeric(numFinal)
count <- 0
pos <- 1
id = c()
link = c()
status = c()
nome = c()




s1 <- "QUEST"
s2 <- "Marcas-QUEST"

for (k in 1:573){
  splitado <- strsplit(teste, ":")
  x <- splitado[k][1]
  x <- x[[1]]
  num <- x[2]
  x <- x[1]
  print(str_detect(s2,x))
 
  
  if(str_detect(s2,x)){
    next
  }else{
    print("Deu bom")
  }
  
  
  splitado <- strsplit(num, "-")
  numSplitado <- splitado[[1]][1]

  
  if(is.na(as.numeric(numSplitado))){
    next
  }
  
  splitadoNumerico <- as.numeric(numSplitado)
  
  print(splitadoNumerico >= numInicial && splitadoNumerico <= numFinal)
  print(splitadoNumerico)
  
  if(splitadoNumerico >= numInicial && splitadoNumerico <= numFinal){
    
    id[count + 1] = arquivoTotal$Subject.ID[k]
    nomeSimples = strsplit(arquivoTotal$SubjectData[k], ",")
    nomeSimples = nomeSimples[[1]]
    nomeSimples = nomeSimples[1]
    status[count + 1] = arquivoTotal$Current.Status[k]
    nome[count + 1] = nomeSimples
    link[count + 1] = splitadoNumerico
    count = count + 1
    print("Entrou no if")
    
  }
  
  
  pos <- pos + 1

  
  }

  
visualizador <- data.frame(id = id,
                           link = link,
                           status = status,
                           nome = nome)

View(visualizador)
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
length(visualizador$id)

rm(visualizador)







