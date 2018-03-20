#!/bin/sh
#use master

echo $branchName

echo $repoName

mvn clean install
mvn deploy


