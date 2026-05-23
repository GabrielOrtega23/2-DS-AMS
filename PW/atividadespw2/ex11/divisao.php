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
                $num1 = $_POST["num1"] ;
                $num2 = $_POST["num2"] ;
                
            ?>

    <div class = "bloco">
      <div class="lista">
      <?php
if($num2 == 0){

    echo "Não é possível dividir por 0";

}
else{

    $divisao = $num1 / $num2;

    echo "Divisão: " . $divisao;

}

?>
           
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>