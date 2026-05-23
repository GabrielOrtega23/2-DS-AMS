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
                
                $x = ($num1 * $num1);
                $y = ($num2 * $num2);
                $z = ($num3 * $num3);
                 
                $soma = $x + $y + $z;
               
            ?>

    <div class = "bloco">
      <div class="lista">
    <?php

     echo $x . "<br>" .
     $y . "<br>" .
     $z . "<br>" .
     "Soma dos números: " . $soma;

     ?>
        
           
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>