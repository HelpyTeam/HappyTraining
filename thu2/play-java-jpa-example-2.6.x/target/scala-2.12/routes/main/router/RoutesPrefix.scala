
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/GITHUB/HappyTraining/thu/play-java-jpa-example-2.6.x/conf/routes
// @DATE:Tue Sep 12 17:00:06 ICT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
