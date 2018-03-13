
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/sdevCA1/conf/routes
// @DATE:Tue Mar 13 11:08:27 GMT 2018


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
