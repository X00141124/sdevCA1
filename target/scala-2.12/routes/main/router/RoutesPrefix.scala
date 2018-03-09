
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/sdevCA/conf/routes
// @DATE:Fri Mar 09 13:09:58 GMT 2018


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
