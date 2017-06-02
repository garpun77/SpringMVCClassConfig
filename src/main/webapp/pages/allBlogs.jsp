<%@include file="template/header.jsp"%>

<body>
    <c:forEach items="${blogs}" var="blog">
        <h2>${blog.blogName}</h2>
        <h3>${blog.blogDescr}</h3>
        <p><a href="blog-${blog.id}">detailes</a></p>
        <hr>
    </c:forEach>
</body>
</html>
