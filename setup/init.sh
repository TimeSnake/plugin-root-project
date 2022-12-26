#!/bin/bash

# This script initializes the whole workspace including submodules.
# Prerequisites:
# - Java 17+
# - Maven 2
# - Gradle

./git_init.sh
gradle :library-entities-generator runFinalJar
gradle build
