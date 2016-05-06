#comblie the java files froom ./src/java
javac -cp "./lib/jsoup.jar:" ./src/java/*
#move all clsss files form ./src/java to ./src/class
mv ./src/java/*.class ./src/class/
#Run all class files
cd src/class
java -cp "../../lib/jsoup.jar:" App News View Web
