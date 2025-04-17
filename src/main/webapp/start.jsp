<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<s:form action="calculate">
    <s:textfield name="number1" label="Number 1"/>
    <s:textfield name="number2" label="Number 2"/>
    <s:submit value="Add" action="add"/>
    <s:submit value="Subtract" action="subtract"/>
    <s:submit value="Multiply" action="multiply"/>
    <s:submit value="Divide" action="divide"/>
</s:form>

<s:if test="operation != null">
    <h2>Result: <s:property value="result"/></h2>
    <h2>Operation: <s:property value="operation"/></h2>
</s:if>
</body>
</html>