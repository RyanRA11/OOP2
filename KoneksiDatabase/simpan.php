<?php
include_once 'dbkoneksi.php';
?>
<html>
    <head>
        <title>CRUD</title>
    </head>
    <body>
        <h2>CRUD</h2>
        <form method="post">
            <table cellspacing="1" cellpadding="2">
                <tr>
                    <td width="100">No</td>
                    <td><input name="no" type="text" id="no" placeholder="No"></td>
                </tr>
                <tr>
                    <td width="100">Nama</td>
                    <td><input name="nama" type="text" id="nama" placeholder="Nama"></td>
                </tr>
                <tr>
                    <td width="100">NPM</td>
                    <td><input name="npm" type="text" id="npm" placeholder="NPM"></td>
                </tr>
                <tr>
                    <td width="100">Jurusan</td>
                    <td><input name="jurusan" type="text" id="alamat" placeholder="Jurusan"></td>
                </tr>
                <tr>
                    <td width="100" colspan="2" align="right">
                        <input name="simpan" type="submit" id="simpan" value="Simpan">
                    </td>
                </tr>
            </table>
            <br>
            <a href="index.php">Home</a>
        </form>
        <?php
        if (isset($_POST['simpan'])) {
            if (!get_magic_quotes_gpc()) {
                $no = addslashes($_POST['no']);
                $nama = addslashes($_POST['nama']);
                $npm = addslashes($_POST['npm']);
                $jurusan = addslashes($_POST['jurusan']);
            } else {
                $no = $_POST['no'];
                $nama = $_POST ['nama'];
                $npm = $_POST['npm'];
                $jurusan = $_POST['jurusan'];
            }
            $query = "INSERT INTO tbdata VALUES('$no','$nama','$npm','$jurusan')";
            $tambah = mysqli_query($koneksi, $query);
            if (!$tambah) {
                die('Proses gagal' . mysqli_error($koneksi));
            }
            echo "Data tersimpan <br><br>";
            $query = "SELECT Nama, NPM, Jurusan FROM tbdata";
            mysqli_close($koneksi);
        }
        ?>
    </body>
</html>
