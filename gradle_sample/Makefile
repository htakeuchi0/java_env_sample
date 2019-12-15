GRADLE = gradle
BROWSER = firefox
TARGETDIR = build/
INDEXPATH = docs/javadoc/index.html

.PHONY: all clean build test docs

all: build

build:
	$(GRADLE) build
	$(GRADLE) run

test:
	$(GRADLE) test

clean:
	$(GRADLE) clean

docs:
	$(GRADLE) javadoc
	$(BROWSER) $(TARGETDIR)$(INDEXPATH) &
