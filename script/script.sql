create database "librairieP7"
  with owner root;

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

create table situation_emprunt
(
  id        serial not null
    constraint situation_emprunt_pkey
      primary key,
  situation varchar(255)
);

alter table situation_emprunt
  owner to root;

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

create view "View" as
SELECT auteur.intitule_auteur,
       auteur.description_auteur,
       edition_ouvrage.ouvrageid,
       editeur.intitule_editeur,
       editeur.lienweb,
       edition_ouvrage.annee_editions
FROM ((auteur
  CROSS JOIN editeur)
       JOIN edition_ouvrage ON ((editeur.id = edition_ouvrage.editeurid)));

alter table "View"
  owner to root;

create view view2 as
SELECT auteur.lienweb AS lienweb2,
       auteur.intitule_auteur,
       auteur.description_auteur,
       ouvrage.intitule_ouvrage
FROM (((((auteur
  JOIN ouvrage ON ((auteur.id = ouvrage.auteurid)))
  JOIN ouvrage_genre ON ((ouvrage.id = ouvrage_genre.ouvrageid)))
  JOIN edition_ouvrage ON ((ouvrage.id = edition_ouvrage.ouvrageid)))
  JOIN genre ON ((ouvrage_genre.genreid = genre.id)))
       JOIN editeur ON ((edition_ouvrage.editeurid = editeur.id)));

alter table view2
  owner to root;


