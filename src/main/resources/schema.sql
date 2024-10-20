DROP TABLE IF EXISTS TBL_ASSET;
DROP TABLE IF EXISTS TBL_ORDER;
DROP TABLE IF EXISTS TBL_USER;
DROP TABLE IF EXISTS TBL_TOKEN;

CREATE TABLE TBL_ASSET
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    assetName  VARCHAR(250) NOT NULL,
    size       BIGINT,
    usableSize BIGINT DEFAULT 0
);


CREATE TABLE TBL_ORDER
(
    id    INT AUTO_INCREMENT PRIMARY KEY,
    customerId INT          NOT NULL,
    assetName  VARCHAR(250) NOT NULL,
    orderSide  VARCHAR(250) NOT NULL,
    size       BIGINT       NOT NULL,
    price      DECIMAL      NOT NULL,
    status     VARCHAR(50)  NOT NULL,
    createDate DATE         NOT NULL
);


CREATE TABLE TBL_USER
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(250) NOT NULL,
    lastname  VARCHAR(250) NOT NULL,
    email     VARCHAR(250) NOT NULL,
    password  VARCHAR(250) NOT NULL,
    role      VARCHAR(250) NOT NULL
);

CREATE TABLE TBL_TOKEN
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    user_id    VARCHAR(250) NOT NULL,
    token_type VARCHAR(250) NOT NULL,
    token      VARCHAR(250) NOT NULL,
    expired    BOOLEAN,
    revoked    BOOLEAN
);