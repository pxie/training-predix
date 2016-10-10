## Script to deploy locomotive-seed 
sudo npm cache clean -f  ‹updating node here
sudo npm install -g n
sudo n stable
sudo npm install -g npm@3.8.3        ‹updating to npm 3
## make sure npm-shrinkwrap.json in current directory
npm install
bower install
grunt dist --force
