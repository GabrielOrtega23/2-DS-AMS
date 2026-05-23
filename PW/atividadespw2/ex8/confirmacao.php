<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="confirmacao.css">
    <title>exercicio1</title>
</head>
<body>
            <?php
                $n1 = $_POST["num1"];
                $n2 = $_POST["num2"];
                $n3 = $_POST["num3"];
            ?>

    <div class = "bloco">
      <div class="lista">
      <?php

$maior = $n1;
$menor = $n1;

if($n2 > $maior){
    $maior = $n2;
}

if($n3 > $maior){
    $maior = $n3;
}

if($n2 < $menor){
    $menor = $n2;
}

if($n3 < $menor){
    $menor = $n3;
}

echo "Maior número: " . $maior . "<br>";
echo "Menor número: " . $menor;

?>
           
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>