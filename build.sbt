name := "test_yarn_app"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.3"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-client" % "2.7.3"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-nodemanager" % "2.7.3"
