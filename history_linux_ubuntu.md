## Задание

# Операционные системы и виртуализация (Linux)

### 1. Использование команды cat в Linux

- Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и hamsters. Во втором — лошадей, верблюдов и ослов.

```
    cat > Pets
    cat > Pack-animals
```

- Объединить содержимое этих двух файлов в один и просмотреть его содержимое.

```
    cat Pets >> Pack-animals
```

- Переименовать получившийся файл в "Human Friends"

```
    mv Pack-animals HumanFriends.txt
```

### 2. Работа с директориями в Linux

- Создать новую директорию и переместить туда файл "Human Friends".

```
    mkdir newDir
    mv HumanFriends.txt ~/newDir/
    tree
```

### 3.Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”

- Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.

```
    ($ sudo apt-add-repository https://dev.mysql.com/get/mysql-apt-config_0.8.29-1_all.deb
    sudo apt update) ошибка 404 и по этому решил через деб пакеты установить
    $ sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
    $ sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
    $ sudo apt-get update
    $ sudo apt-get install mysql-server
```

### 4. Управление deb-пакетами

- Установить и затем удалить deb-пакет, используя команду `dpkg`.

```
    $ sudo apt download zip
    $ sudo dpkg -i zip_3.0-12build2_arm64.deb
    $ sudo dpkg -l zip
    $ sudo dpkg -r zip
    $ sudo dpkg -l zip

```
