<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<!-- javascripts -->
<script src="/lyn-ssh/js/jquery.js"></script>
<script src="/lyn-ssh/js/jquery-ui-1.10.4.min.js"></script>
<script src="/lyn-ssh/js/jquery-1.8.3.min.js"></script>
<script type="/lyn-ssh/text/javascript"
	src="js/jquery-ui-1.9.2.custom.min.js"></script>
<!-- bootstrap -->
<script src="/lyn-ssh/js/bootstrap.min.js"></script>
<!-- nice scroll -->
<script src="/lyn-ssh/js/jquery.scrollTo.min.js"></script>
<script src="/lyn-ssh/js/jquery.nicescroll.js" type="text/javascript"></script>
<!-- charts scripts -->
<script src="/lyn-ssh/assets/jquery-knob/js/jquery.knob.js"></script>
<script src="/lyn-ssh/js/jquery.sparkline.js" type="text/javascript"></script>
<script
	src="/lyn-ssh/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
<script src="/lyn-ssh/js/owl.carousel.js"></script>
<!-- jQuery full calendar -->
<
<script src="/js/fullcalendar.min.js"></script>
<!-- Full Google Calendar - Calendar -->
<script src="/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
<!--script for this page only-->
<script src="/js/calendar-custom.js"></script>
<script src="/lyn-ssh/js/jquery.rateit.min.js"></script>
<!-- custom select -->
<script src="/lyn-ssh/js/jquery.customSelect.min.js"></script>
<script src="/lyn-ssh/assets/chart-master/Chart.js"></script>

<!--custome script for all page-->
<script src="/lyn-ssh/js/scripts.js"></script>
<!-- custom script for this page-->
<script src="/lyn-ssh/js/sparkline-chart.js"></script>
<script src="/lyn-ssh/js/easy-pie-chart.js"></script>
<script src="/lyn-ssh/js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="/lyn-ssh/js/jquery-jvectormap-world-mill-en.js"></script>
<script src="/lyn-ssh/js/xcharts.min.js"></script>
<script src="/lyn-ssh/js/jquery.autosize.min.js"></script>
<script src="/lyn-ssh/js/jquery.placeholder.min.js"></script>
<script src="/lyn-ssh/js/gdp-data.js"></script>
<script src="/lyn-ssh/js/morris.min.js"></script>
<script src="/lyn-ssh/js/sparklines.js"></script>
<script src="/lyn-ssh/js/charts.js"></script>
<script src="/lyn-ssh/js/jquery.slimscroll.min.js"></script>
<script>
      //knob
      $(function() {
        $(".knob").knob({
          'draw': function() {
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
        $("#owl-slider").owlCarousel({
          navigation: true,
          slideSpeed: 300,
          paginationSpeed: 400,
          singleItem: true

        });
      });

      //custom select box

      $(function() {
        $('select.styled').customSelect();
      });

      /* ---------- Map ---------- */
      $(function() {
        $('#map').vectorMap({
          map: 'world_mill_en',
          series: {
            regions: [{
              values: gdpData,
              scale: ['#000', '#000'],
              normalizeFunction: 'polynomial'
            }]
          },
          backgroundColor: '#eef3f7',
          onLabelShow: function(e, el, code) {
            el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
          }
        });
      });
    </script>