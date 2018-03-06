
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
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
        """),_display_(/*14.10*/for((value, name) <- Project.options) yield /*14.47*/ {_display_(Seq[Any](format.raw/*14.49*/("""
            """),format.raw/*15.13*/("""<input type="checkbox" name="proSelect[]" value=""""),_display_(/*15.63*/value),format.raw/*15.68*/(""""

            />"""),_display_(/*17.16*/name),format.raw/*17.20*/("""<br>
        """)))}),format.raw/*18.10*/("""
        """),_display_(/*19.10*/inputText(employeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*19.86*/("""
        """),_display_(/*20.10*/inputText(employeeForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*20.92*/("""

        """),_display_(/*22.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.75*/("""
        
        """),format.raw/*24.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.HomeController.index(0)),format.raw/*29.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*33.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 16:47:09 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/addEmployee.scala.html
                  HASH: d986b32fecbb994b32310c42593658defa4cd307
                  MATRIX: 987->1|1122->65|1167->63|1194->81|1221->83|1254->108|1293->110|1324->115|1393->159|1550->308|1589->310|1626->347|1663->357|1676->361|1707->371|1745->382|1842->458|1879->468|1932->505|1972->507|2013->520|2090->570|2116->575|2161->593|2186->597|2231->611|2268->621|2365->697|2402->707|2505->789|2543->800|2629->865|2674->883|2946->1128|2961->1134|3006->1158|3154->1276
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|61->29|61->29|61->29|65->33
                  -- GENERATED --
              */
          