/**
Inserted postgres Data DDL
 */
 CREATE SCHEMA finance

CREATE TABLE finance.budget (
  bud_key_id INTEGER PRIMARY KEY NOT NULL,
  bud_description CHARACTER VARYING(255),
  bud_category CHARACTER VARYING(255),
  bud_budgeted_amount INTEGER,
  bud_actual_amount INTEGER
);