<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Transaction History</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .table {
            margin-top: 20px;
        }
        .table th {
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">Transaction History</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Date</th>
                    <th>Source Type</th>
                    <th>Destination Type</th>
                    <th>Amount</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${transactions}" var="txn">
                    <tr>
                        <td>${txn.transactionId}</td>
                        <td><fmt:formatDate value="${txn.transactionDateTime}" pattern="dd MMM yyyy, hh:mm a" /></td>
                        <td>${txn.sourceType}</td>
                        <td>${txn.destinationType}</td>
                        <td>₹${txn.transactionAmount}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
