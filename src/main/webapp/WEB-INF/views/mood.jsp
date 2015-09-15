<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>

My mood is : <a href="/one/reason/${ MyMood.feeling }">${ MyMood.feeling }</a>
</body>
</html>
