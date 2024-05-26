/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  04/05/2024 22:01:30                      */
/*==============================================================*/


alter table COMPTE 
   drop foreign key FK_COMPTE_ASSOCIATI_VACANCES;

alter table COMPTE 
   drop foreign key FK_COMPTE_ASSOCIATI_PROFIL;

alter table COMPTE 
   drop foreign key FK_COMPTE_FAIRE_RESERVAT;

alter table COMPTE 
   drop foreign key FK_COMPTE_PASSER_RESERVAT;

alter table CONSULTER 
   drop foreign key FK_CONSULTE_CONSULTER_EVENEMEN;

alter table CONSULTER 
   drop foreign key FK_CONSULTE_CONSULTER_PROFIL;

alter table CONTENIR 
   drop foreign key FK_CONTENIR_CONTENIR_VACANCES;

alter table CONTENIR 
   drop foreign key FK_CONTENIR_CONTENIR2_EVENEMEN;

alter table EVENEMENT 
   drop foreign key FK_EVENEMEN_RESERVER_RESERVAT;

alter table HOTEL 
   drop foreign key FK_HOTEL_AVOIR_CHAMBRE;

alter table HOTEL 
   drop foreign key FK_HOTEL_CONCERNER_RESERVAT;

alter table VOIR 
   drop foreign key FK_VOIR_VOIR_PROFIL;

alter table VOIR 
   drop foreign key FK_VOIR_VOIR2_HOTEL;

drop table if exists CHAMBRE;


alter table COMPTE 
   drop foreign key FK_COMPTE_PASSER_RESERVAT;

alter table COMPTE 
   drop foreign key FK_COMPTE_FAIRE_RESERVAT;

alter table COMPTE 
   drop foreign key FK_COMPTE_ASSOCIATI_VACANCES;

alter table COMPTE 
   drop foreign key FK_COMPTE_ASSOCIATI_PROFIL;

drop table if exists COMPTE;


alter table CONSULTER 
   drop foreign key FK_CONSULTE_CONSULTER_EVENEMEN;

alter table CONSULTER 
   drop foreign key FK_CONSULTE_CONSULTER_PROFIL;

drop table if exists CONSULTER;


alter table CONTENIR 
   drop foreign key FK_CONTENIR_CONTENIR_VACANCES;

alter table CONTENIR 
   drop foreign key FK_CONTENIR_CONTENIR2_EVENEMEN;

drop table if exists CONTENIR;


alter table EVENEMENT 
   drop foreign key FK_EVENEMEN_RESERVER_RESERVAT;

drop table if exists EVENEMENT;


alter table HOTEL 
   drop foreign key FK_HOTEL_CONCERNER_RESERVAT;

alter table HOTEL 
   drop foreign key FK_HOTEL_AVOIR_CHAMBRE;

drop table if exists HOTEL;

drop table if exists PROFIL;

drop table if exists RESERVATION_EVENT;

drop table if exists RESERVATION_HOTEL;

drop table if exists VACANCES_SUR_MESURE;


alter table VOIR 
   drop foreign key FK_VOIR_VOIR_PROFIL;

alter table VOIR 
   drop foreign key FK_VOIR_VOIR2_HOTEL;

drop table if exists VOIR;

/*==============================================================*/
/* Table : CHAMBRE                                              */
/*==============================================================*/
create table CHAMBRE
(
   ID_CHAMBRE           int not null  comment '',
   PENSION              text  comment '',
   PRIX                 float  comment '',
   NBR_ADULTE           int  comment '',
   NBR_ENFANT           text  comment '',
   primary key (ID_CHAMBRE)
);

/*==============================================================*/
/* Table : COMPTE                                               */
/*==============================================================*/
create table COMPTE
(
   ID_COMPTE            int not null  comment '',
   ID_VACANCES_SUR_MESURE int not null  comment '',
   ID_PROFIL            int not null  comment '',
   ID_RESERVATION_HOTEL int not null  comment '',
   ID_EVENT             int not null  comment '',
   EMAIL                text  comment '',
   PASSWORD             text  comment '',
   primary key (ID_COMPTE)
);

/*==============================================================*/
/* Table : CONSULTER                                            */
/*==============================================================*/
create table CONSULTER
(
   ID_EVENEMENT         int not null  comment '',
   ID_PROFIL            int not null  comment '',
   primary key (ID_EVENEMENT, ID_PROFIL)
);

/*==============================================================*/
/* Table : CONTENIR                                             */
/*==============================================================*/
create table CONTENIR
(
   ID_VACANCES_SUR_MESURE int not null  comment '',
   ID_EVENEMENT         int not null  comment '',
   primary key (ID_VACANCES_SUR_MESURE, ID_EVENEMENT)
);

/*==============================================================*/
/* Table : EVENEMENT                                            */
/*==============================================================*/
create table EVENEMENT
(
   ID_EVENEMENT         int not null  comment '',
   ID_EVENT             int not null  comment '',
   NOM_EVENEMENT        text  comment '',
   TYPE_EVENEMENT       text  comment '',
   DESCRIPTION          text  comment '',
   DATE                 date  comment '',
   PERIODE              int  comment '',
   PRIX                 float  comment '',
   PROGRAM              text  comment '',
   NOTE                 text  comment '',
   IMAGES               longblob  comment '',
   PLACES               int  comment '',
   primary key (ID_EVENEMENT)
);

