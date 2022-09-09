#!/bin/bash
##removes if already installed
sudo systemctl daemon-reload
sudo systemctl stop java-springboot-mysql
##if configs already exist back them up to ~/.java-springboot-mysql
mkdir ~/.java-springboot-mysql
cp /usr/share/java-springboot-mysql/java-springboot-mysql.config ~/.java-springboot-mysql/
##removing
sudo pacman -R java-springboot-mysql-package --noconfirm # set in PKGBUILD
##reinstalling
rm -rf ~/java-springboot-mysql/
cd ~
git clone https://github.com/helloimalemur/java-springboot-mysql
cd ~/java-springboot-mysql/
./gradlew build
cd ~/java-springboot-mysql/src/main/java/
makepkg -si --noconfirm
sudo systemctl stop java-springboot-mysql
##if configs had already exist they should be in home dir already
cd ~
sudo cp ~/.java-springboot-mysql/* /usr/share/java-springboot-mysql/
sudo chmod 755 /usr/share/java-springboot-mysql/*
sudo systemctl daemon-reload
sudo systemctl start java-springboot-mysql
sudo systemctl status java-springboot-mysql

