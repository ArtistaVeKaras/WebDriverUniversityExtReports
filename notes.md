## TestNg .xml file
Is a configuration file used to provide test execution settings
such as:
* include test, class, packages etc
* exclude test, class package etc
* set test dependency
* set test priorities
* pass parameters to test methods
* run in parallel 

Used to control execution of TestNG tests

Right-click on a class and select Convert to Testng


********************************************************************************************************************
## Docker Notes
### Pull images from docker-hub
* docker pull selenium/node-chrome
* docker pull selenium/node-chrome-debug
* docker pull selenium/node-firefox
* docker pull selenium/node-firefox-debug
* docker images

## Run Grid Docker 
* docker-compose up -d
* docker ps -a //list all your containers 
* docker-compose restart //spins brand-new containers 
* docker-compose down //tear down the grid

## Git Notes
* git -l --local //logs all the local config
* git commit //open an editor to enter your commit message
* git commit -am //add the changes and commits the message
* git -ls -a //list all the branches in the remote
* git stash //Saves the working directory
* git stash list
* git reflog //Shows all the commits in the order which you have referenced them last on your branches in the local repo
* git checkout or gco -b <branch-name>
* git branch -d <branch-name>
* git commit --amend //amend the previous commit message
* git rebase -i HEAD~2 //squash the last two commits into one
* git --abort //aborts the current rebase

## Pip symbol 
|  