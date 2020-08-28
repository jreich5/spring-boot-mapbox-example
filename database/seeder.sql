USE map_test_db;

# seed locations
insert into locations (address1, address2, city, state, zip) values ('1 UTSA Circle', '', 'San Antonio', 'Texas', '78249'),
                                                                    ('18318 Sonterra Pl', '', 'San Antonio', 'Texas', '78258');

# seed things
insert into things (name, location_id) values ('UTSA Campus', 1),
                                              ('Chama Gaucha Steakhouse', 2);
