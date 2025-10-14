#!/usr/bin/env bash
# usage: ./run_java.sh path/to/Solution.java
# compiles and runs a single-file Java solution in the same folder

JAVA_FILE="$1"
DIR=$(dirname "$JAVA_FILE")
BASE=$(basename "$JAVA_FILE" .java)

pushd "$DIR" > /dev/null || exit
javac "$BASE.java"
if [ $? -eq 0 ]; then
  java "$BASE"
else
  echo "Compilation failed"
fi
popd > /dev/null || exit
