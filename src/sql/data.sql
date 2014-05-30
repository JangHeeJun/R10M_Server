DROP SEQUENCE TOUR_LOCAL;

DROP SEQUENCE TOUR_REGION;

DROP SEQUENCE TOUR_DATA;

CREATE SEQUENCE TOUR_LOCAL INCREMENT BY 1 START WITH 1;

CREATE SEQUENCE TOUR_REGION INCREMENT BY 1 START WITH 1;

CREATE SEQUENCE TOUR_DATA INCREMENT BY 1 START WITH 1;

/* 지역(location)정보*/
INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude)
VALUES (TOUR_LOCAL.nextval, 'manager1', '강남역', '37.576037','127.027621', '0');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude)
VALUES (TOUR_LOCAL.nextval, 'manager2', '신논현역', '37.504724','127.02538', '0');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude)
VALUES (TOUR_LOCAL.nextval, 'manager3', '역삼역', '37.50081','127.036936', '0');


/* 비콘 지역(Beacon)정보*/
INSERT INTO region_info (region_no, region_name, uuid, major, minor, local_no)
VALUES (TOUR_REGION.nextval, '강남역', '8492e75f-4fd6-469d-b132-043-fe94921d8', '11305', '19481', '1');






/*
INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude)
VALUES (TOUR_LOCAL.nextval, 'manager1', '광화문', '37.576037','126.9769');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager2', '흥례문', '37.576955','126.976884');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager3', '근정전', '37.578566','126.976954');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager4', '사정전', '37.579102','126.977008');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager5', '침전', '37.579561','126.97704');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager6', '향원정', '37.582337','126.977008');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager7', '경회루', '37.579736','126.975956');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager7', '동궁', '37.578911','126.978172');

/* 비트아카데미 별관 근처 정보*/
INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager8', '비트컴퓨터', '37.494618','127.027593');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager9', '강남역5번출구', '37.495518','127.028496');

INSERT INTO local_info (local_no, manager_id, local_name, gps_x, gps_y)
VALUES (TOUR_LOCAL.nextval, 'manager10', '삼성전자', '37.496631','127.026948');

/* 데이터 정보 */
/* data_type 1 text , 2 image, 3 voice, 4 vod*/
INSERT INTO data_info (data_no, data_path, data_type, local_no)
VALUES (TOUR_DATA.nextval, '광화문.jpg', '2', '1');
INSERT INTO data_info (data_no, data_path, data_type, local_no, region_no)
VALUES (TOUR_DATA.nextval, '광화문', '1', '1', '1');
INSERT INTO data_info (data_no, data_path, data_type, local_no, region_no)
VALUES (TOUR_DATA.nextval, 'Path3', '3', '1', '1');
INSERT INTO data_info (data_no, data_path, data_type, local_no)
VALUES (TOUR_DATA.nextval, 'Path4', '1', '2');
INSERT INTO data_info (data_no, data_path, data_type, local_no)
VALUES (TOUR_DATA.nextval, '흥례문.jpg', '2', '2');
INSERT INTO data_info (data_no, data_path, data_type, local_no, region_no)
VALUES (TOUR_DATA.nextval, '근정전.jpg', '2', '3', '3');
*/