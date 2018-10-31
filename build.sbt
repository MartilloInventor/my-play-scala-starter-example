name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
     .enablePlugins(PlayScala)
     .enablePlugins(PlayScala,PlayNettyServer, JavaAppPackaging)     
//       .enablePlugins(PlayScala, PlayNettyServer, JavaServerAppPackaging
	 .disablePlugins(PlayAkkaHttpServer)


//assemblyShadeRules in assembly := Seq(
//	ShadeRule.rename("org.apache.commons.io.**" -> "shadeio.@1").inAll
//    )

scalaVersion := "2.11.11"
//scalaVersion := "2.12.4"

libraryDependencies += jdbc
libraryDependencies += cache
//libraryDependencies += ehcache
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test




