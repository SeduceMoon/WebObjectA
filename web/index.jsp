<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: hyd
  Date: 18-7-19
  Time: 下午10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="../css/index.css" >
<html>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/bootstrap.min3.3.4.js"></script>
  <head>
    <title>标题暂时没有想好</title>
    <script>
        $(function () {
            $(".list_item").each(function () {
                $(this).click(function () {
                    if($(this).text().toString().indexOf("JAVA进阶之路")!=-1){
                        alert("java进阶")
                        $.ajax({
                            url:"http://baidu.com",
                            async:false,
                        })
                    }
                })
            })
        })
    </script>
  </head>
  <body>
  <div id="home_title">
  </div>
  <div id="home_list">
    <div id="home_index_title" style="width: 761px;">
      456465465465
    </div>
    <%!
      List<String> indexName=new ArrayList<>();
      List<String> itemName=new ArrayList<>();
    %>
    <%
      if(indexName.size()==0) {
        indexName.add("···(╯3╰)日记本···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
        indexName.add("···O(∩_∩)O心情···");
      }
      if(itemName.size()==0) {
        itemName.add("JAVA进阶之路");
        itemName.add("我的作家梦");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
        itemName.add("···O(∩_∩)O心情···");
      }

      for (int i = 0; i < indexName.size(); i++) {
       %>
    <div class="list_item">
      <div class="center_item">
        <div id="item_top">
          <img src="img/icon.jpeg" alt="" id="item_top_icon">
        </div>
        <div id="item_bottom">
          <%=indexName.get(i)%><br>
        </div>
      </div>

      <div style="width: 246px;height:70px;float: left">
        <%=itemName.get(i)%>
      </div>

      <div class="bottom_icon">
        Time:2018.9.18
      </div>
      <div class="bottom_icon">
        ·Create by hyd·
      </div>
    </div>
    <%
      }
    %>
  </div>
  </body>
</html>
