
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

object department extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(deptList: List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

"""),_display_(/*3.2*/main("Department", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

    """),format.raw/*5.5*/("""<p class="lead">Our Department</p>

    """),_display_(/*7.6*/if(flash.containsKey("success"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
        """),_display_(/*9.10*/flash/*9.15*/.get("success")),format.raw/*9.30*/("""
        """),format.raw/*10.9*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<table class="table table-bordered table-hover table-condensed">

        <thead>
          <tr>
            <th>ID</th>
            <th>Department Name</th>
            """),_display_(/*19.14*/if(user != null)/*19.30*/{_display_(Seq[Any](format.raw/*19.31*/("""
              """),_display_(/*20.16*/if(user.getRole() == "admin")/*20.45*/{_display_(Seq[Any](format.raw/*20.46*/("""
            """),format.raw/*21.13*/("""<th colspan="2"></th>    
              """)))}),format.raw/*22.16*/("""
            """)))}),format.raw/*23.14*/("""  
          """),format.raw/*24.11*/("""</tr>
        </thead>
      
        <tbody>
          """),_display_(/*28.12*/for(d<-deptList) yield /*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
            """),format.raw/*29.13*/("""<tr>
              <td class="numeric">"""),_display_(/*30.36*/d/*30.37*/.getId),format.raw/*30.43*/("""</td>
              <td>"""),_display_(/*31.20*/d/*31.21*/.getName),format.raw/*31.29*/("""</td>
              """),_display_(/*32.16*/if(user != null)/*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
                """),_display_(/*33.18*/if(user.getRole() == "admin")/*33.47*/{_display_(Seq[Any](format.raw/*33.48*/("""
              """),format.raw/*34.15*/("""<td>
                <a href=""""),_display_(/*35.27*/routes/*35.33*/.HomeController.updateDepartment(d.getId)),format.raw/*35.74*/("""" class="button-xs btn-danger">
                  <span class="glyphicon glyphicon-pencil"></span>
                </a>
              </td>  
              <td>
                <a href=""""),_display_(/*40.27*/routes/*40.33*/.HomeController.deleteDepartment(d.getId)),format.raw/*40.74*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
            """)))}),format.raw/*44.14*/("""
          """)))}),format.raw/*45.12*/("""
            """),format.raw/*46.13*/("""</tr>
          """)))}),format.raw/*47.12*/("""
        """),format.raw/*48.9*/("""</tbody>
      
      </table>
      """),_display_(/*51.8*/if(user != null)/*51.24*/{_display_(Seq[Any](format.raw/*51.25*/("""
        """),_display_(/*52.10*/if(user.getRole() == "admin")/*52.39*/{_display_(Seq[Any](format.raw/*52.40*/("""
      """),format.raw/*53.7*/("""<p>
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.HomeController.addDepartment()),format.raw/*54.56*/("""">
          <button class="btn btn-primary">Add a Department</button>
        </a>
      </p>
    """)))}),format.raw/*58.6*/("""
  """)))}),format.raw/*59.4*/("""

""")))}))
      }
    }
  }

  def render(deptList:List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(deptList,user)

  def f:((List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (deptList,user) => apply(deptList,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 21:24:04 GMT 2018
                  SOURCE: /home/brandon/Documents/sdevCA/app/views/department.scala.html
                  HASH: fc1276de9178a75037534ff1112aa251c02f9267
                  MATRIX: 988->1|1143->61|1171->64|1203->88|1242->90|1274->96|1340->137|1380->169|1419->171|1454->180|1523->223|1536->228|1571->243|1607->252|1649->264|1682->270|1880->441|1905->457|1944->458|1987->474|2025->503|2064->504|2105->517|2177->558|2222->572|2263->585|2347->642|2379->658|2419->660|2460->673|2527->713|2537->714|2564->720|2616->745|2626->746|2655->754|2703->775|2728->791|2767->792|2812->810|2850->839|2889->840|2932->855|2990->886|3005->892|3067->933|3281->1120|3296->1126|3358->1167|3572->1350|3615->1362|3656->1375|3704->1392|3740->1401|3804->1439|3829->1455|3868->1456|3905->1466|3943->1495|3982->1496|4016->1503|4065->1525|4080->1531|4132->1562|4262->1662|4296->1666
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|55->23|56->24|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|67->35|67->35|67->35|72->40|72->40|72->40|76->44|77->45|78->46|79->47|80->48|83->51|83->51|83->51|84->52|84->52|84->52|85->53|86->54|86->54|86->54|90->58|91->59
                  -- GENERATED --
              */
          