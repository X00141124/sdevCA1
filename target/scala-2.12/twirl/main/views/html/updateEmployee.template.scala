
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

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,Form[models.Employee],Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateEmployeeForm: Form[models.Employee], updateAddressForm: Form[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Update employee", user)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
    
"""),format.raw/*7.1*/("""<p class="lead"> Update Employee</p>

"""),_display_(/*9.2*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),_display_(/*13.6*/inputText(updateEmployeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.88*/("""

    """),_display_(/*15.6*/for((value, name) <- Project.options) yield /*15.43*/ {_display_(Seq[Any](format.raw/*15.45*/("""
        """),format.raw/*16.9*/("""<input type="checkbox" name="proSelect[]" value=""""),_display_(/*16.59*/value),format.raw/*16.64*/(""""
        """),_display_(/*17.10*/if(Project.inProject(value.toLong, id))/*17.49*/ {_display_(Seq[Any](format.raw/*17.51*/("""
            """),format.raw/*18.13*/("""checked
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""/>"""),_display_(/*20.12*/name),format.raw/*20.16*/("""<br>
    """)))}),format.raw/*21.6*/("""
    
    """),_display_(/*23.6*/select(
        updateEmployeeForm("department.id"), 
        options(Department.options), '_label -> "Department Name", '_default -> "-- Choose a department --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*27.10*/("""
        
        """),_display_(/*29.10*/inputText(updateAddressForm("street"), '_label -> "Address", 'class -> "form-control")),format.raw/*29.96*/("""
        """),_display_(/*30.10*/inputText(updateAddressForm("eirCode"), '_label -> "Eircode", 'class -> "form-control")),format.raw/*30.97*/("""
        """),_display_(/*31.10*/inputText(updateAddressForm("country"), '_label -> "Country", 'class -> "form-control")),format.raw/*31.97*/("""
    
    """),format.raw/*33.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*39.19*/routes/*39.25*/.HomeController.index(0)),format.raw/*39.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*43.3*/("""
""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[models.Employee],updateAddressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,updateAddressForm,user)

  def f:((Long,Form[models.Employee],Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,updateAddressForm,user) => apply(id,updateEmployeeForm,updateAddressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 21:02:13 GMT 2018
                  SOURCE: /home/brandon/Documents/sdevCA/app/views/updateEmployee.scala.html
                  HASH: f42f6d31759514f041deb4fca8cf5ed65d3f42b4
                  MATRIX: 1016->1|1208->123|1254->120|1282->139|1309->141|1346->170|1385->172|1417->178|1481->217|1630->357|1670->359|1703->392|1735->398|1748->402|1779->412|1811->418|1914->500|1947->507|2000->544|2040->546|2076->555|2153->605|2179->610|2217->621|2265->660|2305->662|2346->675|2394->692|2430->701|2460->704|2485->708|2525->718|2562->729|2817->963|2863->982|2970->1068|3007->1078|3115->1165|3152->1175|3260->1262|3297->1272|3549->1497|3564->1503|3609->1527|3742->1630|3774->1632
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|55->23|59->27|61->29|61->29|62->30|62->30|63->31|63->31|65->33|71->39|71->39|71->39|75->43|76->44
                  -- GENERATED --
              */
          