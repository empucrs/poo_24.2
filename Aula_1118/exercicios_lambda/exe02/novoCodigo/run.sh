javac ../codigoBase/*.java *.java -d ../bin
javac *.java -cp ../bin/. -d ../bin/.
java -cp ../bin/. App
