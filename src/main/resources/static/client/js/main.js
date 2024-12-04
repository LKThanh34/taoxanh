(function ($) {
    "use strict";

    // Đảm bảo jQuery đã sẵn sàng
    $(document).ready(function () {

        // Spinner
        var spinner = function () {
            setTimeout(function () {
                if ($('#spinner').length > 0) {
                    $('#spinner').removeClass('show');
                }
            }, 1);
        };
        spinner();

        // Fixed Navbar
        $(window).scroll(function () {
            var scrollTop = $(this).scrollTop();
            var $fixedTop = $('.fixed-top');

            if ($(window).width() < 992) {
                if (scrollTop > 55) {
                    $fixedTop.addClass('shadow');
                } else {
                    $fixedTop.removeClass('shadow');
                }
            } else {
                if (scrollTop > 55) {
                    $fixedTop.addClass('shadow').css('top', -55);
                } else {
                    $fixedTop.removeClass('shadow').css('top', 0);
                }
            }
        });

        // Back to top button
        $(window).scroll(function () {
            if ($(this).scrollTop() > 300) {
                $('.back-to-top').fadeIn('slow');
            } else {
                $('.back-to-top').fadeOut('slow');
            }
        });

        $('.back-to-top').click(function () {
            $('html, body').animate({ scrollTop: 0 }, 1500, 'easeInOutExpo');
            return false;
        });

        // Testimonial carousel
        $(".testimonial-carousel").owlCarousel({
            smartSpeed: 2000,
            center: false,
            dots: true,
            loop: true,
            margin: 25,
            nav: true,
            navText: [
                '<i class="bi bi-arrow-left"></i>',
                '<i class="bi bi-arrow-right"></i>'
            ],
            responsiveClass: true,
            responsive: {
                0: { items: 1 },
                576: { items: 1 },
                768: { items: 1 },
                992: { items: 2 },
                1200: { items: 2 }
            }
        });

        // Vegetable carousel
        $(".vegetable-carousel").owlCarousel({
            smartSpeed: 1500,
            center: false,
            dots: true,
            loop: true,
            margin: 25,
            nav: true,
            navText: [
                '<i class="bi bi-arrow-left"></i>',
                '<i class="bi bi-arrow-right"></i>'
            ],
            responsiveClass: true,
            responsive: {
                0: { items: 1 },
                576: { items: 1 },
                768: { items: 2 },
                992: { items: 3 },
                1200: { items: 4 }
            }
        });

        // Modal Video
        var $videoSrc;
        $('.btn-play').click(function () {
            $videoSrc = $(this).data("src");
        });

        $('#videoModal').on('shown.bs.modal', function () {
            $("#video").attr('src', $videoSrc + "?autoplay=1&modestbranding=1&showinfo=0");
        });

        $('#videoModal').on('hide.bs.modal', function () {
            $("#video").attr('src', $videoSrc);
        });

        // Product Quantity
        $('.quantity button').on('click', function () {
            var button = $(this);
            var oldValue = button.parent().parent().find('input').val();
            var newVal;

            if (button.hasClass('btn-plus')) {
                newVal = parseFloat(oldValue) + 1;
            } else {
                newVal = (oldValue > 0) ? parseFloat(oldValue) - 1 : 0;
            }

            button.parent().parent().find('input').val(newVal);
        });

    });

})(jQuery);
