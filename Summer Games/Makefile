clean:
	rm *.class

HelloWorld.class:
	javac -cp lwjgl/lwjgl.jar:. HelloWorld.java

run: HelloWorld.class
	java -cp lwjgl/lwjgl.jar:. -Djava.library.path="lwjgl/native" -XstartOnFirstThread HelloWorld
