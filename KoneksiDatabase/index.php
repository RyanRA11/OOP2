<?php
include_once 'dbkoneksi.php';
?>
<html>
    <head>
        <title>CRUD</title>
    </head>
    <body>
        <h2>CRUD</h2>
        <table>
            <tr bgcolor="silver" align="center">
                <td><b>Nama</b></td>
                <td><b>NPM</b></td>
                <td><b>Jurusan</b></td>
            </tr>
            <?php
            $query = "SELECT * FROM tbdata";
            $result_set = mysqli_query($koneksi, $query);
            while ($row = mysqli_fetch_row($result_set)) {
                ?>
                <tr>
                    <td><?php echo $row[1]; ?></td>
                    <td><?php echo $row[2]; ?></td>
                    <td><?php echo $row[3]; ?></td>
                </tr>
                <?php
            }
            ?>
        </table>
        <br><br>
        <a href="simpan.php">Tambah Data</a>
    </center>
</body>
</html>
