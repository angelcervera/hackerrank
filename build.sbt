
version := "1.0-SNAPSHOT"

lazy val commonSettings = Seq(
  organization := "com.acervera.hackerrank.scala",
  scalaVersion := "2.12.8",
  licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    "org.scalactic" %% "scalactic" % "3.0.5"
  )
)


lazy val domainAlgorithms = (project in file("domains/algorithms")).
  settings(commonSettings: _*).
  settings(
    Seq(
      name := "algorithms"
    )
  )

lazy val interviewPreparationKit = (project in file("interview_preparation_kit")).
  settings(commonSettings: _*).
  settings(
    Seq(
      name := "interviewpreparationkit"
    )
  )

