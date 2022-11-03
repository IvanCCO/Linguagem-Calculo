PopDados <- `15b..loan_data_set`

PopBandeirantes <- data.frame(Graducao = PopDados$Education,
                              Dependentes = PopDados$Dependents,
                              Zona = PopDados$Property_Area)


PopBandeirantes$Graducao[PopBandeirantes$Zona == ""] = NA

PopBandeirantes$Dependentes[PopBandeirantes$Dependentes == "3+"] = sort(sample(3:5,1))
PopBandeirantes$Dependentes[PopBandeirantes$Dependentes == "0"] = sort(sample(0:1,1))
PopBandeirantes$Dependentes = as.numeric(PopBandeirantes$Dependentes)

PopBandeirantes = na.omit(PopBandeirantes)

n = 150
amostra1 = data.frame(Graducao = sample(PopBandeirantes$Graducao, n),
                      Dependentes = sample(PopBandeirantes$Dependentes, n),
                      Zona = sample(PopBandeirantes$Zona, n)
)

amostra2 = data.frame(Graducao = sample(PopBandeirantes$Graducao, n),
                      Dependentes = sample(PopBandeirantes$Dependentes, n),
                      Zona = sample(PopBandeirantes$Zona, n)
)

amostra3 = data.frame(Graducao = sample(PopBandeirantes$Graducao, n),
                      Dependentes = sample(PopBandeirantes$Dependentes, n),
                      Zona = sample(PopBandeirantes$Zona, n)
)

amostra4 = data.frame(Graducao = sample(PopBandeirantes$Graducao, n),
                      Dependentes = sample(PopBandeirantes$Dependentes, n),
                      Zona = sample(PopBandeirantes$Zona, n)
)


ggplot(amostra2, aes(x = Zona, y = Dependentes, fill = Graducao)) + 
        geom_bar(stat = "identity", position = "dodge") +
          labs(title = "Relação de Dependentes por espaço Geográfico e Graduação",
               subtitle = "Como a quantidade de Dependentes difere por região?")
D

