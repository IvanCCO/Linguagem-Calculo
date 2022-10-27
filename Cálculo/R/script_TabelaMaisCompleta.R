library(stringr)
library("writexl")
teste <- ArquivoTratadoCSV1$Srvyr
filtroEmp <- ArquivoTratadoCSV1$EMPRESA
arquivoTotal <- ArquivoTratadoCSV1


pos <- 1
count <- 1

link = c()
status = c()
tanaLabel = c()
nome = c()
produto = c()
empresa = c()
classeSocial = c()


filtroEmpresa = function(){

for (l in filtroEmp){
  
  if(l == 4){
    
    link[count] = arquivoTotal$QUEST[pos]
    tanaLabel[count] = arquivoTotal$Srvyr[pos]
    status[count] = arquivoTotal$Status[pos]
    nomeSimples = strsplit(arquivoTotal$SubjData[pos], ",")
    nomeSimples = nomeSimples[[1]]
    nomeSimples = nomeSimples[1]
    nome[count] = nomeSimples
    produto[count] = arquivoTotal$MARCAS_COTA[pos]
    classeSocial[count] = arquivoTotal$CLASSE[pos]
    empresa[count] = arquivoTotal$EMPRESA[pos]
    count = count + 1  
  }
  pos = pos + 1
}
  
  visualizador <- data.frame(link = link,
                             tanaLabel = tanaLabel,
                             status = status,
                             nome = nome,
                             produto = produto,
                             classeSocial = classeSocial,
                             empresa = empresa)

  visualizador$produto[visualizador$produto == 1] <- "Comfort Cuidado Intensivo - Concentrado"
  visualizador$produto[visualizador$produto == 2] <- "Downy Brisa de Verão"
  visualizador$produto[visualizador$produto == 3] <- "Fofo tradicional - Concentrado"
  visualizador$produto[visualizador$produto == 4] <- "Ype Azul - Concentrado"
  visualizador$produto[visualizador$produto == 5] <- "BabySoft ou Mon bijo - Concentrado"
  visualizador$produto[visualizador$produto == 6] <- "Ype Aconchego Diluido"
  visualizador$produto[visualizador$produto == 7] <- "Baby soft Azul - Diluido"
  visualizador$produto[visualizador$produto == 8] <- "Mon Bijou Azul - Diluido"  
  
  View(visualizador)

}




 
  tana <- "tana.job11.van.1"
  
  
  for (k in teste){
    
    if(k == tana){
      
      link[count] = arquivoTotal$QUEST[pos]
      tanaLabel[count] = arquivoTotal$Srvyr[pos]
      status[count] = arquivoTotal$Status[pos]
      nomeSimples = strsplit(arquivoTotal$SubjData[pos], ",")
      nomeSimples = nomeSimples[[1]]
      nomeSimples = nomeSimples[1]
      nome[count] = nomeSimples
      produto[count] = arquivoTotal$MARCAS_COTA[pos]
      classeSocial[count] = arquivoTotal$CLASSE[pos]
      empresa[count] = arquivoTotal$EMPRESA[pos]
      count = count + 1  
    }
    pos = pos + 1
  }
  
  
  visualizador <- data.frame(link = link,
                             tanaLabel = tanaLabel,
                             status = status,
                             nome = nome,
                             produto = produto,
                             classeSocial = classeSocial,
                             empresa = empresa)
  
  visualizador$produto[visualizador$produto == 1] <- "Comfort Cuidado Intensivo - Concentrado"
  visualizador$produto[visualizador$produto == 2] <- "Downy Brisa de Verão"
  visualizador$produto[visualizador$produto == 3] <- "Fofo tradicional - Concentrado"
  visualizador$produto[visualizador$produto == 4] <- "Ype Azul - Concentrado"
  visualizador$produto[visualizador$produto == 5] <- "BabySoft ou Mon bijo - Concentrado"
  visualizador$produto[visualizador$produto == 6] <- "Ype Aconchego Diluido"
  visualizador$produto[visualizador$produto == 7] <- "Baby soft Azul - Diluido"
  visualizador$produto[visualizador$produto == 8] <- "Mon Bijou Azul - Diluido"
  
  View(visualizador)
  

  
  write_xlsx(visualizador, "C:\\Users\\ivanm\\OneDrive\\Documentos\\arquivosVanaci\\tana3NovoX.xlsx")
  




numInicial <- readline(prompt = "1 - Total ; 2 - Tana?")
num <- as.numeric(numInicial)

if(num == 1){
  filtroEmpresa()
}else if(num == 2){
  valor <- readline(prompt = "Qual tana deseja?")
  valor <- as.numeric(valor)
}


rm(visualizador)
View(visualizador)



