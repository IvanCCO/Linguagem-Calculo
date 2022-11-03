teste <- ArquivoTratadoCSV$SubjectData
arquivoTotal <- ArquivoTratadoCSV


numInicial <- readline(prompt = "Qual o número Inicial? ")

NumFinal <- readline(prompt = "Qual o número final? ")

count <- 0

id = c()
status = c()
nome = c()

for(i in 1:length(teste)){
  
  splitado <- strsplit(teste, ":")
  aux <- splitado[[i]]
  splitado <- strsplit(aux[2], "-")
  splitado <- splitado[[1]]
  splitadoNumerico <- as.numeric(splitado[1])

  
  if(splitadoNumerico >= numInicial && splitadoNumerico <= NumFinal){
        
    id[count + 1] = arquivoTotal$Subject.ID[i]
    nomeSimples = strsplit(arquivoTotal$SubjectData[i], ",")
    nomeSimples = nomeSimples[[1]]
    nomeSimples = nomeSimples[1]
    
    status[count + 1] = arquivoTotal$Current.Status[i]
    nome[count + 1] = nomeSimples
    count = count + 1
    
  }
  
}

visualizador <- data.frame(id = id,
                           status = status,
                           nome = nome)


View(visualizador)