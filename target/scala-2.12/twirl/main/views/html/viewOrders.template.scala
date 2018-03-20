
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("View Order", customer)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/("""
		 
		"""),_display_(/*21.4*/if(customer.getOrders() == null)/*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
			"""),format.raw/*22.4*/("""<h2>There are no orders to see</h2>
		""")))}/*23.5*/else/*23.10*/{_display_(Seq[Any](format.raw/*23.11*/("""
"""),_display_(/*24.2*/for(o <- customer.getOrders()) yield /*24.32*/ {_display_(Seq[Any](format.raw/*24.34*/("""
	"""),format.raw/*25.2*/("""<p>Order Number: """),_display_(/*25.20*/o/*25.21*/.getId()),format.raw/*25.29*/("""</p>
	<p>Order Date: """),_display_(/*26.18*/o/*26.19*/.convertDate()),format.raw/*26.33*/("""</p>
		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*39.18*/for(i <- o.getItems()) yield /*39.40*/ {_display_(Seq[Any](format.raw/*39.42*/("""
					"""),format.raw/*40.6*/("""<tr>
							<td>"""),_display_(/*41.13*/i/*41.14*/.getId),format.raw/*41.20*/("""</td>
							<td>"""),_display_(/*42.13*/i/*42.14*/.getProduct.getName),format.raw/*42.33*/("""</td>
							<td>"""),_display_(/*43.13*/i/*43.14*/.getQuantity),format.raw/*43.26*/("""</td>
							<td>&euro; """),_display_(/*44.20*/("%.2f".format(i.getPrice()))),format.raw/*44.49*/("""</td>
							<td>&euro; """),_display_(/*45.20*/("%.2f".format(i.getItemTotal()))),format.raw/*45.53*/("""</td>
						</tr>
						
				""")))}),format.raw/*48.6*/("""
				
              
			"""),format.raw/*51.4*/("""</tbody>

		</table>
		<div class="col-md-12">
				<p class="text-right"><strong>Order Total: &euro; """),_display_(/*55.56*/("%.2f".format(o.getOrderTotal))),format.raw/*55.88*/("""</strong></p>
			</div>  
		</div>
		<div class="col-md-12" style="margin-bottom: 4em;">
			<a href=""""),_display_(/*59.14*/routes/*59.20*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*59.56*/("""" class="btn btn-primary btn-sm float-left">Cancel Order</a>
		</div> 
		""")))}),format.raw/*61.4*/(""" 
	""")))}),format.raw/*62.3*/("""
        """),format.raw/*63.9*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 15:55:01 GMT 2018
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 2/Software Development 4/SoftwarePlayFrameworkLab6/app/views/viewOrders.scala.html
                  HASH: 0255b1d440e4ddf023d0a3db952d5bdd075e3e33
                  MATRIX: 968->1|1074->38|1110->68|1142->94|1196->34|1225->119|1252->120|1323->166|1359->194|1398->196|1428->199|1501->246|1542->278|1582->280|1615->286|1686->330|1700->335|1736->350|1769->356|1809->366|1843->374|1884->406|1924->408|1955->412|2012->452|2025->457|2064->458|2092->460|2138->490|2178->492|2207->494|2252->512|2262->513|2291->521|2340->543|2350->544|2385->558|2672->818|2710->840|2750->842|2783->848|2827->865|2837->866|2864->872|2909->890|2919->891|2959->910|3004->928|3014->929|3047->941|3099->966|3149->995|3201->1020|3255->1053|3315->1083|3366->1107|3495->1209|3548->1241|3677->1343|3692->1349|3749->1385|3853->1459|3887->1463|3923->1472
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|57->25|58->26|58->26|58->26|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|77->45|77->45|80->48|83->51|87->55|87->55|91->59|91->59|91->59|93->61|94->62|95->63
                  -- GENERATED --
              */
          