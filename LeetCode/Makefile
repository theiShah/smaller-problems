CXX = g++
CPPFLAGS = -Wall -g -std=c++11 -Wconversion -Wextra

BIN = bin/

all: 

%: %.cpp
	$(CXX) $(CPPFLAGS) $< -c -o $(BIN)$@

.PHONY: clean
clean:
	rm -rf $(BIN)*