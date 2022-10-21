CREATE TABLE IF NOT EXISTS couscous
(
    id
    UUID
    NOT
    NULL
    PRIMARY
    KEY,
    name
    VARCHAR
(
    132
)
    );

CREATE TABLE IF NOT EXISTS ingredient
(
    id
    UUID
    NOT
    NULL
    PRIMARY
    KEY,
    name
    VARCHAR
(
    132
),
    type
    VARCHAR
(
    132
),
    couscous_id UUID REFERENCES couscous
(
    id
)
    );