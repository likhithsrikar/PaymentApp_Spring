<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payment App - Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <style>
        :root {
            --primary-color: #2c3e50;
            --secondary-color: #3498db;
            --accent-color: #e74c3c;
        }
        body {
            background-color: #f5f5f5;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .navbar {
            background-color: var(--primary-color) !important;
        }
        .card {
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            margin-bottom: 20px;
            border: none;
        }
        .balance-card {
            background: linear-gradient(135deg, var(--primary-color), var(--secondary-color));
            color: white;
        }
        .action-btn {
            width: 100%;
            padding: 15px 0;
            margin-bottom: 10px;
            border-radius: 8px;
            font-weight: 500;
        }
        .transaction-item {
            border-left: 4px solid var(--secondary-color);
            padding-left: 15px;
            margin-bottom: 15px;
        }
        .credit {
            border-left-color: #2ecc71;
        }
        .debit {
            border-left-color: var(--accent-color);
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark mb-4">
        <div class="container">
            <a class="navbar-brand" href="#">
                <i class="fas fa-wallet me-2"></i>Payment App
            </a>
            <div class="d-flex align-items-center">
                <span class="text-light me-3">Welcome, ${user.firstName}</span>
                <a href="logout" class="btn btn-outline-light btn-sm">
                    <i class="fas fa-sign-out-alt"></i>
                </a>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="row">
            <!-- Balance Card -->
            <div class="col-md-4">
                <div class="card balance-card">
                    <div class="card-body">
                        <h6 class="card-subtitle mb-2">Available Balance</h6>
                        <h2 class="card-title">₹${account.currentWalletBalance}</h2>
                        <div class="d-flex justify-content-between mt-4">
                            <a href="add-money" class="btn btn-light btn-sm">
                                <i class="fas fa-plus-circle me-1"></i> Add Money
                            </a>
                            <a href="withdraw" class="btn btn-light btn-sm">
                                <i class="fas fa-minus-circle me-1"></i>
                            </a>
                        </div>
                    </div>
                </div>
                
              
                <div class="card mt-3">
                    <div class="card-body">
                        <h5 class="card-title">Quick Actions</h5>
                        <a href="send-money" class="btn btn-primary action-btn">
                            <i class="fas fa-paper-plane me-2"></i> Send Money
                        </a>
                        <a href="request-money" class="btn btn-success action-btn">
                            <i class="fas fa-hand-holding-usd me-2"></i> Request Money
                        </a>
                        <a href="bank-accounts" class="btn btn-info action-btn">
                            <i class="fas fa-university me-2"></i> Bank Accounts
                        </a>
                        <a href="transactions" class="btn btn-warning action-btn">
                            <i class="fas fa-history me-2"></i> Transaction History
                        </a>
                    </div>
                </div>
            </div>
            
          
            <div class="col-md-8">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                            <h5 class="card-title mb-0">Recent Transactions</h5>
                            <a href="transactions" class="btn btn-sm btn-outline-secondary">View All</a>
                        </div>
                        
                        <c:forEach items="${transactions}" var="txn">
                        <div class="transaction-item ${txn.type == 'CREDIT' ? 'credit' : 'debit'}">
                            <div class="d-flex justify-content-between">
                                <div>
                                    <h6 class="mb-1">${txn.description}</h6>
                                    <small class="text-muted">
                                        <fmt:formatDate value="${txn.transactionDateTime}" pattern="dd MMM yyyy, hh:mm a"/>
                                    </small>
                                </div>
                                <div class="text-end">
                                    <strong class="${txn.type == 'CREDIT' ? 'text-success' : 'text-danger'}">
                                        ${txn.type == 'CREDIT' ? '+' : '-'} ₹${txn.amount}
                                    </strong><br>
                                    <span class="badge bg-light text-dark">${txn.status}</span>
                                </div>
                            </div>
                        </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>