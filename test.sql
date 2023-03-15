-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  mer. 15 mars 2023 à 15:31
-- Version du serveur :  5.5.62-0ubuntu0.14.04.1-log
-- Version de PHP :  7.3.3-1+ubuntu14.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `test`
--

-- --------------------------------------------------------

--
-- Structure de la table `personneDTO`
--

CREATE TABLE `personneDTO` (
  `identifiant` varchar(200) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `personneDTO`
--

INSERT INTO `personneDTO` (`identifiant`, `nom`, `prenom`) VALUES
('alban.lediraison@gmail.com', 'Le Diraison', 'Alban'),
('ilyesbouanane@gmail.com', 'Bouanane', 'Ilyes'),
('mathisg29@gmail.com', 'Guillarmou', 'Mathis');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `personneDTO`
--
ALTER TABLE `personneDTO`
  ADD PRIMARY KEY (`identifiant`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
