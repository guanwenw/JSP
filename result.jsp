<!doctype html>
<html>
    <head>
        <title>RESULT</title>
    </head>

    <body>
        <%
        if(request.getAttribute("message") != null){
        out.println("<h1>" + request.getAttribute("message") + "</h1>");
        }
        %>
    </body>
</html>
