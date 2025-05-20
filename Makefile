JAR=lib/mysql-connector-j-9.3.0.jar
SRC=src/Main.java
OUT=out

run:
	@mkdir -p $(OUT)
	javac -cp $(JAR) $(SRC) -d $(OUT)
	java -cp "$(OUT):$(JAR)" Main
