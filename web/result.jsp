<%-- 
    Document   : result
    Created on : 19-Oct-2017, 16:53:48
    Author     : matthewpowell
--%>

<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <body>
        <h1 align="center">Beer Recommendations JSP</h1>
        <p>
            
            <% 
                List styles =(List)request.getAttribute("styles");
                Iterator it = styles.iterator();
                while(it.hasNext()){
                    out.print("<br>try: " + it.next());
                }
                %>
    </body>
</html>
