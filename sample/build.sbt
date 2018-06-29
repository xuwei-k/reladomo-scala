lazy val reladomoScalaV  = sys.env.get("RELEASE_VERSION").getOrElse("16.7.1-SNAPSHOT")
lazy val reladomoV       = "16.7.0"
lazy val twitterBinV     = "17.12"
lazy val theOrganization = "com.folio-sec"

lazy val root = (project in file("."))
  .settings(
    organization := "com.example",
    name := "sbt-reladomo-plugin-example",
    scalaVersion := "2.12.4",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      theOrganization             %% "reladomo-scala-common"                         % reladomoScalaV,
      theOrganization             %% s"reladomo-scala-twitter-${twitterBinV}-common" % reladomoScalaV,
      "com.goldmansachs.reladomo" % "reladomo"                                       % reladomoV,
      "com.goldmansachs.reladomo" % "reladomo-serial"                                % reladomoV % "test",
      "com.goldmansachs.reladomo" % "reladomo-test-util"                             % reladomoV % "test",
      "org.scalikejdbc"           %% "scalikejdbc"                                   % "3.2.3" % "test",
      "com.h2database"            % "h2"                                             % "1.4.197" % "test",
      "org.scalatest"             %% "scalatest"                                     % "3.0.5" % "test"
    ),
    reladomoScalaApiFutureType in Compile := "twitter",
    scalafmtOnCompile := true
  )
  .enablePlugins(ReladomoPlugin)
