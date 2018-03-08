
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
    <table class="table table-bordered table-hover table-condensed" style="color: red">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*38.10*/for(e<-employees) yield /*38.27*/ {_display_(Seq[Any](format.raw/*38.29*/("""
          """),format.raw/*39.11*/("""<tr>
              """),_display_(/*40.16*/if(env.resource("public/images/employeeImages/thumbnails/" + e.getId + ".jpg").isDefined)/*40.105*/ {_display_(Seq[Any](format.raw/*40.107*/("""
                """),format.raw/*41.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*41.73*/(e.getId + ".jpg")),format.raw/*41.91*/(""""/></td>
            """)))}/*42.15*/else/*42.20*/{_display_(Seq[Any](format.raw/*42.21*/("""
                """),format.raw/*43.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""<td class="numeric">"""),_display_(/*45.34*/e/*45.35*/.getId),format.raw/*45.41*/("""</td>
            <td>"""),_display_(/*46.18*/e/*46.19*/.getName),format.raw/*46.27*/("""</td>        
            <td>"""),_display_(/*47.18*/e/*47.19*/.getAddress),format.raw/*47.30*/("""</td>
            <td  class="String">"""),_display_(/*48.34*/e/*48.35*/.getAddress),format.raw/*48.46*/("""</td>
            <td>
              <a href=""""),_display_(/*50.25*/routes/*50.31*/.HomeController.updateEmployee(e.getId)),format.raw/*50.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*54.25*/routes/*54.31*/.HomeController.deleteEmployee(e.getId)),format.raw/*54.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*59.10*/("""
      """),format.raw/*60.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*65.17*/routes/*65.23*/.HomeController.addEmployee()),format.raw/*65.52*/("""">
        <button class="btn btn-primary">Add a employee</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*71.2*/("""
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
                  DATE: Thu Mar 08 14:29:32 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/index.scala.html
                  HASH: 8955b7a8beaae64e1c274d2beb18bb360bae151f
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1531->290|1546->296|1591->320|1667->370|1701->388|1741->390|1777->399|1814->409|1829->415|1880->445|1934->472|1944->473|1973->481|2012->492|2060->513|2070->514|2111->534|2169->562|2201->567|2364->704|2405->736|2445->738|2481->747|2553->792|2567->797|2603->812|2639->821|2683->835|2717->842|2983->1081|3016->1098|3056->1100|3095->1111|3142->1131|3241->1220|3282->1222|3327->1239|3410->1295|3449->1313|3490->1336|3503->1341|3542->1342|3587->1359|3706->1447|3747->1460|3795->1481|3805->1482|3832->1488|3882->1511|3892->1512|3921->1520|3979->1551|3989->1552|4021->1563|4087->1602|4097->1603|4129->1614|4203->1661|4218->1667|4278->1706|4475->1876|4490->1882|4550->1921|4770->2110|4804->2117|4879->2165|4894->2171|4944->2200|5078->2304
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|76->44|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|82->50|82->50|82->50|86->54|86->54|86->54|91->59|92->60|97->65|97->65|97->65|103->71
                  -- GENERATED --
              */
          