use W_Store
go

-- data table ThuongHieu
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Casio', 'logo-Casio.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Bonest Gatti', 'logo-Bonest-Gatti.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Bentley', 'logo-bentley.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Bulova', 'logo-bulova.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Calvin Klein', 'logo-Calvin-Klein.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Carnival', 'logo-carnival.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Certina', 'logo-Certina.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Citizen', 'logo-citizen.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Daniel Klein', 'logo-Daniel-Klein.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Daniel Wellington', 'logo-dw.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Fossil', 'logo-Fossil.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Frederique Constant', 'logo-Frederique-Constant.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Freelook', 'logo-Freelook.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Longines', 'logo-Longines.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Maurice Lacroix', 'logo-Maurice-Lacroix.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Mido', 'logo-Mido.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Montblanc', 'logo-Montblanc.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Movado', 'logo-Movado.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Ogival', 'logo-Ogival.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Olym Pianus', 'logo-Olym-Pianus.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Omega', 'logo-Omega.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Orient', 'logo-orient.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Q&Q', 'logo-qq.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Seiko', 'logo-seiko.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('SevenFriday', 'logo-SevenFriday.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('SRWatch', 'logo-SRWatch.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Thomas Earnshaw', 'logo-Thomas-Earnshaw.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Tissot', 'logo-Tissot.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Versace', 'logo-Versace.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Zenith', 'logo-Zenith.jpg', default);
go

	select * from ThuongHieu

-- data table DongSanPham
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio G - Shock', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Baby - G', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Edifice', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Sheen', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio MTP', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Vintage', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio LTP', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Protrek', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bentley nam', 3, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bentley nữ', 3, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bentley automat', 3, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Curv', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Rubaiyat', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Precisionist', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Oceanographer', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Military', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Military', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Glam', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Subtle', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Hypnotic', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein High Noon', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Minimal', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Heritage Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Sport Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Aqua Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Urban Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Citizen Eco-drive', 8, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Citizen C7', 8, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Citizen Sunrise Diamond', 8, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Klein Trendy', 9, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Klein Premium', 9, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Klein Premium Ladies', 9, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Classic Black', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Classic Petite', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Quadro', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Iconic Link', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington 5-Link', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Manufacture', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Classic', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Horological Smartwatch', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Runabout', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Vintage Rally', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Lumiere', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Rein', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Belle', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Eiffel', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Elite', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Elegance', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Watchmaking Tradition', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Avigation', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Diving', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Performance', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Maurice Lacroix Masterpiece', 15, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Maurice Lacroix Aikon', 15, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Maurice Lacroix Pontos', 15, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido RAINFLOWER', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido BARONCELLI', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido BELLUNA', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido MULTIFORT', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido COMMANDER', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido OCEAN STAR', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido ALL DIAL', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Movado Ultra Slim', 18, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Movado Museum', 18, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Movado Bold', 18, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Ogival Ultra-thin', 19, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Ogival Jewelry', 19, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Ogival Painted', 19, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Speedmaster Professional', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Constellation Grand Luxe', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Ploprof', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Marine', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Ploprof', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Seamaster Aqua Terra', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Seamaster Professional 300M', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Star', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Sun and Moon', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient SK', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient 3sao', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Mako 3', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Bambinc', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Golden eye', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko 5', 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Solar' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Kinetic' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Chronograph' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Spot' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Presage' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Prospex' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Premier' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Grand Seiko' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday P Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday M Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday V Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday Q Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday S Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SRWatch Quartz ' , 26, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SRWatch Automatic ' , 26, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SRWatch Solar Movt ' , 26, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Prx' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Le Locle' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Luxury' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Chemin Des Tourelles' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot 18K Gold' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot T-Wave' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Daphnis' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Palazzo Empire' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace V-circle Manifesto' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Vanity' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Olympo' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Vanitas' , 29, default);
go


select * from DongSanPham


-- data table DongMay
insert into DongMay(ten_dong_may, trang_thai) values (N'Cơ/Automatic',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Điện tử',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Năng lượng mặt trời',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Pin/Quartz',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Eco Drive',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Powermatic 80',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Seiko 4R35A',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Seiko 4R36A',default);
go

select * from DongMay

-- data table ChatLieuDay
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây da', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây kim loại', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây cao su', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây dù/vải', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây nhựa', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây nhựa phối kim loại', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây thép không gỉ mạ vàng PVD', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây titanium', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây thép không gỉ', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Silicon', default);
go


-- data table ChatLieuKinh
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Kính Sappire', default);
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Kính nhựa', default);
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Kính khoáng', default);
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Hardlex Crystal', default);
go


-- data table ChatLieuVo
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Mạ vàng', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vỏ nhựa', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vỏ thép không gỉ', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Thép không gỉ mạ vàng PVD', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vàng & thép không gỉ', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vỏ Titanium', default);
go

SELECT * from ChatLieuVo

