
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
            <th colspan="2"></th>      
          </tr>
        </thead>
      
        <tbody>
          """),_display_(/*24.12*/for(d<-deptList) yield /*24.28*/ {_display_(Seq[Any](format.raw/*24.30*/("""
            """),format.raw/*25.13*/("""<tr>
              <td class="numeric">"""),_display_(/*26.36*/d/*26.37*/.getDeptID),format.raw/*26.47*/("""</td>
              <td>"""),_display_(/*27.20*/d/*27.21*/.getDepName),format.raw/*27.32*/("""</td>
              <td>
                <a href=""""),_display_(/*29.27*/routes/*29.33*/.HomeController.updateDepartment(d.getDeptID)),format.raw/*29.78*/("""" class="button-xs btn-danger">
                  <span class="glyphicon glyphicon-pencil"></span>
                </a>
              </td>  
              <td>
                <a href=""""),_display_(/*34.27*/routes/*34.33*/.HomeController.deleteDepartment(d.getDeptID)),format.raw/*34.78*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
            </tr>
          """)))}),format.raw/*39.12*/("""
        """),format.raw/*40.9*/("""</tbody>
      
      </table>
      <p>
        <a href=""""),_display_(/*44.19*/routes/*44.25*/.HomeController.addDepartment()),format.raw/*44.56*/("""">
          <button class="btn btn-primary">Add a Department</button>
        </a>
      </p>

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
                  DATE: Fri Mar 09 12:56:27 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/department.scala.html
                  HASH: 3e831bdd305854ff5d570f501b13f03f48e6565b
                  MATRIX: 988->1|1143->61|1171->64|1203->88|1242->90|1274->96|1340->137|1380->169|1419->171|1454->180|1523->223|1536->228|1571->243|1607->252|1649->264|1682->270|1974->535|2006->551|2046->553|2087->566|2154->606|2164->607|2195->617|2247->642|2257->643|2289->654|2367->705|2382->711|2448->756|2662->943|2677->949|2743->994|2973->1193|3009->1202|3095->1261|3110->1267|3162->1298
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|59->27|59->27|61->29|61->29|61->29|66->34|66->34|66->34|71->39|72->40|76->44|76->44|76->44
                  -- GENERATED --
              */
          