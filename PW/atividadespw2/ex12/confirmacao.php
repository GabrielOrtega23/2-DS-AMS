<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="confirmacao.css">
    <title>exercicio4</title>
</head>
<body>
            <?php
                $num1 = $_POST["num1"];
                $num2 = $_POST["num2"];
                
               

            ?>
<div class = "bloco">
    <div class="voltar">
    <a href="index.html">Retornar</a>
</div>
<div class="lista">

<?php

if($num1 > $num2){
    $maior = $num1;
    $menor = $num2;
}
else{
    $maior = $num2;
    $menor = $num1;
}

for($i = $maior; $i >= $menor; $i--){

    if($i % 2 != 0){

        echo "<div class='numero'>$i</div>";

    }

}

?>

</div>

    </div>

    


</body>
</html>