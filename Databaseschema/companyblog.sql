CREATE TABLE `answers` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Topic` varchar(70) DEFAULT NULL,
  `QuestionId` int(11) NOT NULL,
  `UserId` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `FK_answers_questions` (`QuestionId`),
  KEY `FK_answers_users` (`UserId`),
  CONSTRAINT `FK_answers_questions` FOREIGN KEY (`QuestionId`) REFERENCES `questions` (`Id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `FK_answers_users` FOREIGN KEY (`UserId`) REFERENCES `users` (`Id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1
GO

CREATE TABLE `questions` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Topic` varchar(70) DEFAULT NULL,
  `UserId` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `FK_questions_users` (`UserId`),
  CONSTRAINT `FK_questions_users` FOREIGN KEY (`UserId`) REFERENCES `users` (`Id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1
GO

CREATE TABLE `users` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `constraint_name` (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1
