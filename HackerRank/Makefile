CXX = g++
CPPFLAGS = -Wall -g -std=c++11 -Wconversion -Wextra
PYTHON = python3

BIN = bin/

all:

%: %.cpp
	$(CXX) $(CPPFLAGS) $< -o $(BIN)$@
	./$(BIN)$@

%: %.py
	$(PYTHON) $<

.PHONY: clean
clean:
	rm -rf $(BIN)*