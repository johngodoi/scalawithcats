name := "ScalaWithCats"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"

// scalac options come from the sbt-tpolecat plugin so need to set any here

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Ypartial-unification"
)