
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

object updateDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateAddressForm: Form[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.81*/("""
"""),_display_(/*3.2*/main("Update Department", user)/*3.33*/{_display_(Seq[Any](format.raw/*3.34*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Department</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateDepartmentSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""

    """),_display_(/*11.6*/inputText(updateAddressForm("department"), '_label -> "Department", 'class -> "form-control")),format.raw/*11.99*/("""
    """),_display_(/*12.6*/select(
        updateDepartmentForm("employee.id"),
        options(Employee.options),
        '_label -> "Employee", '_default -> "-- Choose a employee --",
        '_showConstraints -> false, 'class -> "form-control"
    )),format.raw/*17.6*/("""   
    """),format.raw/*18.5*/("""<div class="actions">
        <input type="submit" value="Update Department" class="btn btn-primary">
        <a href=""""),_display_(/*20.19*/routes/*20.25*/.HomeController.department),format.raw/*20.51*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*24.3*/("""
""")))}))
      }
    }
  }

  def render(id:Long,updateAddressForm:Form[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateAddressForm,user)

  def f:((Long,Form[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateAddressForm,user) => apply(id,updateAddressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 12:58:44 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/updateDepartment.scala.html
                  HASH: 32b4fa3c93b37bff8756e9bd6fa550823a83101c
                  MATRIX: 999->1|1151->82|1196->80|1223->99|1262->130|1300->131|1327->132|1393->173|1543->315|1582->317|1614->350|1645->356|1657->360|1687->370|1720->377|1834->470|1866->476|2111->701|2146->709|2293->829|2308->835|2355->861|2488->964
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|43->11|43->11|44->12|49->17|50->18|52->20|52->20|52->20|56->24
                  -- GENERATED --
              */
          