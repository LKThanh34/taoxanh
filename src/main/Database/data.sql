use taoxanh;

INSERT INTO roles (id, role_description, role_name) 
VALUES 
(1, 'Quản trị viên hệ thống', 'ADMIN'),
(2, 'Người dùng thông thường', 'USER'),
(3, 'Người quản lý nội dung', 'STAFF');

insert into categories( category_image, category_name)
values
('iphone.png','IPHONE'),
('ipad.png','IPAD'),
('watch.png','WATCH'),
('macbook.png','MACBOOK'),
('phukien.png','ACCESSORIES');

insert into product_generations(generation_name, category_id, generation_status)
values
('Iphone 16 Series', 1, 'new' ),
('Iphone 15 Series', 1, 'hot'),
('Iphone 14 Series', 1, 'hot'),
('Iphone 13 Series', 1, 'hot'),
('Iphone 12 Series', 1, 'hot'),
('Iphone 11 Series', 1, 'hot'),
('Iphone X Series', 1, 'KM'),
('Macbook M1 Series', 4, 'KM'),
('Macbook M2 Series', 4, 'hot'),
('Macbook M3 Series', 4, 'hot'),
('Ipad 5 Series', 2, 'KM'),
('Ipad 6 Series', 2, 'hot'),
('Ipad 7 Series', 2, 'hot'),
('Apple Watch 7 Series', 3, 'KM'),
('Apple Watch 8 Series', 3, 'KM'),
('Apple Watch 9 Series', 3, 'hot'),
('Apple Watch 10 Series', 3, 'hot'),
('Airpods 3', 5, 'hot'),
('Airpods 2', 5, 'KM'),
('Airpods 4', 5, 'hot');

insert into attributes(attribute_name)
values
('Color'),
('model'),
('Storage'),
('Ram'),
('processor'),
('screen');
insert into attribute_values(attribute_id, attribute_value)
values 
(1, 'Black'),
(1, 'White'),
(1, 'Yellow'),
(1, 'Green'),
(1, 'Pink'),
(1, 'Titan'),
(3, '128GB'),
(3, '512GB'),
(3, '1TB'),
(4, '8GB'),
(4, '16GB'),
(4, '36GB'),
(6, '14 inch'),
(6, '16 inch');
insert into products(product_name, generation_id, category_id)
values
('iPhone 16 Plus',1,1);

insert into product_variant(product_id, attribute_value_id,stock_quantity)
values
(1,1,10),
(1,2,10),
(1,3,10),
(1,7,10),
(1,8,10),
(1,9,10);