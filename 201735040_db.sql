-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 27 Nis 2021, 20:44:59
-- Sunucu sürümü: 10.4.18-MariaDB
-- PHP Sürümü: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `201735040_db`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `products`
--

CREATE TABLE `products` (
  `ID` int(8) NOT NULL,
  `name` varchar(64) COLLATE utf8_turkish_ci NOT NULL,
  `description` varchar(64) COLLATE utf8_turkish_ci NOT NULL,
  `stocklevel` int(32) NOT NULL,
  `criticallevel` int(32) NOT NULL,
  `cost` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `products`
--

INSERT INTO `products` (`ID`, `name`, `description`, `stocklevel`, `criticallevel`, `cost`) VALUES
(202038, 'CocaCola', 'Fluit Drinks', 3550, 1000, 24),
(202111, 'Fruko', 'Fluit Drinks', 16450, 1000, 21.5),
(202110, 'Jack Daniels 100cc', 'Alcohol', 6578, 200, 227.9),
(20200412, 'Efes Pilsen 50cc', 'Alkollü içecek', 5250, 1250, 14.5),
(20200108, 'Tamek Meyvesuyu', 'Meşrubat', 2940, 2000, 13.5),
(20201618, 'Kızılay Soda 220ml', 'Meşrubat', 750, 250, 2.5),
(20201420, 'Nescafe', 'Kahve', 5000, 1000, 9.9),
(20051458, 'Yeni Rakı', 'Alkollü içecek', 2375, 200, 245),
(20142560, 'Redbull', 'Enerji İçeceği', 2640, 1000, 5.5),
(20210408, 'Sprite Gazoz', 'Meşrubat', 600, 1000, 4.5),
(20201, 'IceTea', 'ColdDrink', 5554, 1000, 6),
(202056, 'Pringles', 'Chips', 500, 1000, 15);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `users`
--

CREATE TABLE `users` (
  `ID` int(32) NOT NULL,
  `username` varchar(32) COLLATE utf8_turkish_ci NOT NULL,
  `password` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `users`
--

INSERT INTO `users` (`ID`, `username`, `password`) VALUES
(1, 'burcu', 123456),
(2, 'yönetici', 654321),
(3, 'mehtap', 123123);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
