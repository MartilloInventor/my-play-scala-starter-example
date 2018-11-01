

lazy val root = (project in file("."))
  .settings(
    name := """play-scala""",
    organization := """com.example""",
    version := "1.0-SNAPSHOT",
    scalaVersion := """2.12.7"""

  ).enablePlugins(PlayScala)
//  .enablePlugins(PlayScala, PlayNettyServer, JavaAppPackaging)
//  .enablePlugins(PlayScala, PlayNettyServer, JavaServerAppPackaging
//  .disablePlugins(PlayAkkaHttpServer)


//assemblyShadeRules in assembly := Seq(
//	ShadeRule.rename("org.apache.commons.io.**" -> "shadeio.@1").inAll
//    )

//scalaVersion := "2.11.11"


//libraryDependencies += jdbc
//libraryDependencies += "com.oracle" %% "ojdbc" % "10.2.0"
//libraryDependencies += cache
//libraryDependencies += ehcache
//libraryDependencies += ws
//libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test




