
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

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateEmployeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Update employee", user)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
    
"""),format.raw/*7.1*/("""<p class="lead"> Update Employee</p>

"""),_display_(/*9.2*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),_display_(/*13.6*/inputText(updateEmployeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.88*/("""
    """),_display_(/*14.6*/inputText(updateEmployeeForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*14.94*/("""

    """),_display_(/*16.6*/for((value, name) <- Project.options) yield /*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
        """),format.raw/*17.9*/("""<input type="checkbox" name="proSelect[]" value=""""),_display_(/*17.59*/value),format.raw/*17.64*/(""""
        """),_display_(/*18.10*/if(Project.inProject(value.toLong, id))/*18.49*/ {_display_(Seq[Any](format.raw/*18.51*/("""
            """),format.raw/*19.13*/("""checked
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""/>"""),_display_(/*21.12*/name),format.raw/*21.16*/("""<br>
    """)))}),format.raw/*22.6*/("""
    
    """),_display_(/*24.6*/inputText(updateEmployeeForm("department name"), '_label -> "Department", 'class -> "form-control")),format.raw/*24.105*/("""
    
    """),format.raw/*26.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*32.19*/routes/*32.25*/.HomeController.index(0)),format.raw/*32.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*36.3*/("""
""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,user)

  def f:((Long,Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,user) => apply(id,updateEmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 17:07:48 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/updateEmployee.scala.html
                  HASH: e36005212800a32d726217f681caa0fd95ba3916
                  MATRIX: 995->1|1146->82|1191->79|1219->98|1246->100|1283->129|1322->131|1354->137|1418->176|1567->316|1607->318|1640->351|1672->357|1685->361|1716->371|1748->377|1851->459|1883->465|1992->553|2025->560|2078->597|2118->599|2154->608|2231->658|2257->663|2295->674|2343->713|2383->715|2424->728|2472->745|2508->754|2538->757|2563->761|2603->771|2640->782|2761->881|2798->891|3050->1116|3065->1122|3110->1146|3243->1249|3275->1251
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|56->24|56->24|58->26|64->32|64->32|64->32|68->36|69->37
                  -- GENERATED --
              */
          