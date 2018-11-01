resolvers += Resolver.typesafeRepo("releases")

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.20")

//addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.3")

// web plugins

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.10")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.1.2")

addSbtPlugin("org.irundaia.sbt" % "sbt-sassify" % "1.4.11")


libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0-M2"
libraryDependencies += "com.typesafe.play" %% "play-ehcache" % "2.6.20"
libraryDependencies += "com.typesafe.play" %% "play-ahc-ws-standalone" % "2.6.20"
libraryDependencies += "com.typesafe.play" %% "play-ws-standalone-json" % "2.6.20"
libraryDependencies += "com.typesafe.play" %% "play-ws-standalone-xml" % "2.6.20"