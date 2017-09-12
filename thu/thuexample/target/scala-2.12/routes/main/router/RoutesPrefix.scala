
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/GITHUB/HappyTraining/thu/thuexample/conf/routes
// @DATE:Sat Sep 09 19:55:52 ICT 2017


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
