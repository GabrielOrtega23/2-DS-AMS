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
                $num1 = $_POST["num1"];
                $num2 = $_POST["num2"];
                $num3 = $_POST["num3"];
                $num4 = $_POST["num4"];
                 
               $media = ($num1 + $num2 + $num3 + $num4) / 4;
            ?>

    <div class = "bloco">
      <div class="lista">
      <?php

echo "Média: " . $media . "<br>";

if($media >= 6){
    echo "Aprovado";
}
else if($media < 3){
    echo "Retido";
}
else{
    echo "Exame";
}

?>
           
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>