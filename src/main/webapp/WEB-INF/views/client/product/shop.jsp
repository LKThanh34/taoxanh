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

            <!-- banner Product -->
            <div class="container-fluid service py-2">
                <div class="container">
                    <div class="row g-4 justify-content-center">
                        <div class="col-md-6 col-lg-12">
                            <a href="#">
                                <div class="service-item">
                                    <img src="/client/img/col_banner_img1.png" class="img-fluid rounded-top w-100"
                                        alt="">
                                </div>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <!--End -->

            <!-- shop-->
            <div class="container-fluid fruite py-1">
                <div class="container">
                    <h1 class="mb-4 lg-4">Iphone 16 Pro max</h1>
                    <div class="row g-4">
                        <div class="col-lg-12">
                            <div class="row">
                                <div class="col-xl-9"></div>
                                <div class="col-xl-3">
                                    <div class="bg-white justify-content-between mb-4">
                                        <label for="fruits">Sắp Xếp :</label>
                                        <select id="fruits" name="fruitlist"
                                            class="border-0 form-select-sm bg-light me-3" form="fruitform">
                                            <option value="volvo">Giá từ thấp đến cao</option>
                                            <option value="saab">Giá Từ cao đến thấp</option>
                                            <option value="opel">Sản Phẩm bán chạy</option>
                                            <option value="audi">Sản phẩm mới nhất</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row g-4">
                                <div class="col-lg-2">
                                    <div class="row g-4">
                                        <div class="col-lg-12">
                                            <div class="mb-3">
                                                <h4>Danh mục sản phẩm</h4>
                                                <ul class="list-unstyled fruite-categorie">
                                                    <li>
                                                        <div class="d-flex justify-content-between fruite-name">
                                                            <a href="#"><i class="fas fa-apple-alt me-2"></i>Iphone 16
                                                                Pro
                                                                max</a>
                                                            <span>(3)</span>
                                                        </div>
                                                    </li>
                                                    <li>
                                                        <div class="d-flex justify-content-between fruite-name">
                                                            <a href="#"><i class="fas fa-apple-alt me-2"></i>Iphone 16
                                                                plus</a>
                                                            <span>(4)</span>
                                                        </div>
                                                    </li>

                                                    <li>
                                                        <div class="d-flex justify-content-between fruite-name">
                                                            <a href="#"><i class="fas fa-apple-alt me-2"></i>Iphone
                                                                16</a>
                                                            <span>(3)</span>
                                                        </div>
                                                    </li>


                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-10">
                                    <div class="row g-2 justify-content-center">
                                        <div class="col-md-6 col-lg-6 col-xl-2">
                                            <div class="rounded position-relative fruite-item">
                                                <div class="fruite-img">
                                                    <img src="/client/img/iphonetest.png" class="img-fluid w-150 "
                                                        alt="">
                                                </div>
                                                <div class="text-white bg-danger px-3 py-1 rounded position-absolute"
                                                    style="top: 10px; left: 10px;">new</div>
                                                <div class="p-2 ">
                                                    <p class="title-product scale-text">Iphone 14 Pro Max 128GB Quốc tế
                                                        cũ
                                                        99%-Tím</p>
                                                    <p class="fs-5 fw-bold p-2 price">12,000,000₫</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-lg-6 col-xl-2">
                                            <div class="rounded position-relative fruite-item">
                                                <div class="fruite-img">
                                                    <img src="/client/img/iphonetest.png"
                                                        class="img-fluid w-100 rounded-top" alt="">
                                                </div>
                                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                                    style="top: 10px; left: 10px;">new</div>
                                                <div class="p-2 ">
                                                    <p class="title-product scale-text">Iphone 14 Pro Max 128GB Quốc tế
                                                        cũ
                                                        99% - Tím</p>
                                                    <p class="title-product fs-5 fw-bold p-2 price">12,000,000₫</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-lg-6 col-xl-2">
                                            <div class="rounded position-relative fruite-item">
                                                <div class="fruite-img">
                                                    <img src="/client/img/iphonetest.png"
                                                        class="img-fluid w-100 rounded-top" alt="">
                                                </div>
                                                <div class="text-white bg-secondary px-3 py-1 rounded position-absolute"
                                                    style="top: 10px; left: 10px;">new</div>
                                                <div class="p-2 ">
                                                    <p class="title-product scale-text">Iphone 14 Pro Max 128GB Quốc tế
                                                        cũ
                                                        99%-Tím</p>
                                                    <p class="fs-5 fw-bold p-2 price">12,000,000₫</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-lg-6 col-xl-2">
                                            <div class="rounded position-relative fruite-item">
                                                <div class="fruite-img">
                                                    <img src="/client/img/iphonetest.png"
                                                        class="img-fluid w-100 rounded-top" alt="">
                                                </div>
                                                <div class="text-white bg-secondary px-3 py-1 rounded position-absolute"
                                                    style="top: 10px; left: 10px;">new</div>
                                                <div class="p-2 ">
                                                    <p class="title-product scale-text">Iphone 14 Pro Max 128GB Quốc tế
                                                        cũ
                                                        99%-Tím</p>
                                                    <p class="fs-5 fw-bold p-2 price">12,000,000₫</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-lg-6 col-xl-2">
                                            <div class="rounded position-relative fruite-item">
                                                <div class="fruite-img">
                                                    <img src="/client/img/iphonetest.png"
                                                        class="img-fluid w-100 rounded-top" alt="">
                                                </div>
                                                <div class="text-white bg-secondary px-3 py-1 rounded position-absolute"
                                                    style="top: 10px; left: 10px;">new</div>
                                                <div class="p-2 ">
                                                    <p class="title-product scale-text">Iphone 14 Pro Max 128GB Quốc tế
                                                        cũ
                                                        99%-Tím</p>
                                                    <p class="fs-5 fw-bold p-2 price">12,000,000₫</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-lg-6 col-xl-2">
                                            <div class="rounded position-relative fruite-item">
                                                <div class="fruite-img">
                                                    <img src="/client/img/iphonetest.png"
                                                        class="img-fluid w-100 rounded-top" alt="">
                                                </div>
                                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                                    style="top: 10px; left: 10px;">new</div>
                                                <div class="p-2 ">
                                                    <p class="title-product scale-text">Iphone 14 Pro Max 128GB Quốc tế
                                                        cũ
                                                        99%-Tím</p>
                                                    <p class="fs-5 fw-bold p-2 price">12,000,000₫</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-lg-6 col-xl-2">
                                            <div class="rounded position-relative fruite-item">
                                                <div class="fruite-img">
                                                    <img src="/client/img/iphonetest.png"
                                                        class="img-fluid w-100 rounded-top" alt="">
                                                </div>
                                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                                    style="top: 10px; left: 10px;">like new</div>
                                                <div class="p-2 ">
                                                    <p class="title-product scale-text">Iphone 14 Pro Max 128GB Quốc tế
                                                        cũ
                                                        99%-Tím</p>
                                                    <p class="fs-5 fw-bold p-2 price">12,000,000₫</p>
                                                </div>
                                            </div>
                                        </div>


                                        <!-- phân trang -->
                                        <div class="col-12">
                                            <div class="pagination d-flex justify-content-center mt-5">
                                                <a href="#" class="rounded">&laquo;</a>
                                                <a href="#" class="active rounded">1</a>
                                                <a href="#" class="rounded">2</a>
                                                <a href="#" class="rounded">3</a>
                                                <a href="#" class="rounded">4</a>
                                                <a href="#" class="rounded">5</a>
                                                <a href="#" class="rounded">6</a>
                                                <a href="#" class="rounded">&raquo;</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--  Shop End-->
            <!-- Tin tức khuyến mại-->
            <div class="container-fluid vesitable">
                <div class="container">
                    <h3 class="mb-0 news-title">Tin tức khuyến mãi</h3>
                    <div class="owl-carousel vegetable-carousel justify-content-center">
                        <div class="border rounded position-relative vesitable-item">
                            <div class="vesitable-img">
                                <img src="/client/img/km1.png" class="img-fluid w-100 rounded-top" alt="">
                            </div>
                            <div class="text-white bg-danger px-3 py-1 rounded position-absolute"
                                style="top: 10px; right: 10px;">Hot</div>
                            <div class="p-4 rounded-bottom news-content">
                                <p>BLACK FRIDAY 2024 || SALE TOÀN BỘ SẢN PHẨM</p>
                            </div>
                        </div>
                        <div class="border rounded position-relative vesitable-item">
                            <div class="vesitable-img">
                                <img src="/client/img/km1.png" class="img-fluid w-100 rounded-top" alt="">
                            </div>
                            <div class="text-white bg-danger px-3 py-1 rounded position-absolute"
                                style="top: 10px; right: 10px;">Hot</div>
                            <div class="p-4 rounded-bottom news-content">
                                <p>BLACK FRIDAY 2024 || SALE TOÀN BỘ SẢN PHẨM</p>
                            </div>
                        </div>
                        <div class="border rounded position-relative vesitable-item">
                            <div class="vesitable-img">
                                <img src="/client/img/km1.png" class="img-fluid w-100 rounded-top" alt="">
                            </div>
                            <div class="text-white bg-danger px-3 py-1 rounded position-absolute"
                                style="top: 10px; right: 10px;">Hot</div>
                            <div class="p-4 rounded-bottom news-content">
                                <p>BLACK FRIDAY 2024 || SALE TOÀN BỘ SẢN PHẨM</p>
                            </div>
                        </div>
                        <div class="border rounded position-relative vesitable-item">
                            <div class="vesitable-img">
                                <img src="/client/img/km1.png" class="img-fluid w-100 rounded-top" alt="">
                            </div>
                            <div class="text-white bg-danger px-3 py-1 rounded position-absolute"
                                style="top: 10px; right: 10px;">Hot</div>
                            <div class="p-4 rounded-bottom news-content">
                                <p>BLACK FRIDAY 2024 || SALE TOÀN BỘ SẢN PHẨM</p>
                            </div>
                        </div>
                        <div class="border rounded position-relative vesitable-item">
                            <div class="vesitable-img">
                                <img src="/client/img/km1.png" class="img-fluid w-100 rounded-top" alt="">
                            </div>
                            <div class="text-white bg-danger px-3 py-1 rounded position-absolute"
                                style="top: 10px; right: 10px;">Hot</div>
                            <div class="p-4 rounded-bottom news-content">
                                <p>BLACK FRIDAY 2024 || SALE TOÀN BỘ SẢN PHẨM</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>



            <jsp:include page="../layout/footer.jsp" />


            <!-- Back to Top -->
            <a href="#" class="btn btn-primary border-3 border-primary rounded-circle back-to-top"><i
                    class="fa fa-arrow-up"></i></a>
        </body>

        </html>