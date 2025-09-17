-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Сен 17 2025 г., 11:52
-- Версия сервера: 10.4.32-MariaDB
-- Версия PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `isp1`
--

-- --------------------------------------------------------

--
-- Структура таблицы `raspisanie`
--

CREATE TABLE `raspisanie` (
  `id` int(11) NOT NULL,
  `ponedelnik` text NOT NULL,
  `vtornik` text NOT NULL,
  `sreda` text NOT NULL,
  `chetverg` text NOT NULL,
  `pyatnica` text NOT NULL,
  `sybbota` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Дамп данных таблицы `raspisanie`
--

INSERT INTO `raspisanie` (`id`, `ponedelnik`, `vtornik`, `sreda`, `chetverg`, `pyatnica`, `sybbota`) VALUES
(1, 'МДК 01.01 Разработка програм. модулей', 'МДК 01.01 Разработка програм. модулей', 'МДК 11.02  ПРиО веб-приложений ', 'МДК 01.01 Разработка програм. модулей', 'МДК 11.02  ПРиО веб-приложений ', 'День самоподготовки'),
(2, 'Физическая культура', 'МДК 11.02  ПРиО веб-приложений ', 'МДК 01.01 Разработка програм. модулей', 'МДК 11.02  ПРиО веб-приложений ', 'МДК 11.02  ПРиО веб-приложений ', ''),
(3, 'МДК 01.01 Разработка програм. модулей', 'МДК 01.01 Разработка програм. модулей', 'МДК 01.01 Разработка програм. модулей', 'Физическая культура', 'Физическая культура', ''),
(4, 'Классный час', 'МДК 11.02  ПРиО веб-приложений ', 'МДК 11.02  ПРиО веб-приложений ', '', '', '');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `raspisanie`
--
ALTER TABLE `raspisanie`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
