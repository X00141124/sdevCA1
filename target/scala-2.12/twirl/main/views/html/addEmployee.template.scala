
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.Employee],Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee], addressForm: Form[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.99*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Employee",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new employee</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addEmployeeSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(employeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.86*/("""
        """),format.raw/*14.9*/("""<label>Projects</label><br>
        """),_display_(/*15.10*/for((value, name) <- Project.options) yield /*15.47*/ {_display_(Seq[Any](format.raw/*15.49*/("""
            """),format.raw/*16.13*/("""<input type="checkbox" name="proSelect[]" value=""""),_display_(/*16.63*/value),format.raw/*16.68*/(""""

            /> """),_display_(/*18.17*/name),format.raw/*18.21*/("""<br>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""<br>
        """),_display_(/*21.10*/select(
        employeeForm("department.id"), 
        options(Department.options), '_label -> "Department Name", '_default -> "-- Choose a department --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*25.10*/("""
        
        """),_display_(/*27.10*/inputText(addressForm("street"), '_label -> "Address", 'class -> "form-control")),format.raw/*27.90*/("""
        """),_display_(/*28.10*/inputText(addressForm("eirCode"), '_label -> "Eircode", 'class -> "form-control")),format.raw/*28.91*/("""
        """),_display_(/*29.10*/inputText(addressForm("country"), '_label -> "Country", 'class -> "form-control")),format.raw/*29.91*/("""

        """),_display_(/*31.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*31.75*/("""
        """),_display_(/*32.10*/inputText(addressForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*32.74*/("""
        
        """),format.raw/*34.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.HomeController.index(0)),format.raw/*39.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*43.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],addressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,addressForm,user)

  def f:((Form[models.Employee],Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,addressForm,user) => apply(employeeForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 13 11:08:28 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA1/app/views/addEmployee.scala.html
                  HASH: 65895990a2c66faf4dd31c87ce6060cfc76ccf37
                  MATRIX: 1008->1|1178->100|1223->98|1250->116|1277->118|1310->143|1349->145|1380->150|1449->194|1606->343|1645->345|1682->382|1719->392|1732->396|1763->406|1801->417|1898->493|1934->502|1998->539|2051->576|2091->578|2132->591|2209->641|2235->646|2281->665|2306->669|2351->683|2387->692|2428->706|2677->934|2723->953|2824->1033|2861->1043|2963->1124|3000->1134|3102->1215|3140->1226|3226->1291|3263->1301|3348->1365|3393->1383|3665->1628|3680->1634|3725->1658|3873->1776
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|50->18|51->19|52->20|53->21|57->25|59->27|59->27|60->28|60->28|61->29|61->29|63->31|63->31|64->32|64->32|66->34|71->39|71->39|71->39|75->43
                  -- GENERATED --
              */
          