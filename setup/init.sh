#!/bin/bash

# This script initializes the whole workspace including submodules.
# Prerequisites:
# - Java 17+
# - Maven 2
# - Gradle

./setup/git_init.sh
gradle build
