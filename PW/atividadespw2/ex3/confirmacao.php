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
       <p><?php echo "Média final:" . $media;  ?> </p>
        <?php

         if($media < 5){
        echo "<p>Reprovado</p>";
        }
       else{
       echo "<p>Aprovado</p>";
       }

?>
           
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>