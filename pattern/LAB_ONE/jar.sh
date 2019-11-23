#!/bin/bash

javac -cp lib/commons-codec-1.4.jar:lib/org.apache.commons.io-2.6.jar *.java

jar cvfm myHashFunk.jar MANIFEST.MD *.class
