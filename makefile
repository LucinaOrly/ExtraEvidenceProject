all: MainLoopDemo.java
	javac MainLoopDemo.java
run: all
	java MainLoopDemo
clean:
	rm *.class
