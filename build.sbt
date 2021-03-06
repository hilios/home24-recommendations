name := "home24-recommendations"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "3.5.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

mainClass := Some("recommendations.Main")

assemblyJarName in assembly := "recommendations.jar"

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")