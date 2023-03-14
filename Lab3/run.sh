#!/usr/bin/env bash

MAJOR_HOME="./major/"

echo
echo "Compiling and mutating project"
echo "(ant -DmutOp=\"ALL\" clean compile)"
echo
$MAJOR_HOME/bin/ant -DmutOp="ALL" clean compile

echo
echo "Compiling tests"
echo "(ant compile.tests)"
echo
$MAJOR_HOME/bin/ant compile.tests

echo
echo "Run tests without mutation analysis"
echo "(ant test)"
$MAJOR_HOME/bin/ant test

echo
echo "Run tests with mutation analysis"
echo "(ant mutation.test)"
$MAJOR_HOME/bin/ant mutation.test
read -p "press enter end"
