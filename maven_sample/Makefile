MAVEN = mvn
JAVA = java
JAVAFLAGS = -jar
TARGETDIR = target/
SRCS = maven_sample
VERSION = 1.0
WITH_DEPENDENCIES = -jar-with-dependencies
BROWSER = firefox
INDEXPATH = site/apidocs/index.html

.PHONY: all package clean test docs

all: package

package:
	$(MAVEN) package
	$(JAVA) $(JAVAFLAGS) $(TARGETDIR)$(SRCS)-$(VERSION)$(WITH_DEPENDENCIES).jar

test:
	$(MAVEN) test

clean:
	$(MAVEN) clean

docs:
	$(MAVEN) javadoc:javadoc
	$(BROWSER) $(TARGETDIR)$(INDEXPATH) &

