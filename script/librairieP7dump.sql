create table auteur
(
  id                 serial not null
    constraint auteur_pkey
      primary key,
  intitule_auteur    varchar(255),
  description_auteur varchar(600),
  lienweb            varchar(255)
);

alter table auteur
  owner to root;

INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (1, 'Rabelais', 'Auteur français né en 1483 à Chinon. Il est décédé le 9 avril 1553 à Paris.', 'https://www.senscritique.com/contact/Francois_Rabelais/136510');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (8, 'George Orwell', 'Auteur et scénariste britannique né le 25 juin 1903 à Motihari. Il est décédé le 21 janvier 1950 à Londres', 'https://fr.wikipedia.org/wiki/George_Orwell');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (2, 'Moore', 'Auteur britannique né le 7 février 1478 à London.', 'https://www.senscritique.com/contact/Thomas_More/506339');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (14, 'Stephen king', 'genre simpas', 'http://www.stephenking.com/');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (10, 'Alfred de Musset', 'Auteur, traducteur et illustrateur.', 'https://fr.wikipedia.org/wiki/Alfred_de_Musset');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (3, 'Du Bellay', 'Joachim du Bellay ou Joachim Du Bellay est un poète français né vers 1522 à Liré en Anjou et mort le 1 janvier 1560 .', 'https://fr.wikipedia.org/wiki/Joachim_du_Bellay');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (12, 'Ken Follett', 'Auteur, créateur et producteur britannique né le 5 juin 1949 à Cardiff.', 'https://fr.wikipedia.org/wiki/Ken_Follett');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (11, 'Harlan Coben', 'Auteur, scénariste, créateur, producteur et acteur américain né le 4 janvier 1962 à Newark.', 'https://www.senscritique.com/contact/Harlan_Coben/92279');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (4, 'Montesquieu', 'Auteur français né le 18 janvier 1689 à La Brède. Il est décédé le 10 février 1755 à Paris.', 'https://fr.wikipedia.org/wiki/Montesquieu');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (7, 'Maupassant', 'Auteur et scénariste français de France. Il est décédé à Passy.', 'https://fr.wikipedia.org/wiki/Guy_de_Maupassant');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (9, 'Choderlos de Laclos', 'Auteur et scénariste.', 'https://fr.wikipedia.org/wiki/Pierre_Choderlos_de_Laclos');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (5, 'Baudelaire', 'Auteur et traducteur français né le 9 avril 1821 à Paris. Il est décédé le 31 août 1867 à Paris.', 'https://fr.wikipedia.org/wiki/Charles_Baudelaire');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (13, 'Stephen king', 'genre simpas', 'http://www.stephenking.com/');
INSERT INTO public.auteur (id, intitule_auteur, description_auteur, lienweb) VALUES (6, 'Victor Hugo', 'Auteur, scénariste et réalisateur français né le 26 février 1802 à Besançon. Il est décédé le 22 mai 1885 à Paris', 'https://fr.wikipedia.org/wiki/Victor_Hugo');
create table bibliotheque
(
  id                   serial not null
    constraint bibliotheque_pkey
      primary key,
  intitulebibliotheque varchar(255),
  adresse              varchar(255),
  codepostal           varchar(255),
  ville                varchar(255),
  telephone            varchar(255)
);

alter table bibliotheque
  owner to root;

INSERT INTO public.bibliotheque (id, intitulebibliotheque, adresse, codepostal, ville, telephone) VALUES (1, 'Librairie des Acacias', '14 rue des Tilleuls', '33145', 'Bordeaux CX', '0456443322');
create table coordonnees
(
  id           serial not null
    constraint coordonnees_pkey
      primary key,
  rue          varchar(255),
  code_postale varchar(255),
  ville        varchar(255),
  telephone    varchar(255),
  email        varchar(255),
  lecteurid    integer
    constraint "detient une adresse"
      references lecteur
);

alter table coordonnees
  owner to root;

INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (1, 'rue des tilleurs', '31344', 'Blagnac', '0565455533', 'monmail@gmail.com', 1);
INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (2, 'rue des roseaux', '31332', 'Toulouse', '054333443', 'la@hotmail.fr', 2);
INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (3, 'rue des acacias', '31233', 'toulouse', '054333342', 'monmail@gmail.com', 3);
INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (4, 'rue breteuil', '33123', 'Toulouse', '054333344', 'lebon@yahoo.fr', 4);
INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (5, 'rue de la graviere', '32122', 'toulouse', '0545223311', 'oloe@gmail.com', 5);
INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (6, 'rue des champs', '31234', 'toulouse', '0565443344', 'apl@gmail.Com', 6);
INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (8, 'allee francois mitterand', '31234', 'toulouse', '056433456', 'lke@gmail.com', 8);
INSERT INTO public.coordonnees (id, rue, code_postale, ville, telephone, email, lecteurid) VALUES (7, 'avenue de la paie', '31232', 'Toulouse', '053433212', 'ole@gmail.com', 2);
create table editeur
(
  id               serial not null
    constraint editeur_pkey
      primary key,
  intitule_editeur varchar(170),
  lienweb          varchar(255)
);

