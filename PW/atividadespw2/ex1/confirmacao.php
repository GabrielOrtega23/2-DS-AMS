<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="confirmação.css">
    <title>exercicio1</title>
</head>
<body>
            <?php
                $numero = $_POST["numero"];
                
                $r1 = $numero * 1;
                $r2 = $numero * 2;
                $r3 = $numero * 3;
                $r4 = $numero * 4;
                $r5 = $numero * 5;
                $r6 = $numero * 6;
                $r7 = $numero * 7;
                $r8 = $numero * 8;
                $r9 = $numero * 9;
                $r10 = $numero * 10;

            ?>
    <div class = "bloco">
      <ul class="lista">
      <li><?php echo $numero . " x 1 = " . $r1; ?></li>
    <li><?php echo $numero . " x 2 = " . $r2; ?></li>
    <li><?php echo $numero . " x 3 = " . $r3; ?></li>
    <li><?php echo $numero . " x 4 = " . $r4; ?></li>
    <li><?php echo $numero . " x 5 = " . $r5; ?></li>
    <li><?php echo $numero . " x 6 = " . $r6; ?></li>
    <li><?php echo $numero . " x 7 = " . $r7; ?></li>
    <li><?php echo $numero . " x 8 = " . $r8; ?></li>
    <li><?php echo $numero . " x 9 = " . $r9; ?></li>
    <li><?php echo $numero . " x 10 = " . $r10; ?></li>
           
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </ul>
    </div>

    


</body>
</html>