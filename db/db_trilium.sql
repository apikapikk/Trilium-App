-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Bulan Mei 2024 pada 05.25
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `triliumapp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `guru`
--

CREATE TABLE `guru` (
  `id_guru` INT(11) NOT NULL,
  `nama_guru` VARCHAR(45) NOT NULL,
  `domisili` VARCHAR(45) NOT NULL,
  `alamat` VARCHAR(45) NOT NULL,
  `bidang` VARCHAR(45) NOT NULL,
  `pendidikan_terakhir` VARCHAR(45) NOT NULL,
  `tanggal_lahir` DATE NOT NULL,
  `lembaga_sekolah_terakhir` VARCHAR(45) NOT NULL,
  `pengalaman_mengajar` VARCHAR(45) NOT NULL,
  `ijazah_terakhir` VARCHAR(45) NOT NULL,
  `sertifikasi_profesi` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `nomor_telepon` INT(11) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `kursus`
--

CREATE TABLE `kursus` (
  `id_kursus` INT(11) NOT NULL,
  `nama_kursus` VARCHAR(45) NOT NULL,
  `jumlah_pembahasan` INT(11) NOT NULL,
  `harga_kursus` DOUBLE NOT NULL,
  `hari_mengajar` ENUM('Senin','Selasa','Rabu','Kamis','Jumat','Sabtu','Minggu') NOT NULL,
  `jam_mengajar` VARCHAR(45) NOT NULL,
  `id_guru` INT(11) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pemesanan` INT(11) NOT NULL,
  `id_siswa` INT(11) NOT NULL,
  `id_kursus` INT(11) NOT NULL,
  `tanggal_pemesanan` DATE NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
--

CREATE TABLE `siswa` (
  `id_siswa` INT(11) NOT NULL,
  `nama_siswa` VARCHAR(45) NOT NULL,
  `domisili` VARCHAR(45) NOT NULL,
  `alamat` VARCHAR(45) NOT NULL,
  `tanggal_lahir` DATE NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `nomor_telepon` INT(11) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`id_guru`);

--
-- Indeks untuk tabel `kursus`
--
ALTER TABLE `kursus`
  ADD PRIMARY KEY (`id_kursus`),
  ADD KEY `id_guru` (`id_guru`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pemesanan`),
  ADD KEY `id_siswa` (`id_siswa`),
  ADD KEY `id_kursus` (`id_kursus`);

--
-- Indeks untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`id_siswa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
