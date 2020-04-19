INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560004Ward01', '30', '10', '2', '52');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560004Ward02', '60', '18', '3', '90');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560004Ward03', '120', '20', '0', '150');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560004Ward04', '124', '12', '5', '147');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560004Ward05', '73', '16', '4', '102');

INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560083Ward11', '36', '8', '5', '43');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560083Ward12', '32', '25', '3', '60');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560083Ward13', '56', '20', '1', '85');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560083Ward14', '118', '15', '3', '156');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560083Ward15', '55', '19', '0', '102');

INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560002Ward21', '43', '10', '2', '52');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560002Ward22', '66', '18', '7', '90');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560002Ward23', '130', '20', '0', '150');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560002Ward24', '81', '12', '6', '123');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560002Ward25', '25', '16', '3', '98');

INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560080Ward31', '56', '10', '2', '69');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560080Ward32', '70', '18', '4', '90');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560080Ward33', '107', '20', '0', '150');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560080Ward34', '109', '12', '5', '159');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('560080Ward35', '69', '9', '4', '102');



INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('1','560004Ward01', '560004', 'Ward01');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('2','560004Ward02', '560005', 'Ward02');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('3','560004Ward03', '560006', 'Ward03');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('4','560004Ward04', '560007', 'Ward04');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('5','560004Ward05', '560008', 'Ward05');

INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('6','560083Ward11', '560083', 'Ward01');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('7','560083Ward12', '560084', 'Ward02');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('8','560083Ward13', '560085', 'Ward03');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('9','560083Ward14', '560086', 'Ward04');


INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('11','560002Ward21', '560022', 'Ward01');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('12','560002Ward22', '560023', 'Ward02');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('13','560002Ward23', '560024', 'Ward03');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('14','560002Ward24', '560025', 'Ward04');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('15','560002Ward25', '560026', 'Ward05');

INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('16','560080Ward31', '560080', 'Ward01');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('17','560080Ward32', '560081', 'Ward02');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('18','560080Ward33', '560082', 'Ward03');


INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560004Ward01', 'Kamala', '56', 'MG road, BASAVANAGUDI, Bangalore', '7894856975');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560004Ward02', 'Kalyan', '42', 'KH road, BASAVANAGUDI , Bangalore', '9894873233');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560004Ward03', 'Akshay', '27', 'RK road, BASAVANAGUDI, Bangalore', '6894946996');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560004Ward04', 'Venugopal', '39', 'MakMall road, BASAVANAGUDI', '7124853269');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560004Ward05', 'Thimappa', '76', 'MAVALLI road, BASAVANAGUDI, Bangalore', '8466987726');

INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560083Ward11', 'Kalyani', '73', '2nd Stage, BANNERGHATTA , Bangalore', '9463465956');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560083Ward12', 'Sampath', '36', 'GOTTIGERE road, BANNERGHATTA ', '6124952695');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560083Ward13', 'Sowmya', '22', 'KALKERE  road, BANNERGHATTA , Bangalore', '8696469759');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560083Ward14', 'Ramya', '43', 'RAGIHALLI road, BANNERGHATTA ', '7469438462');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560083Ward15', 'Somaiyya', '70', 'SAKALAVARA road, BANNERGHATTA , Bangalore', '9769362696');

INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560002Ward21', 'Sheela', '41', 'AM road, Narasimjharaja Road , Bangalore', '8444695325');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560002Ward22', 'Murthy', '66', 'Andanappa Lane, Narasimjharaja Road ', '9729459933');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560002Ward23', 'Saurav', '32', 'Avenue Road, Narasimjharaja Road , Bangalore', '6745992566');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560002Ward24', 'Laxman', '51', 'C T Road, Narasimjharaja Road ', '6192659425');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560002Ward25', 'Mohan', '59', 'Cubbanpet, Narasimjharaja Road , Bangalore', '8194856578');

INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560080Ward31', 'Gourav', '26', 'KV road, SADASHIVANAGAR, Bangalore', '9447294266');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560080Ward32', 'Harish', '40', 'Mekri Circle, SADASHIVANAGAR', '8497185919');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560080Ward33', 'Laxmi', '63', 'Sankey Tank road, SADASHIVANAGAR, Bangalore', '9449828953');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560080Ward34', 'Ramaiyya', '77', 'Bellary Road, SADASHIVANAGAR', '8456929236');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('560080Ward35', 'Gopal', '49', 'HT road, SADASHIVANAGAR, Bangalore', '7765186667');


INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560004Ward01', 'basic_need', 'BigBazar', 'Suresh', '8756912623', 'No');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560004Ward02', 'basic_need', 'DeviMedicals', 'Ramesh', '8745962369', 'No');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560004Ward03', 'gas_agency', 'Indian Gas-Agency', 'Chandrashekhar', '6874593250', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560004Ward04', 'take_away', 'HotelUdupi', 'Dileep', '8459671236', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560004Ward05', 'general_physician', 'Docters Clinic', 'Dr.Anil', '6974530123', 'No');

INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560083Ward11', 'take_away', 'HotelChutney', 'Manoj', '9447596123', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560083Ward12', 'basic_need', 'ApolloMedicals', 'Sandeep', '9887459658', 'No');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560083Ward13', 'basic_need', 'More', 'Bhaskar', '9410325689', 'No');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560083Ward14', 'gas_agency', 'Bharath Gas-Agency', 'Kiran', '9880674859', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560083Ward15', 'general_physician', 'LifeCare-Clinic', 'Dr Kumar', '9663025896', 'No');

INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560002Ward21', 'take_away', 'Dominos', 'Amar', '8860125875', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560002Ward22', 'basic_need', 'SupremeMedicals', 'Lohit', '9874591237', 'No');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560002Ward23', 'basic_need', 'M-Stores', 'Ramanna', '9626547777', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560002Ward24', 'gas_agency', 'Ravi Gas-Agency', 'Anush', '9638527415', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560002Ward25', 'general_physician', 'Krishna Clinic', 'Dr.Smitha', '9874444446', 'No');

INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560080Ward31', 'basic_need', 'R-Stores', 'Sharath', '9636942034', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560080Ward32', 'general_physician', 'ShettyClinic', 'Dr.KShetty', '9648579670', 'No');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560080Ward33', 'basic_need', 'LaxmiMedicals', 'Shantha', '9872683330', 'No');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560080Ward34', 'gas_agency', 'Gopi Gas-Agency', 'Bharath', '8794563210', 'Yes');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('560080Ward35', 'take_away', 'HotelTaj', 'Sachin', '9816005887', 'Yes');



