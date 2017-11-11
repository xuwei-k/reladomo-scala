libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

//addSbtPlugin("io.get-coursier"   % "sbt-coursier"    % "1.0.0-RC12-1")
addSbtPlugin("com.lucidchart"    % "sbt-scalafmt"    % "1.14")
addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.1.17")
addSbtPlugin("com.timushev.sbt"  % "sbt-updates"     % "0.3.1")
addSbtPlugin("net.virtual-void"  % "sbt-dependency-graph" % "0.9.0")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"         % "1.1.0-M1")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"    % "2.0")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
