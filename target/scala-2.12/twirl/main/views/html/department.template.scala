
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
            
              <td>"""),_display_(/*32.20*/d/*32.21*/.getName),format.raw/*32.29*/("""</td>
              """),_display_(/*33.16*/if(user != null)/*33.32*/{_display_(Seq[Any](format.raw/*33.33*/("""
                """),_display_(/*34.18*/if(user.getRole() == "admin")/*34.47*/{_display_(Seq[Any](format.raw/*34.48*/("""
              """),format.raw/*35.15*/("""<td>
                <a href=""""),_display_(/*36.27*/routes/*36.33*/.HomeController.updateDepartment(d.getId)),format.raw/*36.74*/("""" class="button-xs btn-danger">
                  <span class="glyphicon glyphicon-pencil"></span>
                </a>
              </td>  
              <td>
                <a href=""""),_display_(/*41.27*/routes/*41.33*/.HomeController.deleteDepartment(d.getId)),format.raw/*41.74*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
            """)))}),format.raw/*45.14*/("""
          """)))}),format.raw/*46.12*/("""
            """),format.raw/*47.13*/("""</tr>
          """)))}),format.raw/*48.12*/("""
        """),format.raw/*49.9*/("""</tbody>
      
      </table>
      """),_display_(/*52.8*/if(user != null)/*52.24*/{_display_(Seq[Any](format.raw/*52.25*/("""
        """),_display_(/*53.10*/if(user.getRole() == "admin")/*53.39*/{_display_(Seq[Any](format.raw/*53.40*/("""
      """),format.raw/*54.7*/("""<p>
        <a href=""""),_display_(/*55.19*/routes/*55.25*/.HomeController.addDepartment()),format.raw/*55.56*/("""">
          <button class="btn btn-primary">Add a Department</button>
        </a>
      </p>
    """)))}),format.raw/*59.6*/("""
  """)))}),format.raw/*60.4*/("""

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
                  DATE: Tue Mar 13 11:08:28 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA1/app/views/department.scala.html
                  HASH: b958bab1d2cd3e39f1ef9e7d42057433fbc1a2e6
                  MATRIX: 988->1|1143->61|1171->64|1203->88|1242->90|1274->96|1340->137|1380->169|1419->171|1454->180|1523->223|1536->228|1571->243|1607->252|1649->264|1682->270|1880->441|1905->457|1944->458|1987->474|2025->503|2064->504|2105->517|2177->558|2222->572|2263->585|2347->642|2379->658|2419->660|2460->673|2527->713|2537->714|2564->720|2629->758|2639->759|2668->767|2716->788|2741->804|2780->805|2825->823|2863->852|2902->853|2945->868|3003->899|3018->905|3080->946|3294->1133|3309->1139|3371->1180|3585->1363|3628->1375|3669->1388|3717->1405|3753->1414|3817->1452|3842->1468|3881->1469|3918->1479|3956->1508|3995->1509|4029->1516|4078->1538|4093->1544|4145->1575|4275->1675|4309->1679
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|55->23|56->24|60->28|60->28|60->28|61->29|62->30|62->30|62->30|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|68->36|68->36|68->36|73->41|73->41|73->41|77->45|78->46|79->47|80->48|81->49|84->52|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|87->55|91->59|92->60
                  -- GENERATED --
              */
          