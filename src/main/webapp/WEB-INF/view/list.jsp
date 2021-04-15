<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
        pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>word test</title>
</head>
<body>

<table border="1">
    <thead>
    <tr>
        <th>�б��̸�</th>
        <th>�����⵵</th>
        <th>�ܾ�</th>
        <th>�ؼ�</th>
        <th>�켱����</th>
        <th>Ƚ��</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${wordList}" var="word">
            <tr>
                <td>${word.sch_name}</td>
                <td>${word.year}</td>
                <td>${word.word}</td>
                <td>${word.trans}</td>
                <td>${word.priority}</td>
                <td>${word.word_count}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>


<table border="1">
    <thead>
    <tr>
        <th>�б��̸�</th>
        <th>�����⵵</th>
        <th>�ܾ�</th>
        <th>�ؼ�</th>
        <th>�켱����</th>
        <th>Ƚ��</th>
    </tr>
    </thead>
    <tbody>
<%--    <c:forEach items="${wordList}" var="word">--%>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>



</body>
</html>