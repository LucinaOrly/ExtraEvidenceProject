run: all
	java MainLoopDemo
all: MainLoopDemo.java
	javac MainLoopDemo.java
clean:
	rm *.class
