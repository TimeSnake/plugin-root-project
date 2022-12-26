#!/bin/bash

# This script clones all modules listet in modules.txt from https://git.timesnake.de/
# It is recommended to use ssh-keys

modules=()

input="modules.txt"

while IFS= read -r line
do
  modules+=("$line")
done < "$input"

echo -ne "Setup ssh-key? [y/n]: "
read -rn 1 ssh
echo ""

if [[ ${ssh} == "y" ]]
then
  ssh key-gen
  read -n 1 -r -p "Add your ssh-key to your git account(s) and press enter [enter]"
fi


for repo in "${modules[@]}"
do

echo -n "Cloning $repo ... "
git clone "git@git.timesnake.de:timesnake/$repo.git" &> /dev/null
echo -e "\e[32m Done\e[0m"

done



