CREATE OR REPLACE VIEW name_and_phone_numbers AS
    SELECT last_name, first_name, phone_number
    FROM person_data JOIN contact c ON c.id = person_data.contact_id