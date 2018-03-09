
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
        """),_display_(/*19.10*/select(
        employeeForm("department.id"), 
        options(Department.options), '_label -> "Department Name", '_default -> "-- Choose a department --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*23.10*/("""
        
        """),_display_(/*25.10*/inputText(employeeForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*25.92*/(""" 
        """),_display_(/*26.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*26.75*/("""
        
        """),format.raw/*28.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*33.23*/routes/*33.29*/.HomeController.index(0)),format.raw/*33.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*37.6*/("""
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
                  DATE: Fri Mar 09 12:56:27 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/addEmployee.scala.html
                  HASH: f9ad6ec82c7ba78022af84ff0932bae7b06dcaa5
                  MATRIX: 987->1|1122->65|1167->63|1194->81|1221->83|1254->108|1293->110|1324->115|1393->159|1550->308|1589->310|1626->347|1663->357|1676->361|1707->371|1745->382|1842->458|1879->468|1932->505|1972->507|2013->520|2090->570|2116->575|2161->593|2186->597|2231->611|2268->621|2517->849|2563->868|2666->950|2704->961|2790->1026|2835->1044|3107->1289|3122->1295|3167->1319|3315->1437
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|50->18|51->19|55->23|57->25|57->25|58->26|58->26|60->28|65->33|65->33|65->33|69->37
                  -- GENERATED --
              */
          