<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>

            <!-- Google Web Fonts -->
            <link rel="preconnect" href="https://fonts.googleapis.com">
            <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
            <link
                href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Raleway:wght@600;800&display=swap"
                rel="stylesheet">

            <!-- Icon Font Stylesheet -->
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css" />
            <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

            <!-- Libraries Stylesheet -->
            <link href="/client/lib/lightbox/css/lightbox.min.css" rel="stylesheet">
            <link href="/client/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">


            <!-- Customized Bootstrap Stylesheet -->
            <link href="/client/css/bootstrap.min.css" rel="stylesheet">

            <!-- Template Stylesheet -->
            <link href="/client/css/style.css" rel="stylesheet">

        </head>

        <body>

            <!-- Spinner Start -->
            <div id="spinner"
                class="show w-100 vh-100 bg-white position-fixed translate-middle top-50 start-50  d-flex align-items-center justify-content-center">
                <div class="spinner-grow text-primary" role="status"></div>
            </div>
            <!-- Spinner End -->

            <jsp:include page="../layout/header.jsp" />

            <!-- Modal Search Start -->
            <div class="modal fade" id="searchModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                aria-hidden="true">
                <div class="modal-dialog modal-fullscreen">
                    <div class="modal-content rounded-0">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Search by keyword</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body d-flex align-items-center">
                            <div class="input-group w-75 mx-auto d-flex">
                                <input type="search" class="form-control p-3" placeholder="keywords"
                                    aria-describedby="search-icon-1">
                                <span id="search-icon-1" class="input-group-text p-3"><i
                                        class="fa fa-search"></i></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Modal Search End -->
            <div class="container-fluid bg-light">
                <div class="container">
                    <ol class="breadcrumb mb-0 small text-truncate">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item"><a href="#">Pages</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Shop Detail</li>
                    </ol>
                </div>
            </div>
            <!-- Single Product Start -->
            <div class="container-fluid">
                <div class="container">
                    <div class="row g-4 mb-5">
                        <div class="col-lg-12 col-xl-12">
                            <div class="row g-4">
                                <div class="col-lg-5 py-5">
                                    <div class="border rounded">
                                        <a href="#">
                                            <img src="/client/img/iphone-16-blue-600x600.png" class="img-fluid rounded"
                                                alt="Image">
                                        </a>
                                    </div>
                                </div>
                                <div class="col-lg-7" style="font-size: 12px;">
                                    <h3 class="fw-bold mb-3">Product Name</h3>
                                    <p class="mb-3">Status: </p>
                                    <h5 class="mb-3"
                                        style="color: brown; font-family: 'Times New Roman'; font-weight: bold; font-size: 25px;">
                                        27.000.000₫</h5>
                                    <!-- <div class="d-flex mb-4">
                                <i class="fa fa-star text-secondary"></i>
                                <i class="fa fa-star text-secondary"></i>
                                <i class="fa fa-star text-secondary"></i>
                                <i class="fa fa-star text-secondary"></i>
                                <i class="fa fa-star"></i>
                            </div> -->
                                    <div class="col-lg-12">
                                        <div class="mb-3">
                                            <div class="categories-inline">
                                                <div class="mb-2">
                                                    <input type="radio" class="me-2" id="memory-1" name="Categories-1"
                                                        value="128GB">
                                                    <label for="memory-1" class="custom-radio">128GB</label>
                                                </div>
                                                <div class="mb-2">
                                                    <input type="radio" class="me-2" id="memory-2" name="Categories-1"
                                                        value="256GB">
                                                    <label for="memory-2" class="custom-radio">256GB</label>
                                                </div>
                                                <div class="mb-2">
                                                    <input type="radio" class="me-2" id="memory-3" name="Categories-1"
                                                        value="512GB">
                                                    <label for="memory-3" class="custom-radio">512GB</label>
                                                </div>

                                            </div>
                                        </div>
                                        <div class="mb-3">
                                            <div class="categories-inline">
                                                <div class="mb-2">
                                                    <input type="radio" class="me-2" id="Color-1" name="Categories-2"
                                                        value="Black">
                                                    <label for="Color-1" class="custom-radio">Đen</label>
                                                </div>
                                                <div class="mb-2">
                                                    <input type="radio" class="me-2" id="Color-2" name="Categories-2"
                                                        value="White">
                                                    <label for="Color-2" class="custom-radio">Trắng</label>
                                                </div>
                                                <div class="mb-2">
                                                    <input type="radio" class="me-2" id="Color-3" name="Categories-2"
                                                        value="Pink">
                                                    <label for="Color-3" class="custom-radio">Hồng</label>
                                                </div>
                                                <div class="mb-2">
                                                    <input type="radio" class="me-2" id="Color-4" name="Categories-2"
                                                        value="Blue">
                                                    <label for="Color-4" class="custom-radio">Xanh Ngọc</label>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- Khuyến mại -->
                                        <div class="promotion-container">
                                            <h6 class="promotion-title">Khuyến mại</h6>
                                            <ul class="promotion-list">
                                                <li>Dán cường lực chính hãng trọn đời sản phẩm.</li>
                                                <li>Tặng ốp bảo vệ trị giá <strong>100.000 đ</strong>.</li>
                                                <li>Tặng gói bảo hành 12 tháng bao gồm cả Nguồn, Màn hình trị giá
                                                    <strong>700.000 đ</strong>. <a href="#" class="learn-more">Tìm
                                                        hiểu</a>.
                                                </li>
                                                <li>Khuyến mại giá trị khác tại <a href="#" class="promo-link">Chương
                                                        trình
                                                        khuyến mại</a>.</li>
                                            </ul>
                                        </div>



                                        <!-- Cam kết -->
                                        <div class="mb-4 commitment-container">
                                            <h6 class="commitment-title">TÁO XANH CAM KẾT</h6>
                                            <ul class="commitment-list">
                                                <li>Thiết bị chưa kích hoạt, nguyên hộp.</li>
                                                <li>Sản phẩm đảm bảo theo Quan điểm chất lượng.</li>
                                                <li>Hỗ trợ bảo hành hãng tuỳ theo chính sách hãng tại thị trường VN.
                                                </li>
                                                <li>Yên tâm mua hàng: Đánh giá của khách hàng.</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <!-- Nút Mua Ngay -->
                                    <a href="#" class="btn btn-danger rounded px-4 py-2 mb-4 mua-ngay">
                                        <i class="fa fa-shopping-bag me-2"></i>Mua Ngay
                                        <p class="m-0">Giao hàng tận nơi</p>
                                    </a>

                                    <!-- Nút Mua Trả Góp -->
                                    <a href="#" class="btn btn-primary rounded px-4 py-2 mb-4 mua-tra-gop">
                                        <i class="fa fa-shopping-bag me-2"></i>Mua Trả Góp
                                        <p class="m-0">Xem thủ tục</p>
                                    </a>

                                </div>
                                <div class="col-lg-12">
                                    <nav>
                                        <div class="nav nav-tabs mb-3">
                                            <button class="nav-link active border-white border-bottom-0" type="button"
                                                role="tab" id="nav-about-tab" data-bs-toggle="tab"
                                                data-bs-target="#nav-about" aria-controls="nav-about"
                                                aria-selected="true">Description</button>
                                            <button class="nav-link border-white border-bottom-0" type="button"
                                                role="tab" id="nav-mission-tab" data-bs-toggle="tab"
                                                data-bs-target="#nav-mission" aria-controls="nav-mission"
                                                aria-selected="false">Reviews</button>
                                        </div>
                                    </nav>
                                    <div class="tab-content mb-5">
                                        <div class="tab-pane active" id="nav-about" role="tabpanel"
                                            aria-labelledby="nav-about-tab">
                                            <p>The generated Lorem Ipsum is therefore always free from repetition
                                                injected
                                                humour, or non-characteristic words etc.
                                                Susp endisse ultricies nisi vel quam suscipit </p>
                                            <p>Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish
                                                snailfish
                                                filefish Antarctic
                                                icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish,
                                                electric
                                                ray sweeper.</p>
                                            <div class="px-2">
                                                <div class="row g-4">
                                                    <div class="col-6">
                                                        <div
                                                            class="row bg-light align-items-center text-center justify-content-center py-2">
                                                            <div class="col-6">
                                                                <p class="mb-0">Weight</p>
                                                            </div>
                                                            <div class="col-6">
                                                                <p class="mb-0">1 kg</p>
                                                            </div>
                                                        </div>
                                                        <div
                                                            class="row text-center align-items-center justify-content-center py-2">
                                                            <div class="col-6">
                                                                <p class="mb-0">Country of Origin</p>
                                                            </div>
                                                            <div class="col-6">
                                                                <p class="mb-0">Agro Farm</p>
                                                            </div>
                                                        </div>
                                                        <div
                                                            class="row bg-light text-center align-items-center justify-content-center py-2">
                                                            <div class="col-6">
                                                                <p class="mb-0">Quality</p>
                                                            </div>
                                                            <div class="col-6">
                                                                <p class="mb-0">Organic</p>
                                                            </div>
                                                        </div>
                                                        <div
                                                            class="row text-center align-items-center justify-content-center py-2">
                                                            <div class="col-6">
                                                                <p class="mb-0">Сheck</p>
                                                            </div>
                                                            <div class="col-6">
                                                                <p class="mb-0">Healthy</p>
                                                            </div>
                                                        </div>
                                                        <div
                                                            class="row bg-light text-center align-items-center justify-content-center py-2">
                                                            <div class="col-6">
                                                                <p class="mb-0">Min Weight</p>
                                                            </div>
                                                            <div class="col-6">
                                                                <p class="mb-0">250 Kg</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane" id="nav-mission" role="tabpanel"
                                            aria-labelledby="nav-mission-tab">
                                            <div class="d-flex">
                                                <img src="/client/img/avatar.jpg" class="img-fluid rounded-circle p-3"
                                                    style="width: 100px; height: 100px;" alt="">
                                                <div class="">
                                                    <p class="mb-2" style="font-size: 14px;">April 12, 2024</p>
                                                    <div class="d-flex justify-content-between">
                                                        <h5>Jason Smith</h5>
                                                        <div class="d-flex mb-3">
                                                            <i class="fa fa-star text-secondary"></i>
                                                            <i class="fa fa-star text-secondary"></i>
                                                            <i class="fa fa-star text-secondary"></i>
                                                            <i class="fa fa-star text-secondary"></i>
                                                            <i class="fa fa-star"></i>
                                                        </div>
                                                    </div>
                                                    <p>The generated Lorem Ipsum is therefore always free from
                                                        repetition
                                                        injected humour, or non-characteristic
                                                        words etc. Susp endisse ultricies nisi vel quam suscipit </p>
                                                </div>
                                            </div>
                                            <div class="d-flex">
                                                <img src="/client/img/avatar.jpg" class="img-fluid rounded-circle p-3"
                                                    style="width: 100px; height: 100px;" alt="">
                                                <div class="">
                                                    <p class="mb-2" style="font-size: 14px;">April 12, 2024</p>
                                                    <div class="d-flex justify-content-between">
                                                        <h5>Sam Peters</h5>
                                                        <div class="d-flex mb-3">
                                                            <i class="fa fa-star text-secondary"></i>
                                                            <i class="fa fa-star text-secondary"></i>
                                                            <i class="fa fa-star text-secondary"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                        </div>
                                                    </div>
                                                    <p class="text-dark">The generated Lorem Ipsum is therefore always
                                                        free from
                                                        repetition injected humour, or non-characteristic
                                                        words etc. Susp endisse ultricies nisi vel quam suscipit </p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane" id="nav-vision" role="tabpanel">
                                            <p class="text-dark">Tempor erat elitr rebum at clita. Diam dolor diam ipsum
                                                et
                                                tempor sit. Aliqu diam
                                                amet diam et eos labore. 3</p>
                                            <p class="mb-0">Diam dolor diam ipsum et tempor sit. Aliqu diam amet diam et
                                                eos
                                                labore.
                                                Clita erat ipsum et lorem et sit</p>
                                        </div>
                                    </div>
                                </div>
                                <form action="#">
                                    <h4 class="mb-5 fw-bold">Leave a Reply</h4>
                                    <div class="row g-4">
                                        <div class="col-lg-6">
                                            <div class="border-bottom rounded">
                                                <input type="text" class="form-control border-0 me-4"
                                                    placeholder="Yur Name *">
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="border-bottom rounded">
                                                <input type="email" class="form-control border-0"
                                                    placeholder="Your Email *">
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="border-bottom rounded my-4">
                                                <textarea name="" id="" class="form-control border-0" cols="30" rows="8"
                                                    placeholder="Your Review *" spellcheck="false"></textarea>
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="d-flex justify-content-between py-3 mb-5">
                                                <div class="d-flex align-items-center">
                                                    <p class="mb-0 me-3">Please rate:</p>
                                                    <div class="d-flex align-items-center" style="font-size: 12px;">
                                                        <i class="fa fa-star text-muted"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </div>
                                                </div>
                                                <a href="#"
                                                    class="btn border border-secondary text-primary rounded-pill px-4 py-3">
                                                    Post Comment</a>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                    <h1 class="fw-bold mb-0">Related products</h1>
                    <div class="vesitable">
                        <div class="owl-carousel vegetable-carousel justify-content-center">
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-6.jpg" class="img-fluid w-100 rounded-top"
                                        alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Parsely</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$4.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-1.jpg" class="img-fluid w-100 rounded-top"
                                        alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Parsely</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$4.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-3.png"
                                        class="img-fluid w-100 rounded-top bg-light" alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Banana</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$7.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-4.jpg" class="img-fluid w-100 rounded-top"
                                        alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Bell Papper</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$7.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-5.jpg" class="img-fluid w-100 rounded-top"
                                        alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Potatoes</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$7.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-6.jpg" class="img-fluid w-100 rounded-top"
                                        alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Parsely</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$7.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-5.jpg" class="img-fluid w-100 rounded-top"
                                        alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Potatoes</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$7.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="border border-primary rounded position-relative vesitable-item">
                                <div class="vesitable-img">
                                    <img src="/client/img/vegetable-item-6.jpg" class="img-fluid w-100 rounded-top"
                                        alt="">
                                </div>
                                <div class="text-white bg-primary px-3 py-1 rounded position-absolute"
                                    style="top: 10px; right: 10px;">Vegetable</div>
                                <div class="p-4 pb-0 rounded-bottom">
                                    <h4>Parsely</h4>
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit sed do eiusmod te
                                        incididunt</p>
                                    <div class="d-flex justify-content-between flex-lg-wrap">
                                        <p class="text-dark fs-5 fw-bold">$7.99 / kg</p>
                                        <a href="#"
                                            class="btn border border-secondary rounded-pill px-3 py-1 mb-4 text-primary"><i
                                                class="fa fa-shopping-bag me-2 text-primary"></i> Add to cart</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Product End -->

            <!-- Back to Top -->
            <a href="#" class="btn btn-primary border-3 border-primary rounded-circle back-to-top"><i
                    class="fa fa-arrow-up"></i></a>
            <jsp:include page="../layout/footer.jsp" />

            <!-- JavaScript Libraries -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
            <script src="/client/lib/easing/easing.min.js"></script>
            <script src="/client/lib/waypoints/waypoints.min.js"></script>
            <script src="/client/lib/lightbox/js/lightbox.min.js"></script>
            <script src="/client/lib/owlcarousel/owl.carousel.min.js"></script>

            <!-- Template Javascript -->
            <script src="/client/js/main.js"></script>
        </body>

        </html>