
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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Update product", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    
"""),format.raw/*7.1*/("""<p class="lead"> Update Product</p>

"""),_display_(/*9.2*/form(action=routes.HomeController.updateProductSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),_display_(/*13.6*/inputText(updateProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.87*/("""
    """),_display_(/*14.6*/inputText(updateProductForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*14.101*/("""
    """),_display_(/*15.6*/select(updateProductForm("category.id"),options(Category.options),'_label -> "Category", '_default -> "-- Choose a category --", '_showConstraints -> false, 'class -> "form-control")),format.raw/*15.188*/("""     

    """),_display_(/*17.6*/inputText(updateProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*17.89*/("""
    """),_display_(/*18.6*/inputText(updateProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*18.89*/("""
    
    """),format.raw/*20.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*26.19*/routes/*26.25*/.HomeController.index(0)),format.raw/*26.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*30.3*/("""
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 11:42:22 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/app/views/updateProduct.scala.html
                  HASH: 613a1282884e7b82e7ea5c2c4e0d97f8c2f1c858
                  MATRIX: 993->1|1142->80|1187->77|1215->96|1242->98|1278->126|1317->128|1349->134|1412->172|1560->311|1600->313|1633->346|1665->352|1678->356|1709->366|1741->372|1843->453|1875->459|1992->554|2024->560|2228->742|2266->754|2370->837|2402->843|2506->926|2543->936|2794->1160|2809->1166|2854->1190|2987->1293|3019->1295
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|50->18|50->18|52->20|58->26|58->26|58->26|62->30|63->31
                  -- GENERATED --
              */
          