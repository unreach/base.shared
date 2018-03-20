#!/bin/sh
#use master

echo $branchName

mvn clean install
mvn deploy


