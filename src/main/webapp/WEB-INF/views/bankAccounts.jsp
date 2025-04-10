<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bank Accounts</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>Your Bank Accounts</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Bank Name</th>
                    <th>Account Number</th>
                    <th>Branch</th>
                    <th>IFSC Code</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${bankAccounts}" var="account">
                    <tr>
                        <td>${account.bankName}</td>
                        <td>${account.accountNumber}</td>
                        <td>${account.branchLocation}</td>
                        <td>${account.ifscCode}</td>
                        <td>${account.isActive == 'true' ? 'Active' : 'Inactive'}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <h3 class="mt-4">Add Bank Account</h3>
        <form action="/bank-accounts/add" method="post">
            <div class="form-group">
                <label for="bankName">Bank Name:</label>
                <input type="text" id="bankName" name="bankName" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="accountNumber">Account Number:</label>
                <input type="text" id="accountNumber" name="accountNumber" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="ifscCode">IFSC Code:</label>
                <input type="text" id="ifscCode" name="ifscCode" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="branchLocation">Branch:</label>
                <input type="text" id="branchLocation" name="branchLocation" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary mt-3">Add Bank Account</button>
        </form>
    </div>
</body>
</html>
