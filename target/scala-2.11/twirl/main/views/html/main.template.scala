
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.57*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("images/favicon.png")),format.raw/*17.100*/("""">
    </head>
    <body>
            <!-- start of nav section -->
        <nav class="navbar navbar-inverse">
                <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Product Catalogue</a>
            </div>
                <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*28.22*/if(title == "Home")/*28.41*/{_display_(Seq[Any](format.raw/*28.42*/("""class="active"""")))}),format.raw/*28.57*/("""><a href=""""),_display_(/*28.68*/routes/*28.74*/.HomeController.index()),format.raw/*28.97*/("""">Home</a></li>
                <li """),_display_(/*29.22*/if(title == "About")/*29.42*/{_display_(Seq[Any](format.raw/*29.43*/("""class="active"""")))}),format.raw/*29.58*/("""><a href=""""),_display_(/*29.69*/routes/*29.75*/.HomeController.about()),format.raw/*29.98*/("""">About Us</a></li>
                <li """),_display_(/*30.22*/if(title == "Products")/*30.45*/{_display_(Seq[Any](format.raw/*30.46*/("""class="active"""")))}),format.raw/*30.61*/("""><a href=""""),_display_(/*30.72*/routes/*30.78*/.HomeController.products()),format.raw/*30.104*/("""">Products</a></li>
                    <!-- Login Link -->
                <li """),_display_(/*32.22*/if(title == "Login")/*32.42*/{_display_(Seq[Any](format.raw/*32.43*/("""class="active"""")))}),format.raw/*32.58*/(""">
                """),_display_(/*33.18*/if(user != null)/*33.34*/ {_display_(Seq[Any](format.raw/*33.36*/("""
                    """),format.raw/*34.21*/("""<a href=""""),_display_(/*34.31*/routes/*34.37*/.LoginController.logout()),format.raw/*34.62*/("""">Logout</a>
                """)))}/*35.19*/else/*35.24*/{_display_(Seq[Any](format.raw/*35.25*/("""
                    """),format.raw/*36.21*/("""<a href=""""),_display_(/*36.31*/routes/*36.37*/.LoginController.login()),format.raw/*36.61*/("""">Login</a>
                """)))}),format.raw/*37.18*/("""
                """),format.raw/*38.17*/("""</li>
            </ul>
        </nav>

        <div class="container-fluid">
            """),format.raw/*44.35*/("""
            """),_display_(/*45.14*/content),format.raw/*45.21*/("""
        """),format.raw/*46.9*/("""</div>
        <footer class="container-fluid">
            <p></p>
        </footer>

    </body>
        <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*55.19*/routes/*55.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*55.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:21:38 GMT 2016
                  SOURCE: /home/wdd/webapps/WebDevLab11/app/views/main.scala.html
                  HASH: ec944477b4b31ade5c5d104eb22ad513646fd6fd
                  MATRIX: 1015->255|1165->310|1193->312|1273->417|1305->422|1340->430|1366->435|1629->671|1644->677|1706->718|1790->775|1805->781|1866->820|2293->1220|2321->1239|2360->1240|2406->1255|2444->1266|2459->1272|2503->1295|2567->1332|2596->1352|2635->1353|2681->1368|2719->1379|2734->1385|2778->1408|2846->1449|2878->1472|2917->1473|2963->1488|3001->1499|3016->1505|3064->1531|3172->1612|3201->1632|3240->1633|3286->1648|3332->1667|3357->1683|3397->1685|3446->1706|3483->1716|3498->1722|3544->1747|3593->1778|3606->1783|3645->1784|3694->1805|3731->1815|3746->1821|3791->1845|3851->1874|3896->1891|4014->2074|4055->2088|4083->2095|4119->2104|4495->2453|4510->2459|4572->2500
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|46->16|46->16|46->16|47->17|47->17|47->17|58->28|58->28|58->28|58->28|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|59->29|59->29|60->30|60->30|60->30|60->30|60->30|60->30|60->30|62->32|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|66->36|67->37|68->38|73->44|74->45|74->45|75->46|84->55|84->55|84->55
                  -- GENERATED --
              */
          