
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
    <table class="table table-bordered table-hover table-condensed table-striped">
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
          """),_display_(/*32.12*/if(user != null)/*32.28*/{_display_(Seq[Any](format.raw/*32.29*/("""
            """),_display_(/*33.14*/if(user.getRole() == "admin")/*33.43*/{_display_(Seq[Any](format.raw/*33.44*/("""
          """),format.raw/*34.11*/("""<th colspan="2"></th>      
            """)))}),format.raw/*35.14*/("""
          """)))}),format.raw/*36.12*/("""
        """),format.raw/*37.9*/("""</tr>
      </thead>

      <tbody>
        """),_display_(/*41.10*/for(e<-employees) yield /*41.27*/ {_display_(Seq[Any](format.raw/*41.29*/("""
          """),format.raw/*42.11*/("""<tr>
              """),_display_(/*43.16*/if(env.resource("public/images/employeeImages/thumbnails/" + e.getId + ".jpg").isDefined)/*43.105*/ {_display_(Seq[Any](format.raw/*43.107*/("""
                """),format.raw/*44.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*44.73*/(e.getId + ".jpg")),format.raw/*44.91*/(""""/></td>
            """)))}/*45.15*/else/*45.20*/{_display_(Seq[Any](format.raw/*45.21*/("""
                """),format.raw/*46.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*47.14*/("""
            """),format.raw/*48.13*/("""<td class="numeric">"""),_display_(/*48.34*/e/*48.35*/.getId),format.raw/*48.41*/("""</td>
            <td><a href=""""),_display_(/*49.27*/routes/*49.33*/.HomeController.employeeDetails(e.getId)),format.raw/*49.73*/("""">
              """),_display_(/*50.16*/e/*50.17*/.getName),format.raw/*50.25*/("""</td>  
            </a>      
            <td class="String">"""),_display_(/*52.33*/e/*52.34*/.getDepartment.getName),format.raw/*52.56*/("""</td>
            """),_display_(/*53.14*/if(user != null)/*53.30*/{_display_(Seq[Any](format.raw/*53.31*/("""
              """),_display_(/*54.16*/if(user.getRole() == "admin")/*54.45*/{_display_(Seq[Any](format.raw/*54.46*/("""

                """),format.raw/*56.17*/("""<td>
                    <a href=""""),_display_(/*57.31*/routes/*57.37*/.HomeController.updateEmployee(e.getId)),format.raw/*57.76*/("""" class="button xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                </td> 
                <td>
                    <a href=""""),_display_(/*62.31*/routes/*62.37*/.HomeController.deleteEmployee(e.getId)),format.raw/*62.76*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                    </a>
                </td>

              """)))}),format.raw/*67.16*/("""
            """)))}),format.raw/*68.14*/("""
            
          """),format.raw/*70.11*/("""</tr>
        """)))}),format.raw/*71.10*/("""
      """),format.raw/*72.7*/("""</tbody>

    </table>
    """),_display_(/*75.6*/if(user != null)/*75.22*/{_display_(Seq[Any](format.raw/*75.23*/("""
      """),_display_(/*76.8*/if(user.getRole() == "admin")/*76.37*/{_display_(Seq[Any](format.raw/*76.38*/("""
    """),format.raw/*77.5*/("""<p>
      <a href=""""),_display_(/*78.17*/routes/*78.23*/.HomeController.addEmployee()),format.raw/*78.52*/("""">
        <button class="btn btn-primary">Add a employee</button>
      </a>
    </p>
  """)))}),format.raw/*82.4*/("""
""")))}),format.raw/*83.2*/("""
  """),format.raw/*84.3*/("""</div>
</div>
""")))}),format.raw/*86.2*/("""
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
                  DATE: Mon Mar 12 17:08:13 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA1/app/views/index.scala.html
                  HASH: 89487d5947a1dca6bab81877d20c8be9c1af3eb6
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1531->290|1546->296|1591->320|1667->370|1701->388|1741->390|1777->399|1814->409|1829->415|1880->445|1934->472|1944->473|1973->481|2012->492|2060->513|2070->514|2111->534|2169->562|2201->567|2359->699|2400->731|2440->733|2476->742|2548->787|2562->792|2598->807|2634->816|2678->830|2712->837|2877->975|2902->991|2941->992|2982->1006|3020->1035|3059->1036|3098->1047|3170->1088|3213->1100|3249->1109|3321->1154|3354->1171|3394->1173|3433->1184|3480->1204|3579->1293|3620->1295|3665->1312|3748->1368|3787->1386|3828->1409|3841->1414|3880->1415|3925->1432|4044->1520|4085->1533|4133->1554|4143->1555|4170->1561|4229->1593|4244->1599|4305->1639|4350->1657|4360->1658|4389->1666|4479->1729|4489->1730|4532->1752|4578->1771|4603->1787|4642->1788|4685->1804|4723->1833|4762->1834|4808->1852|4870->1887|4885->1893|4945->1932|5174->2134|5189->2140|5249->2179|5476->2375|5521->2389|5573->2413|5619->2428|5653->2435|5707->2463|5732->2479|5771->2480|5805->2488|5843->2517|5882->2518|5914->2523|5961->2543|5976->2549|6026->2578|6146->2668|6178->2670|6208->2673|6253->2688
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|64->32|64->32|64->32|65->33|65->33|65->33|66->34|67->35|68->36|69->37|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|88->56|89->57|89->57|89->57|94->62|94->62|94->62|99->67|100->68|102->70|103->71|104->72|107->75|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|110->78|114->82|115->83|116->84|118->86
                  -- GENERATED --
              */
          