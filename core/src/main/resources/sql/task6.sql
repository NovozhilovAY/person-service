SELECT * FROM person_data JOIN (SELECT * FROM person_data JOIN medical_card mc ON mc.id = person_data.medical_card_id
WHERE med_status IS NULL) AS null_med_status ON null_med_status.parent_id = person_data.id;
