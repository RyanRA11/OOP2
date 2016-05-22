<html>
    <head>
        <title>PHP</title>
    </head>
    <body>
        <h1>My First PHP Page</h1>
        <?php
        
        //variabel
        $y = 7;
        $z = 3;
        $hasil = $y * $z;
        echo $hasil . "<br><br>";
        
        //sensitive
        $color = "red";
        echo "My car is " . $color . "<br><br>";
        
        //You can also use comments to leave out parts of a code line
        $x = 5 /* + 15 */ + 5;
        echo $x . "<br><br>";
        
        //jumlah huruf + spasi
        echo strlen("Hello World!") . "<br><br>"; // outputs 12
        
        //concet
        $a = "Hello";
        $b = " World";
        $c = "!";
        echo $a . $b . $c;
        
        ?>
    </body>
</html>
