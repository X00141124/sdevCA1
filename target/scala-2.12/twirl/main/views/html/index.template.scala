
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
                  DATE: Fri Mar 09 21:24:36 GMT 2018
                  SOURCE: /home/brandon/Documents/sdevCA/app/views/index.scala.html
                  HASH: a7d3b5bdbd64bb62bc4d619533c1661e8bcc2c71
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1531->290|1546->296|1591->320|1667->370|1701->388|1741->390|1777->399|1814->409|1829->415|1880->445|1934->472|1944->473|1973->481|2012->492|2060->513|2070->514|2111->534|2169->562|2201->567|2345->685|2386->717|2426->719|2462->728|2534->773|2548->778|2584->793|2620->802|2664->816|2698->823|2863->961|2888->977|2927->978|2968->992|3006->1021|3045->1022|3084->1033|3156->1074|3199->1086|3235->1095|3307->1140|3340->1157|3380->1159|3419->1170|3466->1190|3565->1279|3606->1281|3651->1298|3734->1354|3773->1372|3814->1395|3827->1400|3866->1401|3911->1418|4030->1506|4071->1519|4119->1540|4129->1541|4156->1547|4215->1579|4230->1585|4291->1625|4336->1643|4346->1644|4375->1652|4465->1715|4475->1716|4518->1738|4564->1757|4589->1773|4628->1774|4671->1790|4709->1819|4748->1820|4794->1838|4856->1873|4871->1879|4931->1918|5171->2131|5186->2137|5246->2176|5475->2374|5520->2388|5572->2412|5618->2427|5652->2434|5706->2462|5731->2478|5770->2479|5804->2487|5842->2516|5881->2517|5913->2522|5960->2542|5975->2548|6025->2577|6145->2667|6177->2669|6207->2672|6252->2687
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|64->32|64->32|64->32|65->33|65->33|65->33|66->34|67->35|68->36|69->37|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|79->47|80->48|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|88->56|89->57|89->57|89->57|94->62|94->62|94->62|99->67|100->68|102->70|103->71|104->72|107->75|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|110->78|114->82|115->83|116->84|118->86
                  -- GENERATED --
              */
          