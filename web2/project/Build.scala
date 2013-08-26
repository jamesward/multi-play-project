import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "web2"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
  )

  lazy val common = RootProject(file("../common"))

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  ).dependsOn(common)

}