alter table editeur
  owner to root;

INSERT INTO public.editeur (id, intitule_editeur, lienweb) VALUES (1, 'France Loisir', 'http://www.franceloisirs.com/');
INSERT INTO public.editeur (id, intitule_editeur, lienweb) VALUES (2, 'Hachette', 'https://www.hachette.com/fr/accueil/');
INSERT INTO public.editeur (id, intitule_editeur, lienweb) VALUES (3, 'Actes Sud', 'https://www.actes-sud.fr/');
INSERT INTO public.editeur (id, intitule_editeur, lienweb) VALUES (4, 'ENI', 'https://www.editions-eni.fr/');
INSERT INTO public.editeur (id, intitule_editeur, lienweb) VALUES (5, 'Micro Application', 'https://microapp.com/');
INSERT INTO public.editeur (id, intitule_editeur, lienweb) VALUES (6, 'Gallimard', 'http://www.gallimard.fr/');
INSERT INTO public.editeur (id, intitule_editeur, lienweb) VALUES (7, 'Folio', 'http://www.folio-lesite.fr/');
create table edition_ouvrage
(
  ouvrageid      integer not null
    constraint "l'ouvrage peut etre réedité "
      references ouvrage,
  editeurid      integer not null
    constraint "un ouvrage peut avoir plusieurs editions"
      references editeur,
  annee_editions date,
  constraint edition_ouvrage_pkey
    primary key (ouvrageid, editeurid)
);

alter table edition_ouvrage
  owner to root;

INSERT INTO public.edition_ouvrage (ouvrageid, editeurid, annee_editions) VALUES (6, 1, '2018-01-01');
INSERT INTO public.edition_ouvrage (ouvrageid, editeurid, annee_editions) VALUES (5, 2, '2010-01-01');
INSERT INTO public.edition_ouvrage (ouvrageid, editeurid, annee_editions) VALUES (4, 4, '2011-01-01');
create table emprunt
(
  id                   serial  not null
    constraint emprunt_pkey
      primary key,
  date_debut           date    not null,
  date_fin             date    not null,
  date_retour_effectif date,
  renouvellement       char,
  situation_empruntid  integer not null
    constraint "situation de l'emprunt"
      references situation_emprunt,
  exemplaireid         integer not null
    constraint fkemprunt887790
      references exemplaire,
  lecteurid            integer not null
    constraint fkemprunt514078
      references lecteur
);

alter table emprunt
  owner to root;

INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (1, '2018-12-12', '2019-01-21', null, '0', 2, 2, 1);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (2, '2018-12-12', '2019-01-21', null, '0', 2, 1, 2);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (3, '2018-12-12', '2019-01-21', null, '1', 4, 3, 4);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (4, '2018-12-12', '2019-01-21', '2019-01-21', '0', 1, 4, 5);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (5, '2018-12-12', '2019-01-21', '2019-01-21', '0', 1, 5, 6);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (6, '2018-12-12', '2019-01-21', null, '1', 4, 9, 6);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (7, '2018-12-12', '2019-01-21', null, '0', 4, 8, 8);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (8, '2018-12-12', '2019-01-21', null, '1', 4, 7, 8);
INSERT INTO public.emprunt (id, date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES (9, '2018-12-12', '2019-01-21', null, '1', 2, 6, 8);
create table exemplaire
(
  id               serial  not null
    constraint exemplaire_pkey
      primary key,
  referenceinterne varchar(255),
  ouvrageid        integer not null
    constraint fkexemplaire201131
      references ouvrage,
  bibliothequeid   integer not null
    constraint fkexemplaire130409
      references bibliotheque
);

alter table exemplaire
  owner to root;

INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (1, 'AC453ERT1', 1, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (2, 'AC453ERT2', 1, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (3, 'VIC3432RTE', 2, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (4, 'VIC34RTE22', 2, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (5, 'TRZ54ERT', 3, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (6, 'SRC34RTE', 4, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (7, 'ARE45ERT', 4, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (8, 'BRI321234', 5, 1);
INSERT INTO public.exemplaire (id, referenceinterne, ouvrageid, bibliothequeid) VALUES (9, 'SERM321', 5, 1);
create table genre
(
  id                serial not null
    constraint genre_pkey
      primary key,
  intitule_genre    varchar(255),
  description_genre varchar(255),
  webographie       varchar(255)
);

alter table genre
  owner to root;

INSERT INTO public.genre (id, intitule_genre, description_genre, webographie) VALUES (1, 'Renaissance', ' occidentale durant la Renaissance artistique.La Renaissance est une période de l époque moderne associée à la redécouverte de la littérature, de la philosophie et des sciences de l Antiquité,', 'https://en.wikipedia.org/wiki/Renaissance');
INSERT INTO public.genre (id, intitule_genre, description_genre, webographie) VALUES (2, 'Distopie', 'Une dystopie est un récit de fiction dépeignant une société imaginaire organisée de telle façon qu elle empêche ses membres d atteindre le bonheur.', 'https://fr.wikipedia.org/wiki/Dystopie');
INSERT INTO public.genre (id, intitule_genre, description_genre, webographie) VALUES (3, 'Poesie', ' Manuscrit du poème Les Assis d’Arthur Rimbaud recopié par Paul Verlaine. La poésie est un genre littéraire très ancien aux formes variées, écrites généralement en vers mais qui admettent aussi la prose, et qui privilégient l expressivité de la forme, ', 'https://fr.wikipedia.org/wiki/Po%C3%A9sie');
INSERT INTO public.genre (id, intitule_genre, description_genre, webographie) VALUES (4, 'Roman', 'genre littéraire produisant des œuvres d imagination', 'https://fr.wikipedia.org/wiki/Roman#Oeuvre_litt%C3%A9raire');
INSERT INTO public.genre (id, intitule_genre, description_genre, webographie) VALUES (5, 'Théatre', 'Il s agit de spectacles dans lesquels des comédiens, mis dans les circonstances et les situations créées par un texte', 'https://fr.wikipedia.org/wiki/Th%C3%A9%C3%A2tre');
create table lecteur
(
  id                serial not null
    constraint lecteur_pkey
      primary key,
  identifiant       varchar(255),
  nom               varchar(255),
  prenom            varchar(255),
  motdepasse        varchar(255),
  date_inscription  date,
  date_de_naissance date
);

alter table lecteur
  owner to root;

INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (2, 'bon12', 'Kovalski', 'Serge', '4321', '2018-10-10', '1987-11-10');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (3, 'ayaa', 'Remann', 'Henri', 'R44E3', '2018-10-23', '1987-10-11');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (4, 'cosakE', 'Favert', 'Roger', 'Fav764', '2018-10-11', '1985-10-13');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (5, 'papaoute', 'Malsherbes', 'Eric', '332234', '2018-07-11', '1984-05-05');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (6, 'toutamoi', 'bernardi', 'Francois', '34RF443', '2018-07-09', '1983-05-12');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (7, 'vienvien', 'Esteban', 'Vivien', '3423', '2018-05-11', '1980-06-09');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (8, 'Eretra12', 'Maire', 'Didier', '32ER23', '2017-11-06', '1980-09-09');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (9, 'cave23', 'valimi', 'Rachid', '23ETB3432', '2015-04-04', '1988-07-07');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (10, 'altavisattaa', 'xiam', 'Francis', '34ER443', '2012-11-11', '1988-11-11');
INSERT INTO public.lecteur (id, identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES (1, 'gold43', 'Robert', 'Andre', '$2a$10$a482wLfG8D/VEnkY64FXPuD/U0zQ0A77jtPlTN8vwUKCxx7xCp.Q2', '2018-11-11', '1987-11-11');
create table ouvrage
(
  id               serial  not null
    constraint ouvrage_pkey
      primary key,
  intitule_ouvrage char(255),
  description      varchar(900),
  photo            varchar(255),
  num_isbn         varchar(255),
  auteurid         integer not null
    constraint "un ouvrage est ecrit par un auteur"
      references auteur
);

alter table ouvrage
  owner to root;

INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (1, 'Gargantua                                                                                                                                                                                                                                                      ', 'Le géant Gargantua, fils de Grandgousier et de Gargamelle, naît de l oreille de celle-ci alors qu elle s est livrée à des excès de table et de boisson. Laissé libre de vivre selon ses désirs jusqu à cinq ans, Gargantua est ensuite confié à Thubal Holoferne', null, '9782020300322', 1);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (2, 'Utopia                                                                                                                                                                                                                                                         ', 'Dans le livre L Utopie, Thomas More est toujours à la recherche de l idéal en défendant l ouverture d’esprit, l aptitude à lexpérimentation et la discussion pour améliorer la société. Il rêve de créer un État libéral qui permet de satisfaire les besoins de chacun et de faire respecter les droits de chacun. Mais comment faire pour avoir une société égalitaire, juste et heureuse ', null, '9782290170267', 2);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (3, 'Oeuvres complètes                                                                                                                                                                                                                                              ', 'Ce volume comprend les poésies y parues de 1551 à 1553 évangélique dans les Œuvres de l invention de l auteur', null, '9788074840425', 3);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (4, 'Les Lettres Persanes                                                                                                                                                                                                                                           ', 'Usbek entreprend avec Rica un long voyage en Europe jusqu à Paris. il dépeint d’un œil faussement naïf une civilisation lointaine.', null, '9782218997568', 4);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (5, 'Les Fleurs du mal                                                                                                                                                                                                                                              ', 'Une oeuvre sous forme de recueil de poèmes divisé en six parties : Spleen et idéal, Tableaux parisiens, le Vin, les Fleurs du mal, Révolte et la Mort.  ', null, '9782253007102', 5);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (6, 'Les Misérables                                                                                                                                                                                                                                                 ', 'Cosette et Marius sont 2 âmes disposées à s aimer. Mais Jean Valjean veille, lui, l ancien bagnard dont Cosette est devenue la seule raison de vivre.', null, '9782010008995', 6);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (7, 'Bel ami                                                                                                                                                                                                                                                        ', 'Le roman retrace l ascension de Georges Duroy, un homme ambitieux et séducteur parvenu au sommet de la pyramide sociale grâce à ses maîtresses.', null, '9782013949871', 7);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (8, '1984                                                                                                                                                                                                                                                           ', 'De tous les carrefours importants, lBig brother vous regardesser place à d obscurs desseins. Le foncté sur ce livre ', null, '9782070368228', 10);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (9, 'Ne le dis à personne                                                                                                                                                                                                                                           ', 'Votre femme a été tuée par un serial killer. Huit ans plus tard, vous recevez son visage, filmé en temps réel au milieu d une foule.', null, '9782266207709', 11);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (10, 'Les Piliers de la Terre                                                                                                                                                                                                                                        ', 'L action se situe dans l Angleterre du XIIème siècle et tourne autour de la construction d une cathédrale par le prieur du village de Kingsbridge', null, '9782253059530', 12);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (11, 'Le Troisième Jumeau                                                                                                                                                                                                                                            ', 'Comment deux vrais jumeaux, dotés du même code ADN, peuvent-ils être nés de parents différents, à des dates différentes ? C est pourtant ce qui arrive à Steve, brillant étudiant en droit, et à Dennis qui purge une peine de prison à vie.', null, '9782221132432', 12);
INSERT INTO public.ouvrage (id, intitule_ouvrage, description, photo, num_isbn, auteurid) VALUES (12, 'les raisins de la colere                                                                                                                                                                                                                                       ', 'livre roman qui se passe dans les annexe 1950', '', 'REF454ERE', 10);
create table ouvrage_genre
(
  ouvrageid integer not null
    constraint "un ouvrage peut avoir plusieurs genres"
      references ouvrage,
  genreid   integer not null
    constraint "un genre peut appartenir a plusieurs ouvrages"
      references genre,
  constraint ouvrage_genre_pkey
    primary key (ouvrageid, genreid)
);

alter table ouvrage_genre
  owner to root;

INSERT INTO public.ouvrage_genre (ouvrageid, genreid) VALUES (1, 4);
INSERT INTO public.ouvrage_genre (ouvrageid, genreid) VALUES (2, 4);
INSERT INTO public.ouvrage_genre (ouvrageid, genreid) VALUES (5, 3);
INSERT INTO public.ouvrage_genre (ouvrageid, genreid) VALUES (6, 5);
INSERT INTO public.ouvrage_genre (ouvrageid, genreid) VALUES (6, 1);
INSERT INTO public.ouvrage_genre (ouvrageid, genreid) VALUES (12, 4);
INSERT INTO public.ouvrage_genre (ouvrageid, genreid) VALUES (12, 2);
create table situation_emprunt
(
  id        serial not null
    constraint situation_emprunt_pkey
      primary key,
  situation varchar(255)
);

alter table situation_emprunt
  owner to root;

INSERT INTO public.situation_emprunt (id, situation) VALUES (1, 'Rendu');
INSERT INTO public.situation_emprunt (id, situation) VALUES (2, 'En cours');
INSERT INTO public.situation_emprunt (id, situation) VALUES (3, 'Prolongés');
INSERT INTO public.situation_emprunt (id, situation) VALUES (4, 'Non rendus à temps');