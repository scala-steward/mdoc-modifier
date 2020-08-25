import sbt._

object Dependencies {

  val `mdoc-modifier-akka-http`: Seq[ModuleID] =
    Seq(
      Artifact.akkaHttp,
      Artifact.akkaStream
    ) ++ Seq(
      Artifact.akkaHttpTestKit,
      Artifact.akkaTeskit,
      Artifact.scalaTest
    )//.map(_ % Test)

  val `mdoc-modifier-plantuml`: Seq[ModuleID] =
    Seq(
      Artifact.plantUml,
      Artifact.zio,
      Artifact.zioStreams,
      Artifact.zioLogging
    ) ++ Seq(
      Artifact.zioTest,
      Artifact.zioTestSbt
    ).map(_ % Test)

  private object Artifact {

    val akkaHttp        = "com.typesafe.akka"       %% "akka-http"         % Version.akkaHttp
    val akkaHttpTestKit = "com.typesafe.akka"       %% "akka-http-testkit" % Version.akkaHttp
    val akkaStream      = "com.typesafe.akka"       %% "akka-stream"       % Version.akka
    val akkaTeskit      = "com.typesafe.akka"       %% "akka-testkit"      % Version.akka
    val plantUml        = "net.sourceforge.plantuml" % "plantuml"          % Version.plantUml
    val scalaTest       = "org.scalatest"           %% "scalatest"         % Version.scalaTest
    val zio             = "dev.zio"                 %% "zio"               % Version.zio
    val zioLogging      = "dev.zio"                 %% "zio-logging-slf4j" % Version.zioLogging
    val zioStreams      = "dev.zio"                 %% "zio-streams"       % Version.zio
    val zioTest         = "dev.zio"                 %% "zio-test"          % Version.zio
    val zioTestSbt      = "dev.zio"                 %% "zio-test-sbt"      % Version.zio

  }

  private object Version {
    val akkaHttp                  = "10.2.0"
    val akka                      = "2.6.8"
    val plantUml                  = "1.2020.16"
    val scalaTest                 = "3.2.1"
    val zio                       = "1.0.0"
    val zioLogging                = "0.4.0"
  }

}
