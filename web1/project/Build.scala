import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "web1"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
  )

  lazy val common = RootProject(file("../common"))

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  ).dependsOn(common)

}
