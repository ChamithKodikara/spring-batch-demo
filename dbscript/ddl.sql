CREATE TABLE IF NOT EXISTS `batch_demo_db`.`orders`
(
    `id`         INT(11)        NOT NULL AUTO_INCREMENT,
    `order_ref`  VARCHAR(100)   NOT NULL,
    `amount`     DECIMAL(19, 2) NULL DEFAULT NULL,
    `order_date` DATETIME       NOT NULL,
    `note`       VARCHAR(1000)  NULL DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
);