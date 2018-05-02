organization := "com.supervolibear"

name := "project1"

version := "0.0.1"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.11", "2.12.4")

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  "joda-time" % "joda-time" % "2.9.4",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)
