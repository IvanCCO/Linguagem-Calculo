num1 <- readline("Digite um numero")
num2 <- readline("Digite outro numero")

if(is.na(as.numeric(num1)) || is.na(as.numeric(num2))){
  print("Você não digitou um número")
}else{
  
num1 <- as.numeric(num1)
num2 <- as.numeric(num2)
  if(num2 > num1){
    aux <- num2
  }else{
    aux <- num1 
  }
  print(aux)
}

