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
                
                $variavel = $num1;
                $num1 = $num2;
                $num2 = $variavel;

            ?>

    <div class = "bloco">
      <div class="lista">
       <?php
        echo "A = " . $num1 . "<br>";
        echo "B = " . $num2;
            ?>
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>