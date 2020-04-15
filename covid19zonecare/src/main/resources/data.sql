INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('123456P09', '147', '12', '5', '147');
INSERT INTO covid_count(`pincode_ward`, `active`, `recovered`, `deceased`, `quarantine`) VALUES ('741852Y78', '252', '16', '4', '102');

INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('1','7531591KQ', '753159', '1KQ');
INSERT INTO pincode(`Id`,`pincode_ward`, `pincode`, `ward`) VALUES ('2','9517539IW', '951753', '9IW');

INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('147852AG', 'Abhishek', '34', 'Temple road, Rajajinagar, Bangalore', '1478526341');
INSERT INTO ward_details( `pincode_ward`, `Name`, `Age`, `Address`, `Contactno`) VALUES ('124578KH', 'Venugopal', '42', 'Cart road, Mangalore', '1478526341');

INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('731982D05', 'Grocery', 'Loyal', 'Sachin', '1237894561', 'no');
INSERT INTO ward_services(`pincode_ward`, `category`, `shopname`, `contactperson`, `contactno`, `isdelivery`) VALUES ('134679OE', 'Medical', 'Royal', 'Sandeep', '9638527415', 'yes');