-- data table XuatXu
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Afghanistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Albania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Algeria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Samoa thuộc Mỹ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Andorra',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Angola',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Anguilla',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Antarctica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Antigua và Barbuda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Argentina',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Armenia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Aruba',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Úc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Áo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Azerbaijan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bahamas',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bahrain',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bangladesh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Barbados',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Belarus',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bỉ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Belize',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Benin',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bermuda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bhutan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bolivia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bonaire',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bosnia và Herzegovina',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Botswana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Bouvet',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Brazil',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lãnh thổ Ấn Độ Dương thuộc Anh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nhà nước Brunei Darussalam',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bulgaria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Burkina Faso',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Burundi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Campuchia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cameroon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Canada',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cape Verde',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Cayman',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Trung Phi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sát (Tchad)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Chile',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Trung Quốc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Giáng Sinh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Cocos',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Colombia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Comoros',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cộng hòa Congo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cộng hòa Dân chủ Congo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Cook',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Costa Rica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Croatia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cuba',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Curacao',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Síp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Séc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bờ Biển Ngà',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đan Mạch',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Djibouti',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Dominica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cộng hòa Dominica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ecuador',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ai Cập',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'El Salvador',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guinea Xích Đạo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Eritrea',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Estonia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ethiopia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Falkland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Faroe',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Fiji',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Phần Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guiana thuộc Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Polynesia thuộc Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Vùng đất phía Nam và châu Nam Cực thuộc Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Gabon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Gambia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Georgia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đức',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ghana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Gibraltar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hy Lạp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Một quốc gia tự trị thuộc Đan Mạch',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Grenada',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guadeloupe',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Guam',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guatemala',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guernsey',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guinea',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guinea-Bissau',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guyana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Haiti',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Heard và quần đảo McDonald',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tòa thánh Vatican',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Honduras',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hồng Kông',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hungary',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Iceland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ấn Độ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Indonesia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Iran',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Iraq',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ireland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Man',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Israel',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ý',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Jamaica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nhật Bản',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Jersey',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Jordan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kazakhstan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kenya',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kiribati',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Triều tiên',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hàn Quốc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kuwait',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kyrgyzstan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lào',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Latvia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lebanon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lesotho',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Liberia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Libya',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Liechtenstein',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lithuania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Luxembourg',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Macao',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Macedonia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Madagascar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Malawi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Malaysia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Maldives',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mali',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Malta',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Marshall',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Martinique',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mauritania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mauritius',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mayotte',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mexico',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Liên bang Micronesia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Moldova',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Monaco',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mông Cổ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Montenegro',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Montserrat',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ma Rốc (Maroc)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mozambique',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Myanmar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Namibia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nauru',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nepal',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hà Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'New Caledonia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'New Zealand',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nicaragua',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Niger',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nigeria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Niue',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Norfolk',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Bắc Mariana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Na Uy',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Oman',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Pakistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Palau',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Palestine',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Panama',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Papua New Guinea',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Paraguay',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Peru',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Philippines',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Pitcairn',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ba Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bồ Đào Nha',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Puerto Rico',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Qatar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Romania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nga',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Rwanda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Reunion',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Barthelemy',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Helena',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Kitts và Nevis',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Lucia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Martin (French part)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Pierre và Miquelon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Vincent và the Grenadines',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Samoa',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'San Marino',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sao Tome và Principe',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ả Rập Xê Út',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Senegal',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Serbia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Seychelles',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sierra Leone',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Singapore',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sint Maarten',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Slovakia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Slovenia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Solomon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Somalia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nam Phi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nam Georgia và Quần đảo Nam Sandwich',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nam Sudan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tây Ban Nha',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sri Lanka',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sudan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Suriname',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Svalbard và Jan Mayen',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Swaziland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thụy Điển',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thụy Sĩ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Syria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đài Loan ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tajikistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tanzania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thái Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đông Timor',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Togo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tokelau',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tonga',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Trinidad và Tobago',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tunisia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thổ Nhĩ Kỳ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Turkmenistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Turks và Caicos',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tuvalu',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Uganda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ukraine',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Các tiểu vương quốc Ả Rập Thống nhất',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Vương quốc Liên hiệp Anh và Bắc Ireland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mỹ (Hoa Kỳ)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Các tiểu đảo xa của Hoa Kỳ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Uruguay',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Uzbekistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Vanuatu',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Venezuela',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Việt Nam',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Virgin thuộc Anh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Virgin thuộc Mỹ ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Wallis và Futuna',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tây Sahara',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Yemen',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Zambia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Zimbabwe',default);
go

select * from XuatXu



-- data table PhongCach
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Sang trọng',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Quân đội',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Lộ đáy',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Classic cổ điển',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Thời trang',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Lộ máy',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Hở tim lộ đáy',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Thể thao',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Trẻ trung',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Cá tính',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Chuyên dụng',default);
insert into PhongCach(ten_phong_cach, trang_thai) values (N'Phiên bản giới hạn',default);
go

select * from PhongCach


