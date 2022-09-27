set.seed(20)
notas <- data.frame(Matricula = sample(x = 011475:012990, size = 30, replace = FALSE),
                    ac1 = sample(x = 1:10, size = 30, replace = TRUE),
                    ac2 = sample(x = 1:10, size = 30, replace = TRUE),
                    prova_final= sample(x = 1:10, size = 30, replace = TRUE))

media <- (notas$ac1 * 0.4) + (notas$ac2 * 0.4) + (notas$prova_final * 0.2)
notas$media <- media

hist(notas$media, main="Medias Gerais")
hist(subset(notas$media, media < 7), main="Média dos alunos reprovados")
hist(subset(notas$media, media >= 7), main="Média dos alunos aprovados")
