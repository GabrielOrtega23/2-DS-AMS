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
                $numero = $_POST["numero"];
                $porcentagem = $_POST["porcentagem"];
                $desconto = $numero * ($porcentagem / 100);
                $valorFinal = $numero - $desconto;
            ?>

    <div class = "bloco">
      <div class="lista">
       <p><?php echo "Valor final: R$ " . $valorFinal;  ?> </p>
           
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>