-- data table Mau
insert into Mau(ten_mau, trang_thai) values (N'Xanh', default);
insert into Mau(ten_mau, trang_thai) values (N'Trắng', default);
insert into Mau(ten_mau, trang_thai) values (N'Đen', default);
insert into Mau(ten_mau, trang_thai) values (N'Chải tia', default);
insert into Mau(ten_mau, trang_thai) values (N'Đỏ', default);
insert into Mau(ten_mau, trang_thai) values (N'Vàng', default);
insert into Mau(ten_mau, trang_thai) values (N'Nâu', default);
insert into Mau(ten_mau, trang_thai) values (N'Cát vàng', default);
insert into Mau(ten_mau, trang_thai) values (N'Xanh lục', default);
insert into Mau(ten_mau, trang_thai) values (N'Khảm trai', default);
insert into Mau(ten_mau, trang_thai) values (N'Hồng', default);
insert into Mau(ten_mau, trang_thai) values (N'Tím', default);
insert into Mau(ten_mau, trang_thai) values (N'Xám', default);
insert into Mau(ten_mau, trang_thai) values (N'Rằn ri', default);
insert into Mau(ten_mau, trang_thai) values (N'Cam', default);
insert into Mau(ten_mau, trang_thai) values (N'Be', default);
insert into Mau(ten_mau, trang_thai) values (N'Bạc', default);
insert into Mau(ten_mau, trang_thai) values (N'Đen hồng', default);
insert into Mau(ten_mau, trang_thai) values (N'Ngọc trai', default);
insert into Mau(ten_mau, trang_thai) values (N'Xanh đen', default);
insert into Mau(ten_mau, trang_thai) values (N'Xanh da trời', default);
insert into Mau(ten_mau, trang_thai) values (N'Xám ghi', default);
insert into Mau(ten_mau, trang_thai) values (N'Đa sắc màu', default);
insert into Mau(ten_mau, trang_thai) values (N'Vàng hồng', default);
insert into Mau(ten_mau, trang_thai) values (N'Đen bóng', default);
insert into Mau(ten_mau, trang_thai) values (N'Ghi', default);
insert into Mau(ten_mau, trang_thai) values (N'Trong suốt', default);
go

select * from Mau

-- data table TinhNang
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Kết nối Bluetooth', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'World Time', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Báo thức', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đồng hồ bấm giờ', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đo nhịp tim', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đếm bước chân', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Chronograph', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Dạ quang', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'3 mặt 6 kim', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'La bàn', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Nhiệt kế', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch thứ', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch ngày', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch tuần trăng', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch vạn niên', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Kim xăng', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Radio Controlled', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Giờ, phút, giây', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Tachymeter', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Giờ, phút', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Dual Time', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Small Second', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch tháng', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch 24 giờ', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch năm', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đèn Led', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Driver', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Giờ GMT', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Perpetual Calendar', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Word Map', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch ngày đêm', default);
go

select * from Mau

-- data table SanPham
select * from SanPham
select * from DongMay


insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000001',	1,	'LA-20WH-4A1DF',	459000,	510000,	5,	'LA-20WH-4A1DF.jpg',	N'Nữ',	null,	3,	null,	30.4,	N'Mặt vuông',	8.6,	2,	5,	2,	111,	2,	11,	22,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000002',	1,	'LTP-V300L-4AUDF',	1080000,	1200000,	5,	'LTP-V300L-4AUDF.jpg',	N'Nữ',	'Casio LTP',	3,	null,	33.2,	N'Mặt tròn',	8.2,	4,	1,	3,	111,	3,	17,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000003',	1,	'A159WAD-1DF',	918000,	1020000,	5,	'A159WAD-1DF.jpg',	N'Unisex',	null,	3,	null,	33.2,	N'Mặt chữ nhật',	9.7,	2,	2,	2,	111,	2,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000004',	1,	'F-94WA-9DG',	351000,	390000,	5,	'F-94WA-9DG.jpg',	N'Unisex',	null,	3,	null,	33.2,	N'Mặt vuông',	8.5,	4,	5,	2,	111,	2,	3,	22,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000005',	1,	'W-218HC-4A2VDF',	576000,	640000,	5,	'W-218HC-4A2VDF.jpg',	N'Unisex',	null,	5,	null,	43.2,	N'Mặt vuông',	11,	4,	5,	2,	111,	2,	1,	22,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000006',	1,	'LA670WEM-7DF',	918000,	1020000,	5,	'LA670WEM-7DF.jpg',	N'Nữ',	null,	3,	null,	24.6,	N'Mặt vuông',	7.3,	2,	2,	2,	111,	2,	17,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000007',	1,	'MTP-1384L-1AVDF',	1467000,	1630000,	5,	'MTP-1384L-1AVDF.jpg',	N'Nam',	'Casio MTP',	10,	null,	41,	N'Mặt tròn',	10,	4,	1,	3,	111,	4,	24,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000008',	20,	'OP990-45.24ADGS-D',	5553000,	6170000,	5,	'OP990-45.24ADGS-D.jpg',	N'Nam',	null,	5,	null,	42,	N'Mặt tròn',	10.3,	1,	2,	1,	111,	3,	17,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000009',	20,	'OP89322GS-X',	2862000,	3180000,	5,	'OP89322GS-X.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000010',	20,	'OP990-45DDGS-T',	4536000,	5040000,	5,	'OP990-45DDGS-T.jpg',	N'Nữ',	null,	5,	null,	34,	N'Mặt tròn',	null,	4,	2,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000011',	20,	'OP89322AMS-X',	3744000,	4160000,	5,	'OP89322AMS-X.jpg',	N'Nam',	null,	3,	null,	36,	N'Mặt tròn',	11,	1,	2,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000012',	20,	'OP89322AMS-T',	3744000,	4160000,	5,	'OP89322AMS-T.jpg',	N'Nam',	null,	3,	null,	36,	N'Mặt tròn',	null,	1,	2,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000013',	20,	'OP990-45.24ADGS-GL-D',	5553000,	6170000,	5,	'OP990-45.24ADGS-GL-D.jpg',	N'Nam',	null,	5,	40,	42,	N'Mặt tròn',	11.5,	1,	3,	1,	111,	3,	17,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000014',	20,	'OP89322AGS-D',	3528000,	3920000,	5,	'OP89322AGS-D.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	1,	2,	1,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000015',	20,	'OP990-45DGS-GL-T',	4140000,	4600000,	5,	'OP990-45DGS-GL-T.jpg',	N'Nữ',	null,	5,	null,	34,	N'Mặt tròn',	null,	4,	3,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000016',	8,	'BM8475-00F',	3339000,	3710000,	5,	'BM8475-00F.jpg',	N'Nam',	null,	10,	null,	42,	N'Mặt tròn',	11,	5,	4,	3,	111,	3,	3,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000017',	8,	'NH8350-08A',	3708000,	4120000,	5,	'NH8350-08A.jpg',	N'Nam',	null,	5,	40,	40,	N'Mặt tròn',	11.5,	1,	1,	3,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000018',	8,	'AW1591-01L',	4572000,	5080000,	5,	'AW1591-01L.jpg',	N'Nam',	null,	10,	null,	43,	N'Mặt tròn',	12.2,	5,	1,	3,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000019',	8,	'EX1484-57D',	3780000,	4200000,	5,	'EX1484-57D.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	7,	5,	2,	1,	111,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000020',	8,	'AU1062-05E',	3573000,	3970000,	5,	'AU1062-05E.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	8,	5,	1,	3,	111,	4,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000021',	8,	'FE1140-86X',	2835000,	3150000,	5,	'FE1140-86X.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	null,	5,	2,	3,	null,	3,	17,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000022',	22,	'FAG03001D0',	6291000,	6990000,	5,	'FAG03001D0.jpg',	N'Nam',	'Orient Golden Eye',	5,	40,	38.5,	N'Mặt tròn',	10.8,	1,	2,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000023',	22,	'RA-AK0007S10B',	9099000,	10110000,	5,	'RA-AK0007S10B.jpg',	N'Nam',	'Sun & Moon',	5,	40,	42.5,	N'Mặt tròn',	null,	1,	1,	1,	111,	4,	6,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000024',	22,	'RA-KA0005A00B',	5490000,	6100000,	5,	'RA-KA0005A00B.jpg',	N'Nữ',	'Sun & Moon',	5,	null,	35,	N'Mặt tròn',	null,	4,	1,	1,	111,	3,	17,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000025',	22,	'FAG03002B0',	6345000,	7050000,	5,	'FAG03002B0.jpg',	N'Nam',	'Orient Golden Eye',	5,	40,	38.5,	N'Mặt tròn',	10.8,	1,	2,	1,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000026',	22,	'FAG02004B0',	4581000,	5090000,	5,	'FAG02004B0.jpg',	N'Nam',	null,	5,	null,	41,	N'Mặt tròn',	12,	1,	1,	3,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000027',	22,	'RA-AS0010S10B',	9513000,	10570000,	5,	'RA-AS0010S10B.jpg',	N'Nam',	'Sun & Moon',	5,	40,	42,	N'Mặt tròn',	14,	1,	1,	1,	111,	4,	6,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000028',	24,	'SNKK11K1',	3033000,	3370000,	5,	'SNKK11K1.jpg',	N'Nam',	'Seiko 5',	3,	40,	38,	N'Mặt tròn',	11,	1,	2,	4,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000029',	24,	'SNKP15J1',	3978000,	4420000,	5,	'SNKP15J1.jpg',	N'Nam',	'Seiko 5',	5,	40,	42,	N'Mặt tròn',	11,	1,	2,	4,	111,	3,	null,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000030',	24,	'SNZG07J1',	5301000,	5890000,	5,	'SNZG07J1.jpg',	N'Nam',	'Seiko 5 Sport',	null,	40,	42,	N'Mặt tròn',	11,	1,	4,	4,	111,	3,	17,	8,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000031',	24,	'SNKP17J1',	3915000,	4350000,	5,	'SNKP17J1.jpg',	N'Nam',	'Seiko 5',	5,	40,	42,	N'Mặt tròn',	11,	1,	2,	4,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000032',	24,	'SUR638P1',	3402000,	3780000,	5,	'SUR638P1.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	8,	4,	1,	1,	111,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000033',	24,	'SRPD53K1',	7551000,	8390000,	5,	'SRPD53K1.jpg',	N'Nam',	'Seiko 5 Sport',	10,	40,	42.5,	N'Mặt tròn',	13.4,	8,	2,	4,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000034',	3,	'BL1869-101MKNN',	2835000,	3150000,	5,	'BL1869-101MKNN.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	8.5,	4,	1,	1,	82,	4,	6,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000035',	3,	'BL1865-30MKWB',	2457000,	2730000,	5,	'BL1865-30MKWB.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	5,	4,	1,	1,	82,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000036',	3,	'BL1784-252KBB-S2-M',	7731000,	8590000,	5,	'BL1784-252KBB-S2-M.jpg',	N'Nam',	null,	5,	null,	43,	N'Mặt tròn',	13.5,	1,	1,	1,	82,	4,	6,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000037',	3,	'BL1869-101MWBI',	3024000,	3360000,	5,	'BL1869-101MWBI.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	82,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000038',	3,	'BL1831-15MKWD',	5436000,	6040000,	5,	'BL1831-15MKWD.jpg',	N'Nam',	null,	5,	null,	41,	N'Mặt tròn',	12,	1,	1,	1,	82,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000039',	3,	'BL1869-101MWWI',	3024000,	3360000,	5,	'BL1869-101MWWI.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	82,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000040',	4,	'98A187',	4950000,	5500000,	5,	'98A187.jpg',	N'Nam',	null,	3,	null,	41,	N'Mặt tròn',	null,	1,	2,	3,	null,	3,	17,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000041',	4,	'98C134',	6057000,	6730000,	5,	'98C134.jpg',	N'Nam',	null,	3,	null,	41.5,	N'Đa giác',	9.8,	4,	2,	3,	235,	3,	3,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000042',	4,	'96P197',	3366000,	3740000,	5,	'96P197.jpg',	N'Nữ',	null,	3,	null,	35,	N'Mặt tròn',	8.4,	4,	1,	1,	111,	3,	17,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000043',	4,	'98P157',	3060000,	3400000,	5,	'98P157.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt tròn',	6.5,	4,	1,	1,	215,	3,	null,	12,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000044',	4,	'96C142',	8685000,	9650000,	5,	'96C142.jpg',	N'Nam',	null,	3,	null,	43,	N'Mặt tròn',	null,	1,	1,	1,	235,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000045',	4,	'98L232',	2808000,	3120000,	5,	'98L232.jpg',	N'Nữ',	null,	3,	null,	32,	N'Mặt tròn',	7,	4,	2,	3,	235,	3,	17,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000046',	26,	'SG8886.4103AT',	2997000,	3330000,	5,	'SG8886.4103AT.jpg',	N'Nam',	null,	5,	40,	40,	N'Mặt tròn',	11.7,	1,	1,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000047',	26,	'SG3003.4601CV',	1008000,	1120000,	5,	'SG3003.4601CV.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	5,	4,	1,	1,	111,	4,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000048',	26,	'SG2205.4601',	2259000,	2510000,	5,	'SG2205.4601.jpg',	N'Nam',	null,	5,	null,	31,	N'Mặt chữ nhật',	null,	4,	1,	1,	111,	3,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000049',	26,	'SG3002.4601CV',	1008000,	1120000,	5,	'SG3002.4601CV.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	5,	4,	1,	1,	111,	4,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000050',	26,	'SL3005.1102CV',	927000,	1030000,	5,	'SL3005.1102CV.jpg',	N'Nữ',	null,	5,	null,	30,	N'Mặt tròn',	null,	4,	2,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000051',	26,	'SG1056.4602TE',	1458000,	1620000,	5,	'SG1056.4602TE.jpg',	N'Nam',	null,	5,	null,	39,	N'Mặt tròn',	null,	4,	1,	1,	111,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000052',	26,	'SG8895.4101',	4275000,	4750000,	5,	'SG8895.4101.jpg',	N'Nam',	null,	5,	40,	40,	N'Mặt tròn',	11.7,	1,	1,	1,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000053',	10,	'DW00100368',	3402000,	3780000,	5,	'DW00100368.jpg',	N'Nữ',	null,	3,	null,	28,	N'Mặt tròn',	null,	4,	2,	3,	null,	null,	24,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000054',	10,	'DW00100647',	2934000,	3260000,	5,	'DW00100647.jpg',	N'Nữ',	null,	3,	null,	28,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	24,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000055',	10,	'DW00100646',	4896000,	5440000,	5,	'DW00100646.jpg',	N'Nam',	null,	5,	null,	42,	N'Mặt tròn',	null,	4,	1,	3,	null,	null,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000056',	10,	'DW00100626',	4572000,	5080000,	5,	'DW00100626.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	1,	3,	null,	null,	24,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000057',	10,	'DW00100625',	4077000,	4530000,	5,	'DW00100625.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000058',	10,	'DW00100622',	4077000,	4530000,	5,	'DW00100622.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000059',	10,	'DW00100621',	4455000,	4950000,	5,	'DW00100621.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	24,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000060',	10,	'DW00100620',	4455000,	4950000,	5,	'DW00100620.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000061',	28,	'T006.407.36.053.00',	12546000,	13940000,	5,	'T006.407.36.053.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	1,	1,	215,	4,	24,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000062',	28,	'T137.407.11.051.00',	13410000,	14900000,	5,	'T137.407.11.051.00.jpg',	N'Nam',	'Tissot Prx',	10,	80,	40,	N'Mặt tròn',	10.9,	6,	2,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000063',	28,	'T006.407.22.033.00',	15435000,	17150000,	5,	'T006.407.22.033.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000064',	28,	'T006.407.16.033.00',	11250000,	12500000,	5,	'T006.407.16.033.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	1,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000065',	28,	'T086.407.11.061.00',	7650000,	8500000,	5,	'T086.407.11.061.00.jpg',	N'Nam',	null,	5,	80,	41,	N'Mặt tròn',	9.8,	6,	2,	1,	215,	3,	17,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000066',	28,	'T006.407.22.036.00',	17010000,	18900000,	5,	'T006.407.22.036.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000067',	28,	'T065.430.22.031.00',	8100000,	9000000,	5,	'T065.430.22.031.00.jpg',	N'Nam',	null,	3,	null,	39.7,	N'Mặt tròn',	9.5,	1,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000068',	12,	'FC-200MC12B',	19827000,	22030000,	5,	'FC-200MC12B.jpg',	N'Nữ',	null,	3,	null,	23,	N'Mặt chữ nhật',	5.5,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000069',	12,	'FC-303BN5B6B',	24066000,	26740000,	5,	'FC-303BN5B6B.jpg',	N'Nam',	null,	5,	38,	40,	N'Mặt tròn',	10.2,	1,	2,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000070',	12,	'FC-310MC4S36',	29439000,	32710000,	5,	'FC-310MC4S36.jpg',	N'Nam',	null,	3,	null,	33,	N'Mặt chữ nhật',	null,	1,	1,	1,	null,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000071',	12,	'FC-718NWM4H6',	82323000,	91470000,	5,	'FC-718NWM4H6.jpg',	N'Nam',	null,	5,	42,	42,	N'Mặt tròn',	12.1,	1,	1,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000072',	12,	'FC-220MPW3BD26',	55998000,	62220000,	5,	'FC-220MPW3BD26.jpg',	N'Nữ',	null,	5,	null,	36,	N'Mặt tròn',	5,	4,	1,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000073',	12,	'FC-303MLG5B4',	25956000,	28840000,	5,	'FC-303MLG5B4.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	11,	1,	1,	1,	215,	3,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000074',	12,	'FC-303MV5B4',	25956000,	28840000,	5,	'FC-303MV5B4.jpg',	N'Nam',	null,	5,	38,	40,	N'Mặt tròn',	10,	1,	1,	1,	215,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000075',	14,	'L4.809.5.77.7',	39105000,	43450000,	5,	'L4.809.5.77.7.jpg',	N'Nam',	null,	3,	64,	34.5,	N'Mặt tròn',	8,	1,	2,	1,	215,	3,	24,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000076',	14,	'L3.742.3.56.7',	29160000,	32400000,	5,	'L3.742.3.56.7.jpg',	N'Nam',	null,	30,	null,	41,	N'Mặt tròn',	null,	1,	2,	1,	215,	3,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000077',	14,	'L2.821.5.57.2',	45450000,	50500000,	5,	'L2.821.5.57.2.jpg',	N'Nam',	null,	3,	72,	40,	N'Mặt tròn',	10.8,	1,	1,	1,	215,	5,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000078',	14,	'L3.781.4.96.9',	31950000,	35500000,	5,	'L3.781.4.96.9.jpg',	N'Nam',	null,	30,	null,	41,	N'Mặt tròn',	null,	1,	3,	1,	null,	3,	1,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000079',	14,	'L4.921.2.18.8',	27270000,	30300000,	5,	'L4.921.2.18.8.jpg',	N'Nam',	null,	3,	null,	38.5,	N'Mặt tròn',	12,	1,	2,	1,	215,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000080',	14,	'L2.773.4.92.6',	71280000,	79200000,	5,	'L2.773.4.92.6.jpg',	N'Nam',	null,	3,	50,	42,	N'Mặt tròn',	14,	1,	2,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000081',	14,	'L2.820.4.57.2',	40050000,	44500000,	5,	'L2.820.4.57.2.jpg',	N'Nam',	null,	3,	72,	38.5,	N'Mặt tròn',	10.7,	1,	1,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000082',	14,	'L4.921.2.42.2',	25110000,	27900000,	5,	'L4.921.2.42.2.jpg',	N'Nam',	null,	3,	64,	38.5,	N'Mặt tròn',	9,	1,	1,	1,	215,	3,	6,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000083',	14,	'L2.798.5.72.7',	56700000,	63000000,	5,	'L2.798.5.72.7.jpg',	N'Nam',	null,	5,	50,	42,	N'Mặt tròn',	null,	1,	2,	1,	215,	1,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000084',	7,	'C029.807.22.031.00',	18333000,	20370000,	5,	'C029.807.22.031.00.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	null,	1,	2,	1,	215,	3,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000085',	7,	'C029.807.22.081.00',	18333000,	20370000,	5,	'C029.807.22.081.00.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	11,	1,	2,	1,	215,	3,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000086',	7,	'C014.407.11.081.01',	16074000,	17860000,	5,	'C014.407.11.081.01.jpg',	N'Nam',	null,	20,	null,	40,	N'Mặt tròn',	12,	1,	2,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000087',	7,	'C024.410.11.031.20',	9792000,	10880000,	5,	'C024.410.11.031.20.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	9.5,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000088',	7,	'C029.807.16.031.60',	16074000,	17860000,	5,	'C029.807.16.031.60.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	11,	1,	1,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000089',	7,	'C036.407.11.050.01',	20205000,	22450000,	5,	'C036.407.11.050.01.jpg',	N'Nam',	null,	20,	null,	43,	N'Mặt tròn',	12,	1,	2,	1,	215,	3,	3,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000090',	7,	'C035.007.22.117.02',	16074000,	17860000,	5,	'C035.007.22.117.02.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	null,	1,	2,	1,	null,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000091',	21,	'220.12.38.20.01.001',	74700000,	83000000,	5,	'220.12.38.20.01.001.jpg',	N'Nam',	null,	15,	null,	38,	N'Mặt tròn',	null,	1,	1,	1,	215,	3,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000092',	21,	'424.13.40.20.03.002',	53100000,	59000000,	5,	'424.13.40.20.03.002.jpg',	N'Nam',	'De ville',	3,	null,	39.5,	N'Mặt tròn',	null,	1,	1,	1,	215,	3,	null,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000093',	21,	'231.20.39.21.55.003',	150300000,	167000000,	5,	'231.20.39.21.55.003.jpg',	N'Nam',	null,	15,	60,	38.5,	N'Mặt tròn',	null,	null,	2,	1,	215,	5,	null,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000094',	21,	'326.30.40.50.01.002',	62550000,	69500000,	5,	'326.30.40.50.01.002.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	null,	1,	9,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000095',	21,	'424.13.40.20.03.001',	41400000,	46000000,	5,	'424.13.40.20.03.001.jpg',	N'Nam',	'De ville',	3,	null,	39.5,	N'Mặt tròn',	null,	1,	1,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000096',	21,	'433.53.41.21.13.001',	179100000,	199000000,	5,	'433.53.41.21.13.001.jpg',	N'Nam',	'De ville',	10,	60,	41,	N'Mặt tròn',	13,	1,	1,	1,	215,	null,	24,	7,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000097',	19,	'OG380-46DLW',	11133000,	12370000,	5,	'OG380-46DLW.jpg',	N'Nữ',	null,	3,	null,	30,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	2,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000098',	19,	'OG377DLW-T-COC',	11475000,	12750000,	5,	'OG377DLW-T-COC.jpg',	N'Nữ',	null,	3,	null,	30,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000099',	19,	'OG385-022DMW-T',	6804000,	7560000,	5,	'OG385-022DMW-T.jpg',	N'Nam',	null,	5,	null,	38,	N'Mặt tròn',	9,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000100',	19,	'OG1929-24AGK-T',	14994000,	16660000,	5,	'OG1929-24AGK-T.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	null,	1,	7,	1,	215,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000101',	19,	'OG358.33AGR-GL',	23445000,	26050000,	5,	'OG358.33AGR-GL.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	10,	1,	1,	1,	215,	4,	6,	24,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000102',	19,	'OG358.88AGR-GL',	22410000,	24900000,	5,	'OG358.88AGR-GL.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	null,	1,	1,	1,	215,	4,	6,	24,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000103',	19,	'OG380-451DLW',	8703000,	9670000,	5,	'OG380-451DLW.jpg',	N'Nữ',	null,	5,	null,	34,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000104',	18,	'0606555',	9180000,	10200000,	5,	'0606555.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	null,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000105',	18,	'0607445',	9180000,	10200000,	5,	'0607445.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt tròn',	null,	4,	2,	3,	215,	3,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000106',	18,	'0607123',	11520000,	12800000,	5,	'0607123.jpg',	N'Nam',	null,	3,	null,	39.5,	N'Mặt tròn',	9,	1,	1,	1,	215,	3,	null,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000107',	18,	'0606896',	9180000,	10200000,	5,	'0606896.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	215,	null,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000108',	18,	'0607313',	6426000,	7140000,	5,	'0607313.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	1,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000109',	18,	'0607283',	8874000,	9860000,	5,	'0607283.jpg',	N'Nam',	null,	3,	null,	39,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000110',	18,	'0606369',	8550000,	9500000,	5,	'0606369.jpg',	N'Nam',	null,	3,	null,	39,	N'Mặt tròn',	null,	4,	2,	1,	null,	3,	17,	1,	default);


