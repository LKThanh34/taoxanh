<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <html lang="en">

        <jsp:include page="../layout/header.jsp" />

        <body>

            <jsp:include page="../layout/navigation.jsp" />

            <!-- breadcrumb -->
            <div class="container-fluid bg-white">
                <div class="container">
                    <ol class="breadcrumb mb-0 small text-truncate">
                        <li class="breadcrumb-item"><a href="#">Trang Chủ</a></li>
                        <li class="breadcrumb-item active" aria-current="page">iPhone</li>
                    </ol>
                </div>
            </div>

            <!-- Banner New Product-->
            <div class="container-fluid banner bg-light my-5">
                <div class="container">
                    <div class="row g-4 align-items-center">
                        <div class="col-lg-6">
                            <div class="py-4">
                                <h1 class="display-3">IPHONE 16 SERIES</h1>
                                <p class="fw-normal display-3 mb-4">Ngắm nhìn cận cảnh</p>
                                <p class="mb-4">Nay bạn có thể chụp ảnh hoặc quay video đẹp hoàn hảo và siêu nhanh.
                                    Điều Khiển Camera giúp bạn truy
                                    cập nhanh các công cụ camera dễ dàng hơn. Chỉ cần trượt ngón tay để điều chỉnh các
                                    chức
                                    năng
                                    của camera như độ phơi sáng hay chiều sâu trường ảnh,
                                    và chuyển đổi qua lại giữa các ống kính hoặc dùng tính năng thu phóng kỹ thuật số để
                                    căn
                                    chỉnh khung hình, theo cách bạn thích.</p>
                                <a href="#" class="banner-btn btn border-2 border-white  py-3 px-5">Khám Phá Ngay</a>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="position-relative">
                                <img src="/client/img/hero_spatial__gna2d6arpimq_large_2x.png"
                                    class="img-fluid w-100 rounded" alt="">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Banner Section End -->

            <!-- Category -->
            <div class="container-fluid service py-5">
                <div class="container">
                    <div class="row g-4 justify-content-center">
                        <div class="col-md-6 col-lg-12">
                            <a href="#">
                                <div class="service-item">
                                    <img src="/client/img/iphone15 SERIES.png" class="img-fluid rounded-top w-100"
                                        alt="">
                                </div>
                            </a>
                        </div>
                        <div class="col-md-6 col-lg-6">
                            <a href="#">
                                <div class="service-item">
                                    <img src="/client/img/iphone 14pro max.png" class="img-fluid rounded-top w-100"
                                        alt="">
                                </div>
                            </a>
                        </div>
                        <div class="col-md-6 col-lg-6">
                            <a href="#">
                                <div class="service-item">
                                    <img src="/client/img/iphone14pro.png" class="img-fluid rounded-top w-100" alt="">
                                </div>
                            </a>
                        </div>
                        <div class="col-md-6 col-lg-6 service-item">
                            <a href="#">
                                <div class="service-item">
                                    <img src="/client/img/iphone14plus.png" class="img-fluid rounded-bottom w-100"
                                        alt="">
                                </div>
                            </a>
                        </div>
                        <div class="col-md-6 col-lg-6 service-item">
                            <a href="#">
                                <div class="service-item">
                                    <img src="/client/img/iphone14.png" class="img-fluid rounded-bottom w-100" alt="">
                                </div>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Featurs End -->

            <!-- Back to Top -->
            <a href="#" class="btn btn-primary border-3 border-primary rounded-circle back-to-top"><i
                    class="fa fa-arrow-up"></i></a>

            <jsp:include page="../layout/footer.jsp" />
        </body>

        </html>