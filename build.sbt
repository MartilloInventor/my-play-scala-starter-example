lazy val root = (project in file("."))
  .settings(
    name := """play-scala""",
    organization := """com.example""",
    version := """1.0-SNAPSHOT""",
    scalaVersion := """2.12.7""",
   
  ).enablePlugins(PlayScala)
//  .enablePlugins(PlayScala, PlayNettyServer, JavaAppPackaging)
//  .enablePlugins(PlayScala, PlayNettyServer, JavaServerAppPackaging
//  .disablePlugins(PlayAkkaHttpServer)

//assemblyShadeRules in assembly := Seq(
//	ShadeRule.rename("org.apache.commons.io.**" -> "shadeio.@1").inAll
//    )

//libraryDependencies += jdbc

//libraryDependencies += ehcache
//libraryDependencies += ws