select * from PhongCach
select * from SanPham
 
-- data table PhongCachSanPham

insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (2, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (3, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (68, 4);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (22, 4);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (22, 7);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (22, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (38, 7);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (38, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (25, 7);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (25, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (25, 4);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (26, 7);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (26, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (26, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (30, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (81, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (65, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (65, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (28, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (28, 8);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (31, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (31, 8);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (33, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (33, 8);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (52, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (8, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (8, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (61, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (61, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (101, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (101, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (102, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (102, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (7, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (9, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (10, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (11, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (12, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (14, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (20, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (24, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (34, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (35, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (37, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (39, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (47, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (69, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (75, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (77, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (63, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (63, 4);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (66, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (66, 4);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (64, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (64, 4);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (64, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 7);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (62, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (62, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (71, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (100, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (71, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (100, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (13, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (13, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (67, 6);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (67, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (18, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (18, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (41, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (41, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (42, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (42, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (42, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (89, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (89, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (89, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (5, 8);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (29, 8);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (29, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (2, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (3, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (16, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (32, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (45, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (46, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (97, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (98, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (15, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (15, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (49, 5);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (49, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (1, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (1, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (17, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (17, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (19, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (19, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (50, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (50, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (72, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (72, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (74, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (74, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (86, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (86, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (87, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (87, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 7);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 3);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (73, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (73, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (73, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (88, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (88, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (88, 1);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (4, 9);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (4, 10);
insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (4, 8);

-- data table TinhNangSanPham
select * from TinhNang

insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 3);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 7);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 7);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (38, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (38, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (9, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (9, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (9, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (18, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (18, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (18, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 24);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (12, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (12, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (12, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (62, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (62, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (62, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (17, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (17, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (17, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (3, 4);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (3, 3);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (42, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (97, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (98, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (8, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (13, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (22, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (25, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (26, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (32, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (45, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (52, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (101, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (102, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (36, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (36, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 9);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (11, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (11, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (11, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (14, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (14, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (14, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (10, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (10, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (15, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (15, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (49, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (49, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (64, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (64, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (77, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (77, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (34, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (34, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (34, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (37, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (37, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (37, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (39, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (39, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (39, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (16, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (16, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (16, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (24, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (24, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (24, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (72, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (73, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (75, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (79, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (82, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (88, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (89, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (92, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (87, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (87, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (20, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (20, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (46, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (46, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (47, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (47, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (61, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (61, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (63, 13)
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (63, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (65, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (65, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (66, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (66, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (69, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (69, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (74, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (74, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (81, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (81, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (100, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (100, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (86, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (86, 12)
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 4);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 3);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (23, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (23, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (23, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 9);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 14);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (7, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (7, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (7, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 2);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 18);





-- data table NhanVien
select * from NhanVien


insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('ducta', '1e2f316fce0207ecb7f34229b365767fd9a3c8803c9b3c5410a1aa5b05c33d75', N'Trần Anh Đức', 1, '1999-01-01', '001202087634', N'Hà Nội', '0986543876', 'ductaph30986@fpt.edu.vn', 1, 'No image', default, default);
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('chunghlb', 'ed1f19ae96267ae162e0bc92c7f604778444cbda7f694d7e8ac31418bea86ae7', N'Hoàng Lê Bảo Chung', 1, '2000-03-03', '001837237372', N'Hà Nội', '0933376389', 'chunghlb@fpt.edu.vn', 1, 'anh2.jpg', default, default);
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('longng', 'f5eaf16c8ba5cfa0c97a11e73f2ae375eb8c97653794d9911cffbed1124371e1', N'Nguyễn Gia Long', 1, '1999-02-02', '001736356354', N'Vĩnh Phúc', '0986736383', 'longng@fpt.edu.vn', 1, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('nguyenlk', '6f6c9c051e1146b2d54e5d728fdc95758165dc0bd2f1115e13361b9efff56a89', N'Lê Khoa Nguyên', 1, '1998-05-05', '001248505990', N'Hà Nội', '0984849494', 'nguyen@fpt.edu.vn', 1, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('dungltt', '2bf33dad05eb008b7610b9c89b4f3dabe96e4a58635e623382ba748891e4c71a', N'Lê Thi Thùy Dung', 0, '1998-11-11', '001284364664', N'Phú Thọ', '0984889484', 'dung@fpt.edu.vn', 0, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('khanhdt', 'abe2cc7bfdb33cf7e1530165054e6cb4896b34d5c2d792beb0330a79a0d7731d', N'Đỗ Thị Hồng Khanh', 0, '2002-10-10', '001202087634', N'Bắc Ninh', '0984898839', 'khanh@fpt.edu.vn', 0, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('tung', 'c27399264cafb7f8dc23bd334bf6ab068237eb706a6beac34443b1baf1b33c99', N'Ngô Gia Tự', 1, '2003-09-09', '001202484894', N'Hà Nội', '0983387464', 'tung@fpt.edu.vn', 0, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('anhtp', '88bc42ee01ec1836dd1dc33b505aad6d8855cc76e2c0d3dcf61da6844f156ae6', N'Trần Phương Anh', 0, '2004-07-07', '001204838484', N'Hà Nội', '0947484848', 'anhtp@fpt.edu.vn', 0, 'No image', default, 1)















