# Api personneDTO

Le projet utilise gradle mais globalement c'est la meme avec maven.

Le repository est disponible avec JDBC ou JPA.

## BDD

database name : test

Importer les tables & données avec le fichier test.sql.
Modifier le fichier application.properties en fonction de vos parametres mysql.

## API

### List personneDTO

```shell
curl --location --request GET 'http://localhost:8080/personneDTO'
```

### Get personneDTO

```shell
curl --location --request GET 'http://localhost:8080/personneDTO/mathisg29@gmail.com'
```

### Add personneDTO

```shell
curl --location --request PUT 'http://localhost:8080/personneDTO' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "foo@bar.com",
    "nom": "foo",
    "prenom": "bar"
}'
```

### Update personneDTO

```shell
curl --location --request POST 'http://localhost:8080/personneDTO' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "foo@bar.com",
    "nom": "foofoo",
    "prenom": "barbar"
}'
```