<%@include file="template/header.jsp"%>
<body>
    <h1>hello! ${xxx}</h1>
    <form action="/saveBlog" method="post">
        <input type="text"  name="blogName">
        <input type="text" name="blogDescr">
        <input type="submit">
    </form>

<a href="/showAllBlogs"> showAllBlogs</a>
</body>
</html>
