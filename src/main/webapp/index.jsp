<%-- This is a page directive, that will apply to the entire page --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- Let's take a look at an instance variable, and like servlet variables, this will persist between page loads --%>
<%! int counter = 0; %>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Burgers 'R Us"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>Welcome to Burgers 'r Us!</h1>
    <p>Currently <%= counter %> million burgers sold</p>

    <%-- Use JSTL to iterate through our list of burgers --%>
    <h2>Here is our menu!</h2>

    <div class="list-group">
        <ul><!-- Start of our Burger List -->
            <%-- Loop through the "allBurgers" attritube to display each burger --%>
            <c:forEach var="burger" items="${allBurgers}">
                <li class="list-group-item list-group-item-action"><strong>${burger.burgerName}</strong></li>
                <div class="list-group">
                    <ul>
                        <c:forEach var="ingredient" items="${burger.ingredients}">
                            <li class="list-group-item list-group-item-action">${ingredient.ingredientName}</li>
                        </c:forEach>
                    </ul>
                </div>
            </c:forEach>
        </ul><!-- End of burger list -->
    </div>
    <div class="list-group">
        <ul>
            <c:forEach var="soda" items="${allSodas}">
                <li class="list-group-item list-group-item-action"><strong>${soda.sodaName}</strong></li>
                <div class="list-group">
                    <ul>
                        <li class="list-group-item list-group-item-action">-Small</li>
                        <li class="list-group-item list-group-item-action">-Medium</li>
                        <li class="list-group-item list-group-item-action">-Large</li>
                    </ul>
                </div>
            </c:forEach>
        </ul>
    </div>

</div>


<%-- Now let's run some arbitrary Java code, to increment the counter by 1 every time we reload this page --%>
<% counter += 1; %>
<jsp:include page="partials/scripts.jsp"/>
</body>
</html>