JFLAGS = -g
JC = javac
JVM= java
FILE=
.SUFFIXES: .java .class
%.class: %.java
    $(JC) $(JFLAGS) $^
CLASSES = \
        Grupo.java \
        Jogador.java \
        Jogo.java \
        PrimeiraFase.java \
        SegundaFase.java \
        Tabela.java \
        Time.java \
        Principal.java 

run: classes
    $(JVM) $(MAIN)
    
default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class