/*==============================================================*/
/* Table : HOTEL                                                */
/*==============================================================*/
create table HOTEL
(
   ID_HOTEL             int not null  comment '',
   ID_CHAMBRE           int not null  comment '',
   ID_RESERVATION_HOTEL int not null  comment '',
   NOM_HOTEL            text  comment '',
   LOCALISTAION         text  comment '',
   DESCRIPTION          text  comment '',
   RATING               int  comment '',
   IMAGES               longblob  comment '',
   OPTIONS              text  comment '',
   PROMO                int  comment '',
   primary key (ID_HOTEL)
);

/*==============================================================*/
/* Table : PROFIL                                               */
/*==============================================================*/
create table PROFIL
(
   NOM                  text  comment '',
   PRENOM               text  comment '',
   ID_PROFIL            int not null  comment '',
   TELEPHONE            int  comment '',
   EMAIL                text  comment '',
   MOTDEPASS            text  comment '',
   primary key (ID_PROFIL)
);

/*==============================================================*/
/* Table : RESERVATION_EVENT                                    */
/*==============================================================*/
create table RESERVATION_EVENT
(
   ID_EVENT             int not null  comment '',
   PERIODE              int  comment '',
   ETAT                 text  comment '',
   PRIX                 float  comment '',
   NBR_PLACES           int  comment '',
   DETAILS              text  comment '',
   primary key (ID_EVENT)
);

/*==============================================================*/
/* Table : RESERVATION_HOTEL                                    */
/*==============================================================*/
create table RESERVATION_HOTEL
(
   ID_RESERVATION_HOTEL int not null  comment '',
   PERIODE              int  comment '',
   ETAT                 text  comment '',
   PRIX                 float  comment '',
   NBR_CHAMBRES         int  comment '',
   DETAILS              text  comment '',
   primary key (ID_RESERVATION_HOTEL)
);

/*==============================================================*/
/* Table : VACANCES_SUR_MESURE                                  */
/*==============================================================*/
create table VACANCES_SUR_MESURE
(
   ID_VACANCES_SUR_MESURE int not null  comment '',
   TYPE_DESTINATION     text  comment '',
   NBRDESTINATION       int  comment '',
   DESTINATIONS         text  comment '',
   PERIODE              int  comment '',
   NBRPERSONNES         int  comment '',
   OPTIONS              text  comment '',
   primary key (ID_VACANCES_SUR_MESURE)
);

/*==============================================================*/
/* Table : VOIR                                                 */
/*==============================================================*/
create table VOIR
(
   ID_PROFIL            int not null  comment '',
   ID_HOTEL             int not null  comment '',
   primary key (ID_PROFIL, ID_HOTEL)
);

alter table COMPTE add constraint FK_COMPTE_ASSOCIATI_VACANCES foreign key (ID_VACANCES_SUR_MESURE)
      references VACANCES_SUR_MESURE (ID_VACANCES_SUR_MESURE) on delete restrict on update restrict;

alter table COMPTE add constraint FK_COMPTE_ASSOCIATI_PROFIL foreign key (ID_PROFIL)
      references PROFIL (ID_PROFIL) on delete restrict on update restrict;

alter table COMPTE add constraint FK_COMPTE_FAIRE_RESERVAT foreign key (ID_RESERVATION_HOTEL)
      references RESERVATION_HOTEL (ID_RESERVATION_HOTEL) on delete restrict on update restrict;

alter table COMPTE add constraint FK_COMPTE_PASSER_RESERVAT foreign key (ID_EVENT)
      references RESERVATION_EVENT (ID_EVENT) on delete restrict on update restrict;

alter table CONSULTER add constraint FK_CONSULTE_CONSULTER_EVENEMEN foreign key (ID_EVENEMENT)
      references EVENEMENT (ID_EVENEMENT) on delete restrict on update restrict;

alter table CONSULTER add constraint FK_CONSULTE_CONSULTER_PROFIL foreign key (ID_PROFIL)
      references PROFIL (ID_PROFIL) on delete restrict on update restrict;

alter table CONTENIR add constraint FK_CONTENIR_CONTENIR_VACANCES foreign key (ID_VACANCES_SUR_MESURE)
      references VACANCES_SUR_MESURE (ID_VACANCES_SUR_MESURE) on delete restrict on update restrict;

alter table CONTENIR add constraint FK_CONTENIR_CONTENIR2_EVENEMEN foreign key (ID_EVENEMENT)
      references EVENEMENT (ID_EVENEMENT) on delete restrict on update restrict;

alter table EVENEMENT add constraint FK_EVENEMEN_RESERVER_RESERVAT foreign key (ID_EVENT)
      references RESERVATION_EVENT (ID_EVENT) on delete restrict on update restrict;

alter table HOTEL add constraint FK_HOTEL_AVOIR_CHAMBRE foreign key (ID_CHAMBRE)
      references CHAMBRE (ID_CHAMBRE) on delete restrict on update restrict;

alter table HOTEL add constraint FK_HOTEL_CONCERNER_RESERVAT foreign key (ID_RESERVATION_HOTEL)
      references RESERVATION_HOTEL (ID_RESERVATION_HOTEL) on delete restrict on update restrict;

alter table VOIR add constraint FK_VOIR_VOIR_PROFIL foreign key (ID_PROFIL)
      references PROFIL (ID_PROFIL) on delete restrict on update restrict;

alter table VOIR add constraint FK_VOIR_VOIR2_HOTEL foreign key (ID_HOTEL)
      references HOTEL (ID_HOTEL) on delete restrict on update restrict;

