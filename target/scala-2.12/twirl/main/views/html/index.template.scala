
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Employee],List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], projects: List[models.Project], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""

"""),_display_(/*3.2*/main("Employees",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Project</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Projects</a>
      """),_display_(/*12.8*/for(p <- projects) yield /*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(p.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/p/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/p/*14.33*/.getEmployees.size()),format.raw/*14.53*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Department Name</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*37.10*/for(e<-employees) yield /*37.27*/ {_display_(Seq[Any](format.raw/*37.29*/("""
          """),format.raw/*38.11*/("""<tr>
              """),_display_(/*39.16*/if(env.resource("public/images/employeeImages/thumbnails/" + e.getId + ".jpg").isDefined)/*39.105*/ {_display_(Seq[Any](format.raw/*39.107*/("""
                """),format.raw/*40.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*40.73*/(e.getId + ".jpg")),format.raw/*40.91*/(""""/></td>
            """)))}/*41.15*/else/*41.20*/{_display_(Seq[Any](format.raw/*41.21*/("""
                """),format.raw/*42.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*43.14*/("""
            """),format.raw/*44.13*/("""<td class="numeric">"""),_display_(/*44.34*/e/*44.35*/.getId),format.raw/*44.41*/("""</td>
            <td><a href=""""),_display_(/*45.27*/routes/*45.33*/.HomeController.employeeDetails(e.getId)),format.raw/*45.73*/("""">
              """),_display_(/*46.16*/e/*46.17*/.getName),format.raw/*46.25*/("""</td>  
            </a>      
            <td class="String">"""),_display_(/*48.33*/e/*48.34*/.getDepartment.getDepName),format.raw/*48.59*/("""</td>
            <td>
              <a href=""""),_display_(/*50.25*/routes/*50.31*/.HomeController.updateEmployee(e.getId)),format.raw/*50.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td> 
                   <td>
              <a href=""""),_display_(/*55.25*/routes/*55.31*/.HomeController.deleteEmployee(e.getId)),format.raw/*55.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*60.10*/("""
      """),format.raw/*61.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*66.17*/routes/*66.23*/.HomeController.addEmployee()),format.raw/*66.52*/("""">
        <button class="btn btn-primary">Add a employee</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*72.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.Employee],projects:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.Employee],List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 11:26:03 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/index.scala.html
                  HASH: 10effd17fc2aaccb9aa06c9536f368c2a61ce8d0
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1531->290|1546->296|1591->320|1667->370|1701->388|1741->390|1777->399|1814->409|1829->415|1880->445|1934->472|1944->473|1973->481|2012->492|2060->513|2070->514|2111->534|2169->562|2201->567|2345->685|2386->717|2426->719|2462->728|2534->773|2548->778|2584->793|2620->802|2664->816|2698->823|2943->1041|2976->1058|3016->1060|3055->1071|3102->1091|3201->1180|3242->1182|3287->1199|3370->1255|3409->1273|3450->1296|3463->1301|3502->1302|3547->1319|3666->1407|3707->1420|3755->1441|3765->1442|3792->1448|3851->1480|3866->1486|3927->1526|3972->1544|3982->1545|4011->1553|4101->1616|4111->1617|4157->1642|4231->1689|4246->1695|4306->1734|4516->1917|4531->1923|4591->1962|4811->2151|4845->2158|4920->2206|4935->2212|4985->2241|5119->2345
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|75->43|76->44|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|80->48|80->48|80->48|82->50|82->50|82->50|87->55|87->55|87->55|92->60|93->61|98->66|98->66|98->66|104->72
                  -- GENERATED --
              */
          