INSERT INTO BRAND (ID, BRAND_NM)
VALUES
  (1, '스타벅스'),
  (2, '카페베네');

INSERT INTO COFFEE (ID, BRAND_ID, COFFEE_NM, PRICE)
VALUES
  (1, 1, '모카', 1200),
  (2, 1, '아이스 모카', 1600),
  (3, 1, '라떼', 1100),
  (4, 1, '아이스 라떼', 1500),
  (5, 2, '라떼', 1500);