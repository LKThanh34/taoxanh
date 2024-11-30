<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="utf-8" />
            <meta http-equiv="X-UA-Compatible" content="IE=edge" />
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
            <meta name="description" content="Website taoxanh.vn" />
            <meta name="author" content="Le Kim Thanh" />
            <title>taoxanh</title>
            <link href="admin/css/styles.css" rel="stylesheet" />
            <link href="admin/css/fontawesome.css" rel="style"/>
            <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        </head>

        <body class="sb-nav-fixed">
            <jsp:include page="../layout/header.jsp" />
            <div id="layoutSidenav">
                <jsp:include page="../layout/sidebar.jsp" />
                <div id="layoutSidenav_content">
                    <main>
                        <div class="container-fluid">
                            <h1 class="mt-4">Manage Users</h1>
                            <ol class="breadcrumb mb-4">
                                <li class="breadcrumb-item"><a href="/admin">Dashboard</a></li>
                                <li class="breadcrumb-item active">Categories</li>
                            </ol>
                            <div class="row">
                                <div class="col-xl-3 col-md-6 ">
                                    <div class="card bg-light text-dark border-bold">
                                        <div class="card-body"><img class="img-category"
                                                src="/admin/images/iphone-1-1.png" alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">IPHONE</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-md-6">
                                    <div class="card bg-light text-dark border-bold">
                                        <div class="card-body"><img class="img-category" src="/admin/images/Ipad.png"
                                                alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">IPAD</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-md-6">
                                    <div class="card bg-light text-white border-bold">
                                        <div class="card-body"><img class="img-category" src="/admin/images/macbook.png"
                                                alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">MACBOOK</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-md-6">
                                    <div class="card bg-light text-white border-bold">
                                        <div class="card-body"><img class="img-category" src="/admin/images/watch.png"
                                                alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">WATCH</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-md-6">
                                    <div class="card bg-light text-white border-bold">
                                        <div class="card-body"><img class="img-category" src="/admin/images/phukien.png"
                                                alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">PHỤ KIỆN</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-md-6">
                                    <div class="card bg-light text-white border-bold">
                                        <div class="card-body"><img class="img-category" src="/admin/images/order.png"
                                                alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">ĐƠN HÀNG</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-md-6">
                                    <div class="card bg-light text-white border-bold">
                                        <div class="card-body"><img class="img-category" src="/admin/images/order.png"
                                                alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">ĐƠN HÀNG</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-md-6">
                                    <div class="card bg-light text-white border-bold">
                                        <div class="card-body"><img class="img-category" src="/admin/images/order.png"
                                                alt="">
                                        </div>
                                        <div class="card-footer d-flex align-items-center justify-content-between">
                                            <a class="text-dark stretched-link" href="#">ĐƠN HÀNG</a>
                                            <div class="small text-dark"><i class="fas fa-angle-right"></i></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </main>
                    <jsp:include page="../layout/footer.jsp" />
                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                crossorigin="anonymous"></script>
            <script src="/admin/js/scripts.js"></script>

        </body>

        </html>