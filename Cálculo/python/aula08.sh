#!/bin/bash 
echo 'Qual o nome do diretório que você deseja?' 
read nomeDir
mkdir $nomeDir
echo 'Entrando no diretório'
cd $nomeDir
pwd
echo 'Quantos arquivos deseja criar?'
read max
echo 'O que deseja escrever nos arquivos?'
read texto
for i in `seq 1 $max`
do
sleep 1
touch file$i.txt
echo $texto  >> file$i.txt
done


echo 'Arquivos criados parabéns'

echo 'Agora será criado um arquico com os comandos utilizados na sua maquina'

echo 'Digite o nome do arquivo de todos os comandos utilizados'
read user
cat /home/aluno/.bash_history >> $user.txt
echo 'Script feito'
