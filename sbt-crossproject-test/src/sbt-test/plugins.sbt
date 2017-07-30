// COPIED FROM sbt-crossproject-test/src/sbt-test/plugins.sbt
val pluginVersion = sys.props.get("plugin.version").getOrElse("0.2.0-SNAPSHOT")

addSbtPlugin("org.scala-js"     % "sbt-scalajs"              % "0.6.19")
addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % pluginVersion)
addSbtPlugin("org.scala-native" % "sbt-crossproject"         % pluginVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native"         % "0.3.1")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-encoding",
  "utf8"
)
